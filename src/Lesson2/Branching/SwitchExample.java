package Lesson2.Branching;

public class SwitchExample {
    public static void main(String[] args) {
//        System.out.println(printMonth(1));
//        System.out.println(printMonth(2));
//        System.out.println(printMonth(3));
//        System.out.println(printMonth(4));
//        System.out.println(printMonth(5));
//        System.out.println(printMonth(6));
//        System.out.println(printMonth(7));
//        System.out.println(printMonth(8));
//        System.out.println(printMonth(9));
//        System.out.println(printMonth(10));
//        System.out.println(printMonth(11));
//        System.out.println(printMonth(12));
//        System.out.println(printMonth(13));

        printMonthBySwitch(1);
        printMonthBySwitch(2);
        printMonthBySwitch(3);
        printMonthBySwitch(4);
        printMonthBySwitch(5);
        printMonthBySwitch(6);
        printMonthBySwitch(7);
        printMonthBySwitch(8);
        printMonthBySwitch(9);
        printMonthBySwitch(10);
        printMonthBySwitch(11);
        printMonthBySwitch(12);
        printMonthBySwitch(13);
    }

    private static String printMonth(int monthNumber) {
        if (monthNumber == 1) return "January";
        if (monthNumber == 2) return "February";
        if (monthNumber == 3) return "March";
        if (monthNumber == 4) return "April";
        if (monthNumber == 5) return "May";
        if (monthNumber == 6) return "June";
        if (monthNumber == 7) return "July";
        if (monthNumber == 8) return "August";
        if (monthNumber == 9) return "September";
        if (monthNumber == 10) return "October";
        if (monthNumber == 11) return "November";
        if (monthNumber == 12) return "December";
        return "Unknown month!";
    }

    private static void printMonthBySwitch(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Unknown month!");
        }
    }

    private static void printSeasonBySwitch(int monthNumber) {
        switch (2) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                return;
            default:
                System.out.println("Unknown season!");
        }
    }
}
