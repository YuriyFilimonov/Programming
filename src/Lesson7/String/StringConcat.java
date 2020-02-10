package Lesson7.String;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StringConcat {

    public static void main(String[] args) throws IOException {
        String a1 = "Hello ";
        String a2 = "World";
        String a3 = a1 + a2;
        System.out.println(a3);
        String b1 = "Число 10: ";
        int b2 = 10;
        String b3 = b1 + b2; //        String b3 = b1 + String.valueOf(b2);

        System.out.println(b3);
        String c1 = "Home";
        String c2 = "[" + c1 + "] = " + 1;
        System.out.println(c2);


        String ss1 = "ABCDE";

        String sss = "abv dgdsg dsgds dsgdsg";
        for (String s : sss.split(" ")) {
            System.out.println(s);
        }

        String ss2 = "bcde";
        System.out.println(ss1.toLowerCase().contains(ss2));
//        String ss3 = ss1.isBlank()toLowerCase();
//        System.out.println(ss3);
//        System.out.println(ss1.compareTo(ss2));


        String ssss = "Десять: " + (5 + 5);
        System.out.println(ssss);

        FileInputStream is = new FileInputStream("test.txt");

//        int b;
//        StringBuilder sb = new StringBuilder();
//        while ((b = is.read()) != -1) {
//            sb.append( (char)b);
//        }
//        System.out.println(sb);

        List<String> strings = Files.readAllLines(Paths.get("test.txt"));
        for (String string : strings) {
            System.out.println(string);
        }


//        String str = new String(is.readAllBytes());
//        System.out.println(str);
    }

}
