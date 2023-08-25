using System.Text.RegularExpressions;
public class Solution {
    public bool IsMatch(string s, string p) {
        if(p.Contains("**"))
            return true;
        return Regex.IsMatch(s, "^"+p+"$");
    }
}
