# scala_recursion #

This project is intended to practice "**Recursion**" and delve into the concept


All the problems are addressed in a *recursive* and often *tail recursive* way

Observed pattern to think recursively:

1. identify a base pattern
2. find the actual logic to solve it
3. bundle it into an inner method and make the call




#### Example: Lets calculate the sum of the digits of a number (n) _recursively_ ####


###### Step 1: Finding the base case ######

- start thinking n = 0 (or, n = 1 if 0 does not serve). For n = 0, the sum will be 0.
  Therefore, if n = 0, sum = 0 (yeah! found the base case!!)
  where, n is the number and sum is the sum of all it's digits.
  
- the base case must not be
   `case 0 => 0`
   must be
   `case 0 => sum`
   
###### Step 2: Finding the recursive case, the actual logic and put it in an accumulator ######

- see the below snippet
    `case _  => go(n/10, sum + n%10) `
  It makes a recursive call (tail recursive**) with 2 args:
     * first arg: n : playing with n to change it someway (decrementing, incrementing, dividing etc.) and pass it in the
       next recursive call such that it becomes 0 at some point and it meets the base case.
     * second arg: sum : actual logic is calculated here. n has a new value everytime
       Do some operation on n and mix it with sum(acc) to form a new sum(acc). 
       This sum(acc) is returned when the base case meets.
        
###### Step 3: Call the inner method with appropriate args ######
        
- call the inner mthod from the outer method with n = the actual n and accumulator(sum here) as 0.


> ** tail-recursive because its the last method call which is recursive an does not perform any other function
     other than calling it again.
   
     
###### Find the entire code below ######
            
     object SumOfDigits extends App{ 
        def findSum(rowNum: Int): Int = {
           def go(n: Int, sum: Int): Int = {
             n match {
               case 0 => sum // pattern 1: base case
               case _  => go(n/10, sum + n%10) // pattern 2: always, recursive methodName(decrementor/looping, actual calc logic)
             }
           }
           go(rowNum, 0)
         }
       }



