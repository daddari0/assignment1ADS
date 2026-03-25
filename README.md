**Algorithms and Data Structures**  
**Assignment 1: Recursion**

**1. Write and test a recursive function that returns the sum of the squares of the
first n positive integers.**

1  
2 + 2  
2 + … + 𝑛  
2  
Sample Input: n = 4  
Sample Output: 1  
2 + 2  
2 + 3  
2 + 4  
2 = 30  

**2. Write and test a recursive function that returns the sum of the first n
elements of an array.**

**3. Write a recursive method to compute the sum of the first n positive integers.**

**4. Write and test a recursive function that returns the sum of the first n powers
of a base b.**

𝑏  
0 + 𝑏  
1 + 𝑏  
2 + … + 𝑏  
𝑛  
Sample Input: b = 4, n = 3  
Sample Output: 4  
0 + 4  
1 + 4  
2 + 4  
3 = 85  

**5. Given a positive integer N and a sequence of N elements. You have to
display given sequence in reverse order.**  
Note. The program is forbidden to declare arrays, and use the cycles (even
for input).  
Sample Input: 3  
1 2 3  
Sample Output: 3 2 1  

**6. Given a positive integer N and a sequence of N strings. You have to display
given sequence in reverse order.**  
Note. The program is forbidden to declare arrays (only one char array in
function is allowed), and use the cycles (even for input).  
Input: First line contains n (1<=n<=100). The next n lines contain onedimension char arrays. Array is no longer that 20 symbols.  
Output: The sequence of element in reverse order.  
Sample Input:  
3  
Abc  
bcdh  
abcdef  
Sample Output:  
abcdef  
bcdh  
abc  

**7. Print the square that consists of NxN cells filled with numbers from 1 to
N*N in a spiral mode (see examples).**  
Note. Use recursion for solving this problem.  
Sample Input 1:  
3  
Sample Output 1:  
1 2 3  
8 9 4  
7 6 5  
Sample Input 2:  
4  
Sample Output 2:  
1 2 3 4  
12 13 14 5  
11 16 15 6  
10 9 8 7  

**8. Given two positive integers n and k. Your task is to output all sequences
like: x1, x2, ..., xN such that xi - natural and 1<=xi<=k.**  
Note. Use recursion for solving this problem.  
Sample Input 1:  
2 3  
Sample Output 1:  
1 1  
1 2  
1 3  
2 1  
2 2  
2 3  
3 1  
3 2  
3 3  
Sample Input 2:  
3 3  
Sample Output 2:  
1 1 1  
1 1 2  
1 1 3  
1 2 1  
1 2 2  
1 2 3  
1 3 1  
1 3 2  
1 3 3  
2 1 1  
2 1 2  
2 1 3  
2 2 1  
2 2 2  
2 2 3  
2 3 1  
2 3 2  
2 3 3  
3 1 1  
3 1 2  
3 1 3  
3 2 1  
3 2 2  
3 2 3  
3 3 1   
3 3 2  
3 3 3  

**9. Given a string (one dimention char array) consisting of M distinct symbols.
Print all the permutations (all possible variants) of the symbols of this string.**  
Sample Input 1:  
AB  
Sample Output 1:  
ABBA  
Sample Input 2:  
IOX  
Sample Output 2:  
XOI  
OIX  
IXO  
XIO  
OXI  
IOX  

**10. For the following task:  
• Any other libraries except very basic ones are NOT allowed.  
• Global and Static variables are not allowed.  
• You can’t add more parameters or call helper functions.**  
Power of two. Given 1 parameter - an integer n, return true if it is a power of
two. Otherwise, return false.  
An integer n is a power of two, if there exists an integer x such that n = 2
