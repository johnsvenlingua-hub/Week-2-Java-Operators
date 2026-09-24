public class CompoundGrowthTracker {
    public static void main(String[] args) {
        double balance = 1000.0;
        System.out.println("Initial Balance: $" + balance);

        balance += 250.0;
        System.out.println("Step 1 (after += 250.0): $" + balance);

        balance *= 1.10;
        System.out.println("Step 2 (after *= 1.10): $" + balance);

        balance += 500.0;
        System.out.println("Step 3 (after += 500.0): $" + balance);

        System.out.println("\n=== INCREMENT OPERATOR DEMO ===");

        int count = 5;
        System.out.println("Initial count: " + count);

        System.out.println("Result of count++ inside println: " + count++);
        System.out.println("Value of count immediately after count++: " + count);

        /* Note on Postfix vs Prefix:
        count++ (postfix) evaluates to the CURRENT value of count first before incrementing it. Therefore, println outputs 6, but count becomes 7 immediately afterward.
        ++count (prefix) increments the value of count FIRST, then returns the NEW updated value. Therefore, println outputs 8, and count remains 8 afterward. */

        System.out.println("Result of ++count inside println: " + ++count);
        System.out.println("Value of count immediately after ++count: " + count);
    }
}
