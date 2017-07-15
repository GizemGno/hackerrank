Watson gives Sherlock an array A of length n. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.
Formally, find an i, such that,
A0+ A1 + ... + A-1 = A(i+1) + A(i+2) + ... + A(n-1).

Input Format

The first line contains T, the number of test cases. For each test case, the first line n contains , the number of elements in the array A. The second line for each test case contains n space-separated integers, denoting the array A. 

Output Format

For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO. 
