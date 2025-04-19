#User function Template for python3

class Solution:
    def maxXor(self, arr):
        #code here
        max_xor = 0
        mask = 0
        for i in range(30, -1, -1):  # assuming 32-bit integers, starting from the MSB
            mask |= 1 << i
            prefixes = set()
            for num in arr:
                prefixes.add(num & mask)
            
            candidate = max_xor | (1 << i)
            for prefix in prefixes:
                if (prefix ^ candidate) in prefixes:
                    max_xor = candidate
                    break
        return max_xor


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        n = int(input())
        arr = list(map(int, input().split()))
        ob = Solution()
        print(ob.maxXor(arr))
        print("~")

# } Driver Code Ends