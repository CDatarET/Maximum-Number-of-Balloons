class Solution:
    def maxNumberOfBalloons(self, text):
        c = Counter(text)
        m = len(text) // 7
        for char in "balon":
            if c.get(char) == None:
                return 0
            else:
                if char == "o" or char == "l":
                    c[char] //= 2
                
                m = min(m, c[char])
        
        return m
