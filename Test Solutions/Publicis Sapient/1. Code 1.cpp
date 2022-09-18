/* 1. Subsegment Sort 
An array of n integers, arr[n] can be partitioned into any number of contiguous subsegments. Every element must present in exactly 1 partition.
After partitioning and without changingthe order of partitions, sort each partition in non-descending order. Concatenate the sorted partitions and compare the resulting 
array to the original array, sorted non-descending. If the two match, the set of partitions is valid.

Find the maximum number of contiguous subsegments in which the array arr canbe partitioned such that the set of partitions is valid.

Example:
n=6
arr =[2,5,1,9,7,6]
The array can be divided into 2 contiguous subsegments: Subsegments -> [2,5,1], [9,7,6]
Sorted Susegments -> [1,2,5], [6,7,9]
Final array -> [1,2,5,6,7,9]
As the final arr is sorted, 2 is a possible answer.

Function Description
Complete the function findMaxSubsegmentsCount in the editor below

findMaxSubsegmentsCount has the following parameter(s):
int arr[n]: the array of integers to partition

Returns
int: the maximum number of contiguous subsegments in a valid set of partitions

Constraints
1<= n <= 10^5
1<=arr[i]<=10^5

Sample Case 0
stdin: 4     2 10 5 9
Function: n=4, arr =[2, 10, 5, 9]
Explanation: Subsegment after partition -> [2], [10,5,9]
             Sorted subsegments ->[2], [5,9,10]
             Final array ->[2, 5, 9, 10](Sorted)
