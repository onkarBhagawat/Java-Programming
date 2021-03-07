import java.lang.*;
import java.util.*;

public class ArraySort {
    public static void main(String Argd[]) {
        int Array[] = { 10, 50, 80, 20 };
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println();
        Arrays.sort(Array);
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println();
        Arrays.fill(Array, 5);
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println();
        Arrays.fill(Array, 2,4,6);
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

    }

}
