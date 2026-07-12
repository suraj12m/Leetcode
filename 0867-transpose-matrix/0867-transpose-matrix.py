class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        n=len(matrix[0])
        ans=[]
        for i in range(n):
            a=[]
            for j in matrix:
                a.append(j[i])
            ans.append(a)
        return ans

        