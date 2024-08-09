
Create a class `Player` with the following attributes:

- `playerId` - int
- `playerName` - String
- `runs` - int
- `playerType` - String
- `matchType` - String

The above attributes should be private. Write getters, setters, and a parameterized constructor as required.

Create a class `Solution` with a `main` method.

Implement two static methods - `findPlayerWithLowestRuns` and `findPlayerByMatchType` in the `Solution` class.

### `findPlayerWithLowestRuns` method:
- This method will take an array of `Player` objects and a `String` value as input parameters.
- The method will return the least runs of the Player from the array of `Player` objects for the given player type (String parameter passed).
- If no Player with the above condition is present in the array of `Player` objects, then the method should return `0`.

### `findPlayerByMatchType` method:
- This method will take an array of `Player` objects and a `String` value as input parameters and return the array of `Player` objects belonging to the match type passed as the input parameter, in descending order of `playerId`.
- If no Player with the above condition is present in the array of `Player` objects, then the method should return `null`.

### Additional Notes:
- No two Players will have the same `playerId` and `runs`.
- All the searches should be case insensitive.
- The above-mentioned static methods should be called from the `main` method.

For the `findPlayerWithLowestRuns` method:
- The `main` method should print the returned runs as it is if the returned value is greater than `0`, or it should print "No such player."

Example Output:

25

where `25` is the lowest runs of the Player.

For the `findPlayerByMatchType` method:
- The `main` method should print the `playerId` from the returned Player array for each Player if the returned value is not `null`.
- If the returned value is `null`, then it should print "No Player with given matchType."

Example Output:

13
11

where `13` and `11` are the `playerId`s.

Before calling these static methods in the `main` method:
- Use a `Scanner` object to read the values of four `Player` objects referring to the attributes in the above-mentioned attribute sequence.
- Next, read the value of two `String` parameters for capturing `playerType` and `matchType`.

### Consider the below sample input and output:

Input 1:

11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
State
One day


Output 1:

67
14
11


Input 2:

11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
District
T20


Output 2:

No such player
No Player with given matchType


### Sample Code Snippet for Reference:

Please use the following code to build your solution:

java
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        // Code to read values
        // Code to call the required methods
        // Code to display the result
    }

    // Code the first method

    // Code the second method
}

// Code the Player class


### Note on Using Scanner Object:
Sometimes `Scanner` does not read the newline character while invoking methods like `nextInt()`, `nextDouble()`, etc. Usually, this is not an issue, but this may be visible while calling `nextLine()` immediately after those methods.

Consider the below input values:

1001
Savings


Referring to the below code:
java
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); // Here we expect str to have value "Savings". Instead, it may be "".


If the above issue is observed, then it is suggested to add one more explicit call to `nextLine()` after reading the numeric value.
