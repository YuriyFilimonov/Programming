package Lesson2.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {
//        int[] data = new int[5];
        int data[] = new int[5];//[0; 4]
        data[2] = 5;
//        data[-1] = 5;
//        data[5] = 5;
//        for (int value : data) {
//            System.out.println(value);
//        }

//        int[] data2 = new int[] {1, 2, 3, 4, 5};
//        int[] data2 = {1, 2, 3, 4, 5};
//        String[] data2 = {"1", "2", "3", "4", "5"};
//        for (String value : data2) {
//            System.out.println(value);
//        }

//        String[][] data3 = new String[3][2];
        String[][] data3 =  {
                {"1", "2"},
                {"2", "3"},
        };
//        data3[0] = new String[2];

        for (String[] row : data3) {
            for (String value : row) {
                System.out.println(value);
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
