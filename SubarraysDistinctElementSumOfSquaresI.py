class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        n=len(nums)
        total=0;
        for i in range(n):
            setter=set()
            for j in range(i,n):
                setter.add(nums[j])
                total+=len(setter)**2

        return total
