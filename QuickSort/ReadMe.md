Step 1: Divide
Choose some pivot element,p , and partition your unsorted array,ar , into three smaller arrays: left, right, and equal, where each element in left < p, each element in right > p , and each element in equal = p.

Challenge
Given ar and p = ar[0] , partition ar into left, right, and equal using the Divide instructions above. Then print each element in followed by each element in , followed by each element in right on a single line. Your output should be space-separated.

Note: There is no need to sort the elements in-place; you can create two lists and stitch them together at the end.

Input Format

The first line contains n (the size of ar).
The second line contains n space-separated integers describing ar (the unsorted array). The first integer (corresponding to ar[0]) is your pivot element, p.

Output Format

On a single line, print the partitioned numbers (i.e.: the elements in left, then the elements in equal, and then the elements in right). Each integer should be separated by a single space.
