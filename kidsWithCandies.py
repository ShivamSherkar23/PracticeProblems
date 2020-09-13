"""
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 

Explanation: 
Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies
the greatest number of candies among the kids. 
Kid 2 has 3 candies and if he or she receives at least 2 extra
candies will have the greatest number of candies among the kids. 
Kid 3 has 5 candies and this is already the greatest number of candies among the kids. 
Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies. 
Kid 5 has 3 candies and if he or she receives at least 
2 extra candies will have the greatest number of candies among the kids. 

"""

def kidsWithCandies(candies, extraCandies):
        result = []
        for i in range(len(candies)):
            great = max(candies)
            if candies[i] + extraCandies > great:
                result.append(True)
            elif candies[i] + extraCandies == great:
                result.append(True)
            else:
                result.append(False)    
        return result 

def main():
    candies = [2,3,5,1,3]
    extraCandies = 3
    result = kidsWithCandies(candies,extraCandies)
    print(result)


if __name__=="__main__":
    main()        