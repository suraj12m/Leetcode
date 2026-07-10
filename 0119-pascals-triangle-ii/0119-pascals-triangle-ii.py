class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        l=[]
        for i in range(rowIndex+1):
            l.append([])
            for j in range(i+1):
                if(j==0 or j==i):
                    l[i].append(1)
                else:
                 l[i].append(l[i-1][j-1]+l[i-1][j])
        return l[rowIndex]