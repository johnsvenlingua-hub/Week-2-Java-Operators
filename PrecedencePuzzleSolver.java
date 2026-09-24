public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        // --- EXPRESSION 1 ---
        int a = 5, b = 10, c = 2;
        // PREDICTED RESULT: true
        // Step-by-step breakdown:
        // 1. Postfix increment: a++ evaluates to 5 (a becomes 6).
        // 2. Arithmetic multiplication: 5 * 2 = 10.
        // 3. Relational comparison: 10 > 10 is false.
        // 4. Logical NOT: !false is true.
        // 5. Logical OR: true || ... short-circuits to true.
        boolean result1 = ! (a++ * c > b) || ++b < 15;
        System.out.println("Expression 1 Actual Result: " + result1);


        // --- EXPRESSION 2 ---
        int x = 4, y = 3;
        // PREDICTED RESULT: 19
        // Step-by-step breakdown:
        // 1. Multiplication (*): 4 * 3 = 12.
        // 2. Addition and Subtraction (+, -) from left to right:
        //    a. 10 + 12 = 22
        //    b. 22 - 3 = 19
        int result2 = 10 + x * y - y;
        System.out.println("Expression 2 Actual Result: " + result2);


        // --- EXPRESSION 3 ---
        int p = 8, q = 4;
        // PREDICTED RESULT: false
        // Step-by-step breakdown:
        // 1. Division (/): 8 / 4 = 2.
        // 2. Relational equality (==): 2 == 2 is true.
        // 3. Prefix decrement (--q): q becomes 3.
        // 4. Relational inequality (!=): 3 != 3 is false.
        // 5. Logical AND (&&): true && false evaluates to false.
        boolean result3 = p / q == 2 && --q != 3;
        System.out.println("Expression 3 Actual Result: " + result3);
    }
}
