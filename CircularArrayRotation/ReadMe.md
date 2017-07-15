John Watson performs an operation called a right circular rotation on an array of integers,[a0, a1, ..., an-1] . After performing one right circular rotation operation, the array is transformed from [a0, a1, ..., an-1] to [an-1, a0, .., an-2].

Watson performs this operation k times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks q queries, where each query consists of a single integer, , for which you must print the element at index m in the rotated array (i.e., the value of am).

Input Format

The first line contains 3 space-separated integers, n, k, and q, respectively.
The second line contains space-separated integers, where each integer describes array element (where 0 <= i < n) 
Each of the q subsequent lines contains a single integer denoting m.

Output Format

For each query, print the value of the element at index m of the rotated array on a new line.
