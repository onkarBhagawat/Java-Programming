import java.lang.*;
import java.util.*;
import java.io.*;

class Demo implements Runnable {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Frome thread A" + i);
            System.out.println(Thread.currentThread().getId()+" "+ Thread.currentThread().getName() + i);
        }
        System.out.println("Exit Frome thread A");
    }
}

class Memo implements Runnable {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(Thread.currentThread().getId() + i);

        }
        System.out.println("Exit Frome thread B");
    }
}

public class Thrads {
    public static void main(String Args[]) {
        Demo dobj = new Demo();
        Memo mobj = new Memo();
        Thread t1 = new Thread(dobj, "omi1");
        Thread t2 = new Thread(mobj, "omi2");

        t1.start();
        t2.start();

    }
}