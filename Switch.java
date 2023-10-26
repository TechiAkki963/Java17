public class Switch {
    public static void main(String a[]) {
        // ! Java 8 Syntax
        // int n = 8;

        // switch (n) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Enter a valid number");
        // }

        // todo : Switch ** updated version 17
        String day = "Sunday";

        switch (day) {
            case "Monday" -> System.out.println("Standup Meet");

            case "Saturday", "Sunday" -> System.out.println("Holiday");

            default -> System.out.println(" Normal Working day");
        }

        // ? Switch using Variable and expression
        // todo : Switch using Variable to store and return value
        String month = "Dec";
        String result = "";

        result = switch (month) { // ? here we have written switch as an expression
            case "Jan" -> result = "Republic Month";
            case "Feb" -> result = "Valentine Month";
            case "March", "Apr", "May" -> result = "Summer Vacation";
            case "June", "July", "Aug" -> result = "Study";
            case "Sept" -> result = "Bappa Morya";
            default -> result = "enter a valid month";

        };
        System.out.println(result);

    }

}
