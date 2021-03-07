import java.lang.*;
import java.util.*;
import java.io.*;

class demo implements Runnable {
    public void run() {
        try {
            System.out.println("Current thread with id" + Thread.currentThread().getId());
            for (int i = 0; i <= 5; i++) {
                System.out.println("Current thread with id" + Thread.currentThread().getId() + " " + i);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Threads {
    public static void main(String Args[]) {

        //System.out.println("Current thread with id" + Thread.currentThread().getName());
       // System.out.println("Current thread with id" + Thread.currentThread().getId());
        demo dobj = new demo();
        Thread t1 = new Thread(dobj);
        t1.start();
        dobj.run();

    }
}
