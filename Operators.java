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

        int result = increment++; // 7 as it will first fetch the value and increment later
        System.out.println(result);

        int result1 = ++increment; // 8 as it first increment the value and fetch later
        System.out.println(result1);

        // Relational Operator
        int n = 7;
        int m = 5;
        int add = n + m;
        System.out.println(add); // 12

        int sub = n - m;
        System.out.println(sub); // 2

        int mul = n * m;
        System.out.println(mul); // 35

        int div = n / m;
        System.out.println(div); // 1

        // Relation Operator

        int x = 5;
        int y = 5;

        boolean g = x > y;
        System.out.println(g); // True

        boolean l = x < y;
        System.out.println(l); // False

        boolean e = x == y;
        System.out.println(e); // False

        boolean ne = x != y; // not equal to operator
        System.out.println(ne); //

        // * Logical Operators
        // todo : && AND , || OR , ! NOT
        int a = 7;
        int b = 5;
        int c = 5;
        int d = 9;
        boolean resulta = a > b && c > d; // false
        System.out.println(resulta);

        boolean resulto = a < b || c < d || a > 1;
        System.out.println(resulto); // True
        System.out.println(!resulto); // False

    }

}
