public class Solution {
    public int MaxNumberOfBalloons(string text) {
        Dictionary<char, int> d = new Dictionary<char, int>();
        for (int i = 0; i < text.Length; i++){
            if(d.ContainsKey(text[i])) d[text[i]]++;
            else d[text[i]] = 1;
        }

        int min = text.Length / 7;
        foreach(char c in "balon"){
            if (!d.ContainsKey(c)) return 0;
            
            if(c == 'l' || c == 'o') d[c] = d[c] / 2;

            min = Math.Min(min, d[c]);
        }

        return(min);
    }
}
