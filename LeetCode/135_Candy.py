class Solution:
    def candy(self, ratings: List[int]) -> int:
        n = len(ratings)
        cadies = [1] * n

        for i in range(1,n):
            if ratings[i] > ratings[i-1]:
                cadies[i] = cadies[i-1] + 1 

        for i in range(n - 2, -1, -1):
            if ratings[i] > ratings [i+1]:
                cadies[i] = max(cadies[i], cadies[i+1] + 1)
        
        return sum(cadies)
