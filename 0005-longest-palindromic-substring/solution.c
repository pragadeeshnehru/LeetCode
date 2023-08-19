char *longestPalindrome(char *s) {
    int n = strlen(s);
    if (n == 0) return ""; // Edge case: empty string
    if (n == 1) return s; // Edge case: single character is always a palindrome

    int dp[n][n]; // 2D array to store whether substrings are palindromes
    memset(dp, 0, sizeof(dp)); // Initialize all values to 0

    int start = 0; // Starting index of longest palindromic substring found so far
    int maxLen = 1; // Length of longest palindromic substring found so far

    // All substrings of length 1 are palindromes
    for (int i = 0; i < n; i++) {
        dp[i][i] = 1;
    }

    // Check all substrings of length 2
    for (int i = 0; i < n - 1; i++) {
        if (s[i] == s[i+1]) {
            dp[i][i+1] = 1;
            start = i;
            maxLen = 2;
        }
    }

    // Check substrings of length 3 or greater
    for (int len = 3; len <= n; len++) {
        for (int i = 0; i < n - len + 1; i++) {
            int j = i + len - 1; // End index of substring
            if (s[i] == s[j] && dp[i+1][j-1]) {
                dp[i][j] = 1;
                if (len > maxLen) {
                    start = i;
                    maxLen = len;
                }
            }
        }
    }

    char* result = malloc(sizeof(char) * (maxLen + 1)); // Allocate memory for result string
    strncpy(result, s + start, maxLen); // Copy longest palindromic substring into result string
    result[maxLen] = '\0'; // Add null terminator to result string

    return result;
}

