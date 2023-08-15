/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
*/
boolean solution(int[] nums) {
    int count=0;
    int p=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1] || nums[i]==nums[i+1]) {
            count++;
            p=i;
        }
    }
    if(count>1) return false;
    else if(count==1){
        if(p==0 || p== nums.length-2) return true;
        if(nums[p+1]>nums[p-1] || nums[p+2]>nums[p]) return true;
        else return false;
    }
    return true;
}
