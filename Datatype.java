public class Datatype {
    public static void main(String args[]) {

        // * Datatypes */

        // Primitive DataType
        int num3 = 9;
        byte by = 127;
        short sh = 558;
        long lg = 58400l; // whenever we use long value always use 'L' at the end

        float g = 5.8f; // whenever we use float value always use 'f' at the end
        double d = 5.8;

        char c = 'k'; // !we cannot put ""

        boolean b = true;

        // ** Type Conversion and Casting */
        // ** we cannot change the type of a varaiable but we can change the type of
        // value */

        byte b1 = 127;
        int a1 = b1;
        System.out.println(a1);

        float f = 5.6f;
        int a3 = (int) f;
        System.out.println(a3); // output : 5 not 5.6

        int num4 = 2;
        int num5 = 5;
        int result1 = num4 % num5; // we can also do + - / *
        System.out.println(result1);

    }

}
