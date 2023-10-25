class Hello {

    public static void main(String a[]) {

        int num1 = 3; // todo creating varaible - datatype variablename = value
        int num2 = 6;
        int result = num1 + num2;
        System.out.println(result);
        System.out.println("Hello World"); // **println is used when we print the value to the next line */
        System.out.println(1 + 2);

        // Datatypes

        // Primitive DataType
        int num3 = 9;
        byte by = 127;
        short sh = 558;
        long lg = 58400l; // whenever we use long value always use 'L' at the end

        float g = 5.8f; // whenever we use float value always use 'f' at the end
        double d = 5.8;

        char c = 'k'; // !we cannot put ""

        boolean b = true;

        // Type Conversion and Casting
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

    }

}