class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        x=len(candyType)//2
        c=len(set(candyType))
        if(c<x):
            return c
        return x

        