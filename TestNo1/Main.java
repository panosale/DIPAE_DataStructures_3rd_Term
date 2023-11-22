package TestNo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Test casting
        int i = 1;
        char c = 'a';
/*
        System.out.print("Give an integer: ");
        i = UserInput.getInteger();
        System.out.print("Give an character: ");
        c = UserInput.getChar();
*/
        float f = (float) i;
        if (f > c)
            System.out.println(f + " > " + c);
        else
            System.out.println(c + " < " + f);
        // Test 1D arrays
        int[] A = new int[10];
        System.out.println("length of array A: " + A.length);
        int[] B = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int a = 3, b = 5;
        B[a + b] +=2;
        System.out.println("Array element in position [" + (a + b) + "], counting from 0, is now: " + B[a + b]);
        // 2D array
        int[][] C;
        C = new int[2][];
        C[0] = new int[3];
        C[1] = new int[5];
        // Test ArrayLists
        ArrayList AL1 = new ArrayList();
        AL1.add(1);
        System.out.println("AL1 = " + AL1);
        ArrayList<Integer> Students = new ArrayList<Integer>(3);
        System.out.println("isEmpty? " + Students.isEmpty());
        Students.add(4);
        Students.add(7);
        Students.add(2);
        System.out.println("Students = " + Students);
        System.out.println("Size of Students is: " + Students.size());
        Students.add(1,99);
        System.out.println("Students = " + Students);
        System.out.println("get element on position 1: " + Students.get(1));
        System.out.println("set 888 on position 2 an return old value: " + Students.set(2, 888));
        System.out.println("Students = " + Students);
        System.out.println("isEmpty? " + Students.isEmpty());
        System.out.println("Size of Students is: " + Students.size());
        System.out.println("Does list contains 4? " + Students.contains(4));
        System.out.println("in which position? " + Students.indexOf(4));
        System.out.println("Does list contains 555? " + Students.contains(555));
        System.out.println("in which position? " + Students.indexOf(555));
        System.out.println("Size of Students is: " + Students.size());
        System.out.println("remove element from position 2 an return it's value: " + Students.remove(2));
        System.out.println("Students = " + Students);
        System.out.println("Size of Students is: " + Students.size());
        Students.add(9);
        Students.add(3);
        Students.add(6);
        System.out.println("Students = " + Students);
        System.out.println("Size of Students is: " + Students.size());
        Students.trimToSize();
        System.out.println("Students = " + Students);
        System.out.println("Size of Students is: " + Students.size());
    }
}
