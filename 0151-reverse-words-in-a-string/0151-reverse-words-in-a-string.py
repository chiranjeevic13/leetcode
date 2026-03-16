class Solution:
    def reverseWords(self, s: str) -> str:
        i=len(s)-1
        words=[]

        while i>=0:

            if s[i]==" ":
                i-=1
                continue
            
            j=i
            while (j>=0 and s[j]!=" "):
                j-=1
            
            words.append(s[j+1:i+1])

            i=j-1
        
        return " ".join(words)
