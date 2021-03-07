import java.lang.*;
import java.util.*;

class demo {
    void main() {
        System.out.println("omkar");

    }
}

class indian {
    demo d = new demo() {
        void main() {
            System.out.println("bhagawat");

        }
    };
}

class annonymus {
    public static void main(String args[]) {
        indian obj = new indian();
        demo p = new demo();
        obj.d.main();
        p.main();
    }
}