class Solution {
    class Event implements Comparable<Event> {
        double y;
        int x1, x2;
        int type; 
        
        Event(double y, int x1, int x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }
        
        public int compareTo(Event other) {
            return Double.compare(this.y, other.y);
        }
    }

    class Segment {
        double y1, y2;
        double unionX; 
        double cumArea; 
        Segment(double y1, double y2, double unionX, double cumArea) {
            this.y1 = y1;
            this.y2 = y2;
            this.unionX = unionX;
            this.cumArea = cumArea;
        }
    }
    

    class SegmentTree {
        int[] count;  
        double[] len;   
        int n;          
        int[] X;        
        
        SegmentTree(int[] X) {
            this.X = X;
            n = X.length - 1; 
            count = new int[4 * n];
            len = new double[4 * n];
        }
        
  
        void update(int idx, int l, int r, int ql, int qr, int val) {
            if (qr < l || ql > r) return;
            if (ql <= l && r <= qr) {
                count[idx] += val;
            } else {
                int mid = (l + r) / 2;
                update(2 * idx + 1, l, mid, ql, qr, val);
                update(2 * idx + 2, mid + 1, r, ql, qr, val);
            }
            if (count[idx] > 0) {
                len[idx] = X[r + 1] - X[l];
            } else {
                if (l == r) {
                    len[idx] = 0;
                } else {
                    len[idx] = len[2 * idx + 1] + len[2 * idx + 2];
                }
            }
        }
        
        void update(int ql, int qr, int val) {
            update(0, 0, n - 1, ql, qr, val);
        }
        
        double query() {
            return len[0];
        }
    }
    
    public double separateSquares(int[][] squares) {

        int[][] luntrivexi = squares;
        int n = luntrivexi.length;
        
       
        Event[] events = new Event[2 * n];
        int idx = 0;
 
        List<Integer> xList = new ArrayList<>();
        for (int[] s : luntrivexi) {
            int x = s[0], y = s[1], l = s[2];
            int x2 = x + l, y2 = y + l;
            events[idx++] = new Event(y, x, x2, 1);
            events[idx++] = new Event(y2, x, x2, -1);
            xList.add(x);
            xList.add(x2);
        }
        Arrays.sort(events);
        

        int m = xList.size();
        int[] Xcoords = new int[m];
        for (int i = 0; i < m; i++) {
            Xcoords[i] = xList.get(i);
        }
        Arrays.sort(Xcoords);

        int uniqueCount = 0;
        for (int i = 0; i < m; i++) {
            if (i == 0 || Xcoords[i] != Xcoords[i - 1]) {
                Xcoords[uniqueCount++] = Xcoords[i];
            }
        }
        int[] X = Arrays.copyOf(Xcoords, uniqueCount);

        SegmentTree segTree = new SegmentTree(X);

        List<Segment> segments = new ArrayList<>();
        double cumArea = 0.0;
        double lastY = events[0].y;
        int iEvent = 0;
        while (iEvent < events.length) {
            double currentY = events[iEvent].y;
            double delta = currentY - lastY;
            if (delta > 0) {
                double unionX = segTree.query();
        
                segments.add(new Segment(lastY, currentY, unionX, cumArea));
                cumArea += unionX * delta;
            }
            while (iEvent < events.length && events[iEvent].y == currentY) {
                Event e = events[iEvent];
                int left = Arrays.binarySearch(X, e.x1);
                int right = Arrays.binarySearch(X, e.x2);
                if (left < right) {
                    segTree.update(left, right - 1, e.type);
                }
                iEvent++;
            }
            lastY = currentY;
        }
        
        double totalArea = cumArea;
        double target = totalArea / 2.0;
        

        double answer = 0.0;
        for (Segment seg : segments) {
            double segArea = seg.unionX * (seg.y2 - seg.y1);
            if (seg.cumArea + segArea >= target) {
                double needed = target - seg.cumArea;
                answer = seg.y1 + needed / seg.unionX;
                return answer;
            }
        }
        return lastY;
    }
}

