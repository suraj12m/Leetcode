class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        min=len(list1)+len(list2)
        ans=[]
        for i in range(len(list1)):
            if(list1[i] in list2):
                x=i+list2.index(list1[i])
                if(x<min):
                    min=x
                    if ans:
                        ans=[]
                    ans.append(list1[i])
                if(x==min):
                    min=x
                    ans.append(list1[i])
        return(list(set(ans)))