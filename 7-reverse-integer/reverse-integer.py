class Solution:
    def reverse(self, x: int) -> int:
        isNegative = False
        
        if x < 0:
            isNegative = True
            x = abs(x)
        
        result=0
        while x>0:
            result=result*10+x%10
            x=x//10
        
        if result>2**31-1:
            return 0
        return result*-1 if isNegative else result