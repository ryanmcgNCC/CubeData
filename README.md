# CubeData
This project aims to calculate the number of cube states that take 0-X moves to solve given X permutations 
on a solved Rubik's Cube.
First, I represent all the colors on a Rubik's Cube as numbers 0-5 in an array
The array in question represents the state of a Rubik's Cube by essentially "unfolding" a cube so it looks
like a cross.
I.E., a solved cube would be in an array that looked like:
{0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5},
where the 0's represent red tiles, the 1's represent green tiles, the 2's represent yellow tiles, the 3's represent
blue tiles, the 4's represent orange tiles and the 5's represent white tiles, and the cross is read left to right and
top to bottom in order.
When creating these arrays, I add one extra index at the end which is filled with a number that represents
the amount of permutations being performed on the cube before attempting to solve it. That way, when its eventual
result is stored in my data structure, if/when that result is found later, I know the minimum amount of moves it
would take to solve that particular result. With this information, I can set the program up to increment
appropriately.

For example, when performing exactly 2 moves on a solved Rubik's Cube, the aim of this project is to tell me how 
many of the possible results (18 possible permutations raised to the 2nd power since we're performing 2 
moves = 324 total possible results) can be solved in 0, 1, or 2 moves, as well as how many of the results that 
take 2 moves are unique (It is possible to do two different sets of 2 moves and end up with the same cube 
states, this state would only need to be counted once for my purposes). It turns out that for exactly 2 moves, there
are 18 cases where the result can be solved in minimally 0 moves, there are 36 cases where the result can be solved in 
minimally 1 move, and there are 243 unique cases where the result can be solved in minimally 2 moves. There are also
27 other cases where the result can be solved in minimally 2 moves, but these 27 are not unique (they're repeats of
some of the 243 unique cases).
When performing exactly 5 moves on a solved Rubik's Cube, the result should tell me how many of the possible 
results (18^5 = 1,889,568 total possible results)can be solved in minimally 0, 1, 2, 3, 4, and 5 moves, as 
well as the amount of results that take 5 moves and are not unique.

I attempt to do this by creating methods for each of the 18 possible permutations which manipulate the array to
reflect the new state of the Rubik's Cube after that permutation is performed on it. I also created methods which
re-orient the Rubik's Cube to a standard state. The idea behind this is that when a result is entered into the data
structure, if it isn't oriented correctly, even if a match is created, it won't be found because it isn't facing the
right way. Next, I set up a method that takes an input (which is incremented with a loop in the main method so as to
run through every possibility) and performs the appropriate permutation on the Rubik's Cube. I have global variables
that will be used to increment under the right scenarios so as to count correctly, as well as a print method that
prints my results, and a reset method which resets the counters once I move on to the next amount of permutations to
be performed on the Rubik's cube.

The point of this program is to derive this information with the hopes that a pattern emerges such that an equation
can be formed to mathematically prove God's number is 20. Essentially, I'm trying to create an equation that given
an x value, will output the amount of unique cases that can be solved in x moves. So, in reference to the earlier
example, if I put 2 into this equation, it should output 243. The set up of the equation is that it starts by
accounting all possibilities (18^x), then it subtracts all the cases that can be solved in fewer moves, as well as all
the cases that are not unique, leaving the result which is the count of unique cases that minimally take x moves to
solve the Rubik's cube. My hope is that with this equation, I can show that the summation of the results of this 
equation from x values 0 through 20 will result in the total amount of possible Rubik's Cube states, which is
8! * 3^7 * (12!/2) * 2^11, or 43,252,003,274,489,856,000.

Since God's number has already been proven to be 20 on a 3x3x3 cube using a brute force/proof by cases strategy,
the true hope of this program is to establish a methematical principle to solve God's number for any NxNxN sized cube.
