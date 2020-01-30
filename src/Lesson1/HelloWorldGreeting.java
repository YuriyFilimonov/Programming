package Lesson1;

public class HelloWorldGreeting {

    public static void main(String[] args) {
        HelloWorldExample(args[0]);

        testPrimitives();

//        boolean flag = true;
//        flag = false;
//        System.out.println(flag);

//        String str = new String("Hello!");
        testString();

        HelloWorldGreeting ex1 = new HelloWorldGreeting();
        System.out.println(ex1);

        int d = 7;
        int e = 5;

        d += e;//d = d + e;
        System.out.println(d);
//        System.out.println("d / e = " + (d / e));
//        System.out.println("d % e = " + (d % e));
//        System.out.println("d++ " + (++d));
//        System.out.println("e-- " + (--e));

        System.out.println("-------");
        boolean flag = true;
        if (12 == 5 || flag == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        printMessage("another");

        float result = add(5.0f, 5.0f);
        System.out.println(result);
        printMessage("exit");

        Calculator calculator = new Calculator("test");
        System.out.println(calculator);
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.mul(2, 3));

    }

    private static void testString() {
        String str = "Hello!";

        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    private static void testPrimitives() {
        short a = 32767;
        float b = 7.5f;
        double c = a + b;
        System.out.println(c);

        char chr = '?';
        System.out.println(chr);
    }

    private static void HelloWorldExample(String arg) {
        String name = arg;
        System.out.println("Hello, World!");
        System.out.println("Hello, " + name + "!");
    }

    private static void printMessage(String text) {
        if (text.equals("exit")) {
            return;
        }
        System.out.println(text);
    }

    private static float add(float a, float b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "Greetings!";
    }
}