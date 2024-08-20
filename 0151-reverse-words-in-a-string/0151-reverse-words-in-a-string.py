class Solution(object):
    def reverseWords(self, s):
        
        i = 0
        j = len(s) - 1
        while i <= j and s[i] == ' ':
            i += 1
        while j >= i and s[j] == ' ':
            j -= 1
        
        words = []
        word = ''
        while i <= j:
            if s[i] != ' ':
                word += s[i]
            else:
                if word:
                    words.append(word)
                    word = ''
            i += 1
        
        if word:
            words.append(word)
        
        out = []
        for k in range(len(words) - 1, -1, -1):
            out.append(words[k])
        
        result = ''
        for k in range(len(out)):
            if k > 0:
                result += ' '
            result += out[k]
        
        return result