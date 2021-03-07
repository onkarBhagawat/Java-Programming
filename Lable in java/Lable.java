
import java.lang.*;
import java.io.*;
import java.applet.*;
import java.awt.*;

public class Lable {
    public static void main(String Args[]) throws Exception {
        InputStreamReader iobj = new InputStreamReader(System.in);

        Loop1: for (int i = 0; i <= 10; i++) {

            System.out.println(" ");
            if (i == 5) {
                break;
            }
            for (int j = 0; j <= 6; j++) {
                System.out.print("*");
                if (i == j) {
                    continue Loop1;
                }
            }

        }

    }

}