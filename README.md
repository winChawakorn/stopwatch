# Stopwatch tasks by Chawakorn Suphepre (5910545671)

I ran the tasks on a HP pavilion ak007tx, and got
these results:

Task 					| Time
----------------------------------------|--------------:
Append 50,000 chars to String 		| 2.443049 sec
Append 100,000 chars to String 		| 5.023997 sec
Append 100,000 chars to StringBuilder 	| 0.006468 sec
Add 1 billion double using array 	| 4.243966 sec
Add 1 billion Double using array	| 11.330016 sec
Add 1 billion BigDecimal using array	| 20.639531 sec

## Explanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?

- Because there is more 2 times work in 100,000 chars than 50,000 chars.

Why is appending to StringBuilder so much different than appending to String? What is
happening to the String?

- Because 
