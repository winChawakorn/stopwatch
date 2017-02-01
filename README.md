# Stopwatch tasks by Chawakorn Suphepre (5910545671)

I ran the tasks on a laptop HP pavilion ak008tx, and got
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

Why does appending 100,000 'chars' to a 'String' take more than 2X the time to append 50,000 'chars'?

- Appending 100,000 'chars' doesn't take 2X time longer than appending 50,000 'chars', but it takes
  longer 2X. Because when you '+' the strings, the program will create new 'String' to indicate it.
  That's mean the program will create a new 'String' every time we use '+' and use much memories.
  When the computer use much memories, it will work slower.

Why is appending to 'StringBuilder' so much different than appending to 'String'? What is
happening to the 'String'?

- When we use '[StringBuilder_name].append', the program does't create a new 'StringBuilder' to
  indicate it. The program just append the 'chars' and replace a new word to the same
  'StringBuilder'. So they don't need to use much memories like 'String'.

Explain difference in time to sum 'double', 'Double', and 'BigDecimal'. Which is faster and
why?

- Sum the numbers in primitive 'double' is the fastest, because the program will create only
  primitive 'double'. It doesn't need to create an object to store the value.
  Moreover, primitive 'double' is the least decimal number storing. When the value of
  primitive 'double' has decimal numbers too much, This value will be rounded to nearby value.
  So it uses the least memories too.

- Sum the numbers in 'Double' is slower than primitive 'double', but faster than 'BigDecimal'.
  Because the program need to create an 'Double' object that use more time from creating
  primitive 'double', and 'Double' use less memories than 'BigDecimal'. 'Double' will round the value when
  there is too much decimal numbers too, but 'Double' can contain more decimal numbers than
  primitive 'double'. 'Double' can '+-*/' with each others but it need to be unboxed before.
  When finish '+-*/', the value will be autoboxed back to the box. That's make 'Double' work slower.

- Sum the numbers in 'BigDecimal' is the slowest, because the program need to create an object
  like 'Double'. Especially, 'BigDecimal' can contain the most decimal numbers, so 'BigDecimal'
  will use the most memories and use the most time.