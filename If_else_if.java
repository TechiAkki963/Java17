public class If_else_if {

    public static void main(String args[]) {

        int x = 8;
        int y = 7;
        int z = 16;

        if (x > y && x > z) // todo : check the condition for x
        {
            System.out.println(x);
        }
        // else if (y > x && y > z) // todo: check the condition for y
        // {
        // System.out.println(y);
        // }
        else if (y > z) // ? as we have already compared the comparison of x and y
        {
            System.out.println(y);
        } else // todo: check the condition for z
        {
            System.out.println(z);
        }

    }

}
