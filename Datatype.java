public class Datatype {
    public static void main(String args[]) {

        // * Datatypes */

        // Primitive DataType
        int num1 = 9;
        System.out.println(num1);

        byte by = 127;
        System.out.println(by);

        short sh = 558;
        System.out.println(sh);

        long lg = 58400l; // whenever we use long value always use 'L' at the end
        System.out.println(lg);

        float g = 5.8f; // whenever we use float value always use 'f' at the end
        System.out.println(g);

        double d = 5.8;
        System.out.println(d);

        char c = 'k'; // !we cannot put ""
        System.out.println(c);

        boolean b = true;
        System.out.println(b);

        // ** Type Conversion and Casting */
        // ** we cannot change the type of a varaiable but we can change the type of
        // value */

        byte b1 = 127;
        int a1 = b1;
        System.out.println(a1);

        float f = 5.6f;
        int a = (int) f;
        System.out.println(a); // output : 5 not 5.6

        int num4 = 2;
        int num5 = 5;
        int result1 = num4 % num5; // we can also do + - / *
        System.out.println(result1);

    }

}
