class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minp=prices[0]
        p=0
        for price in prices:
            if price<minp:
                minp=price
            elif(price-minp>p):
                p=price-minp
        return p
        