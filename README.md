# PuzzleCoding
With this project we pretend to improve and develop our creative mind regarding coding,
problem solving, precise documentation. Use of a collection of programming language is valid.
At least once or twice a week function is added to the code and a Haiku is written above...

https://syllablecounter.io/poetry/haiku-checker


Example:
User A, writes a Haiku, and then implements a function or vice versa.
```
/* ======= HAIKU =======
5 Sylables sentence
7 Sylables sentence
5 Sylables sentece
*/
public boolean foo1() {
	// Function Body
}
```

User B, before writing his Haiku and implementing his function,
documents tries to write a short a description of the function
of User A.

So that at the end the result looks like this:
```
/* ======= HAIKU =======
Comment block of
USER A HAIKU
*/
/**
 * Documentation block of USER A
 * function, written by USER B
 */
public boolean foo1() {
	// Function Body
}
```

And the cycle repeats where User B, implements his function, writes a Haiku
and User A tries to document User's B function.

```
/* ======= HAIKU =======
Comment block of
USER B HAIKU
*/
/**
 * Documentation block of USER B
 * function, written by USER A
 */
public boolean foo2() {
	// Function Body
}
```