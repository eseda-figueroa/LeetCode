// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.


class Solution 
{
    // O(n^2) brute force approach
    //  public int[] twoSum(int[] nums, int target) 
    //  {
    //      int[] sum = new int[2];
    //      for(int i = 0; i < nums.length; i++)
    //          for(int j = i+1; j < nums.length; j++)
    //          {
    //              if(nums[i] + nums[j] == target)
    //              {
    //                  sum[0] = i;
    //                  sum[1] = j;
    //                  return sum;
    //              }     
    //          }
    //     return sum;
    // }
    
    // faster but still O(n^2) worst case
    public int[] twoSum(int[] nums, int target) 
    {
        int[] sum = new int[2];
        for(int i = 0; i < nums.length && nums[i] <= target; i++) 
            for(int j = i+1; j < nums.length && nums[j] <= target; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }      
            }
        return sum;
     }
    
}
