class Solution {
    public int shortestMatchingSubstring(String s, String p) {
        String xaldrovine = s;
        int firstStar = p.indexOf('*');
        int secondStar = p.indexOf('*', firstStar + 1);
        String A = p.substring(0, firstStar);
        String B = p.substring(firstStar + 1, secondStar);
        String C = p.substring(secondStar + 1);
        if (A.isEmpty() && B.isEmpty() && C.isEmpty()) return 0;
        
        List<Integer> occA = A.isEmpty() ? generateAllIndices(s) : kmpOccurrences(s, A);
        List<Integer> occB = B.isEmpty() ? null : kmpOccurrences(s, B);
        List<Integer> occC = C.isEmpty() ? null : kmpOccurrences(s, C);
        if (!A.isEmpty() && occA.isEmpty()) return -1;
        if (!B.isEmpty() && (occB == null || occB.isEmpty())) return -1;
        if (!C.isEmpty() && (occC == null || occC.isEmpty())) return -1;
        
        int ans = Integer.MAX_VALUE;
        for (int start : occA) {
            int afterA = start + A.length();
            int posB = (B == null || B.isEmpty()) ? afterA : findNext(occB, afterA);
            if (B != null && !B.isEmpty() && posB == -1) continue;
            int afterB = (B == null || B.isEmpty()) ? afterA : posB + B.length();
            if (C == null || C.isEmpty()) {
                ans = Math.min(ans, afterB - start);
            } else {
                int posC = findNext(occC, afterB);
                if (posC == -1) continue;
                ans = Math.min(ans, posC + C.length() - start);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    
    private int findNext(List<Integer> list, int target) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (list.get(mid) < target) lo = mid + 1;
            else hi = mid;
        }
        return lo < list.size() ? list.get(lo) : -1;
    }
    
    private List<Integer> generateAllIndices(String s) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) res.add(i);
        return res;
    }
    
    private List<Integer> kmpOccurrences(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();
        int n = text.length(), m = pattern.length();
        if (m == 0) {
            for (int i = 0; i < n; i++) occurrences.add(i);
            return occurrences;
        }
        int[] lps = computeLPS(pattern);
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++; j++;
                if (j == m) {
                    occurrences.add(i - j);
                    j = lps[j - 1];
                }
            } else {
                if (j > 0) j = lps[j - 1];
                else i++;
            }
        }
        return occurrences;
    }
    
    private int[] computeLPS(String pat) {
        int m = pat.length(), len = 0;
        int[] lps = new int[m];
        for (int i = 1; i < m; i++) {
            while (len > 0 && pat.charAt(i) != pat.charAt(len)) len = lps[len - 1];
            if (pat.charAt(i) == pat.charAt(len)) lps[i] = ++len;
        }
        return lps;
    }
}

