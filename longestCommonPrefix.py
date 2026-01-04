class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        length = list(map(lambda x:len(x),strs))
        short = min(length)
        ans = ""
        for i in range(short):#0123
            match = False
            for j in range(len(strs)-1):#012
                temp = strs[j][i]
                if strs[j+1][i] != temp:
                    return ans
                else:
                    match = True
            ans = ans + strs[0][i]
        return ans