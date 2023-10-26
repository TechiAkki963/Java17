public class Operators {
    public static void main(String arg[]) {

        // todo Increment
        int num6 = 7;
        // num6 = num6 + 2;
        num6 += 2; // 9
        num6 -= 2; // 7
        num6 *= 8; // 56
        num6++; // * 57 Post -Increment */
        ++num6; // * Pre - Increment*/
        num6--; // * 56 Decrement */
        System.out.println(num6); // 9

        // eg for Post and Pre Increment
        int increment = 7;

        // int result2 = increment++; // 7 as it will first fetch the value and
        // increment later
        int result2 = ++increment; // 8 as it first increment the value and fetch later
        System.out.println(result2);

        // Relational Operator
        int n = 7;
        int m = 5;
        int add = n + m;
        System.out.println(add);

    }

}
