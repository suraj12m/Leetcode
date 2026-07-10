class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        
        if((r*c) != (len(mat)*len(mat[0]))):
            return mat
        else:
            trans=[]
            for i in range(len(mat)):
                for j in range(len(mat[i])):
                    trans.append(mat[i][j])
            row=[]
            nmat=[]
            for i in range(len(trans)):
               row.append(trans[i])
               if(len(row)==c):
                   nmat.append(row)
                   row=[]

            return nmat
        