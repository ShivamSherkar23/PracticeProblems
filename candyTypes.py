class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        allowed = len(candyType)/2
        s = set()
        counter = 0
        for i in range(len(candyType)):
            if candyType[i] not in s:
                s.add(candyType[i])
                counter+=1
        if (counter == allowed):
            return int(counter)
        elif (counter < allowed):
            return int(counter)
        else:
            return int(allowed)
