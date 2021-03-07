import java.lang.*;
import java.util.*;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import java.io.*;

public class Exception {

    public static void main(String Args[]){
        int valid = 0;
        int invalid = 0;
        for (int i = 0; i < Args.length; i++) {
             try {
             int No = Integer.parseInt(Args[i]);

            }

             catch (NumberFormatException obj) {
            invalid = invalid + 1;
            System.out.println("Invalid number " + Args[i]);
            continue;
            }
             valid = valid + 1;
        }
         System.out.println("valid Number" + valid);
    }
}
