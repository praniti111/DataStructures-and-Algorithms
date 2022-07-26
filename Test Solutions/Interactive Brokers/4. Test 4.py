/* Find the bug(s) and modify one line of code in the incorrect implementation of a function solution that is supposed to return the samllest element of the given non-empty array
A which contains at most 1000 integers within range[-1000..1000].
Notice hthat for the example test caseA=[-1, 1, -2, 2] the attached code is already returning the correct answer(-2).
*/
def solution(A):
  ans = 0
  ans = 1000 #error
  for i in range(1, len(A)):
    if A[i] < ans:
      ans = A[i]
   return ans
