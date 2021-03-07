import java.lang.*;
import java.util.*;

/* class Demo {
    void Display(int Arr[], int Brr[]) {
        for (int iNo : Arr) {
            System.out.print(iNo + "\t");
        }
        System.out.println();

        for (int iNo1 : Brr) {
            System.out.print(iNo1 + "\t");
        }
    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[10];
        int Brr[] = new int[10];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
} */

// 2. Write Java program which accept two arrays from user and display
// even contents of each array.
// Input : 2 9 6 5 2 3
//  45 6 12 18 23 4
// Output : 2 6 2
//  6 12 18 4

/* class Demo {
    void Display(int Arr[], int Brr[]) {
        for (int iNo : Arr) {
            if(iNo%2==0)
            {
                System.out.print(iNo + "\t");
            }
          
        }
        System.out.println();

        for (int iNo1 : Brr) {
            if(iNo1%2==0)
            {
                System.out.print(iNo1 + "\t");
            }
           
        }
    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        int Brr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
} */

// 3. Write Java program which accept two arrays from user and display
// odd contents of each array.
// Input : 2 9 6 5 2 3
//  45 6 12 18 23 4
// Output : 9 5 3 

/* class Demo {
    void Display(int Arr[], int Brr[]) {
        for (int iNo : Arr) {
            if(iNo%2!=0)
            {
                System.out.print(iNo + "\t");
            }
          
        }
        System.out.println();

        for (int iNo1 : Brr) {
            if(iNo1%2!=0)
            {
                System.out.print(iNo1 + "\t");
            }
           
        }
    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        int Brr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
} */

// 4. Write Java program which accept two arrays from user and form
// new array which is combination of contents of first and second array.
// Input : 12 57 28 3
//  99 23 54 58 6 67
// Output : 12 57 28 3 99 23 54 58 6 67
/* 
class Demo {
    void Display(int Arr[], int Brr[]) {
        int Crr[] = new int[(Arr.length + Brr.length)];
        int loop[] = new int[20];
        int Size1 = 0, Size2 = 0;

        while (Size1 != Arr.length) {
            Crr[Size1] = Arr[Size1];
            Size1++;
        }
         Size1 = (Brr.length);
        while (Size2 != Brr.length) {

            Crr[Size1] = Brr[Size2];
            Size2++;
            Size1++;
        }

        System.out.println();

        for (int j = 0; j < Crr.length; j++) {

            System.out.print(Crr[j] + "\t");

        }

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        int Brr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
}
 */

// 5. Write Java program which accept two arrays from user and display
// summation of each array.
// Input : 2 9 7 5 2 3
//  9 3 5 5
// Output : 28 22 

/* class Demo {
    int iSum = 0;
    int iNum = 0;

    void Display(int Arr[], int Brr[]) {
        for (int iNo : Arr) {

            iSum = iSum + iNo;

        }
        System.out.print(iSum + "\t");
        System.out.println();

        for (int iNo1 : Brr) {
            iNum = iNum + iNo1;

        }
        System.out.print(iNum + "\t");
    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        int Brr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
} */

// Logic Building Assignment : 67
// 1. Write a java program which accept two arrays from user and return
// difference between summation of arrays.
// Input : 2 9 7 5 2 3
//  9 3 5 5
// Output : 6 

/* class Demo {
    int iSum = 0;
    int iNum = 0;

    void Display(int Arr[], int Brr[]) {
        for (int iNo : Arr) {

            iSum = iSum + iNo;

        }
        System.out.print(iSum + "\t");
        System.out.println();

        for (int iNo1 : Brr) {
            iNum = iNum + iNo1;

        }
        System.out.print(iNum + "\t");
        System.out.println();
        System.out.print("DIFFERANCE OF SUMMATION IS:->>" + (iSum - iNum )+ "\t");
    }

}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        int Brr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
} */

// 2. Write a java program which accept two two arrays from user and
// display minimum element of each array.
// Input : 2 9 7 5 2 3
//  9 3 5 5
// Output : 2 3 

/* class Demo {
    int iSum = 0;
    int iNum = 0;

    void Display(int Arr[], int Brr[]) {
        iNum = Arr[0];
        for (int i = 0; i < Arr.length; i++) {

            if (iNum > Arr[i]) {
                iNum = Arr[i];
            }
        }
        System.out.print(iNum + "\t");
        System.out.println();

        iSum = Brr[0];

        for (int j = 0; j < Brr.length; j++) {

            if (iSum > Brr[j]) {
                iSum = Brr[j];
            }
        }
        System.out.print(iSum + "\t");
        System.out.println();

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        int Brr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
} */

// 3. Write a java program which accept two array from user and copy
// the contents of that array into another array in reverse order and
// return new array. 

/* class Demo {

    void Display(int Arr[], int Brr[]) {
        int iSum = (Arr.length);
        int iNum = Brr.length;
        int k = 0;
        int Crr[] = new int[(Arr.length) + (Brr.length)];

        for (int i = (Arr.length) - 1; i >= 0; i--) { 
            Crr[k] = Arr[i];
            k++;
        }
        k = Arr.length;
        for (int j = (Brr.length) - 1; j >= 0; j--) {
            Crr[k] = Brr[j];
            k++;
        }
        System.out.println();
        for (k = 0; k < Crr.length; k++) {
            System.out.print(Crr[k] + "\t");
        }

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[3];
        int Brr[] = new int[3];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.Display(Arr, Brr);

    }
} */

// 4. Write a java program which accept two array from user and copy
// the contents of that array into another array and return new array. 

/* class Demo {

    void CopyArry(int Arr[], int Brr[]) {
        int iSum = 0;
        int iNum = 0;
        int Crr[] = new int[(Arr.length) + (Brr.length)];

        while (iSum != Arr.length) {
            Crr[iSum] = Arr[iSum];
            iSum++;

        }
        iSum = Arr.length;
        while (iNum != Brr.length) {
            Crr[iSum] = Brr[iNum];
            iSum++;
            iNum++;

        }
        System.out.println();
        for (int k = 0; k < (Crr.length); k++) {
            System.out.print(Crr[k] + "\t");
        }

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[3];
        int Brr[] = new int[3];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.CopyArry(Arr, Brr);

    }
} */

// 5. Write a java program which accept two array from user and check
// whether that array and its elements are palindrome or not.
// Input : 11 252 387783 252 11
// Output : TRUE 

/* class Demo {

    void palindromeArry(int Arr[], int Brr[]) {
        int iSum = 0;
        int iNum = 0;
        int iSum1 = 0;
        int k = 0;
        int q = 0;
        int m = 0, n = 0;

        int Crr[] = new int[(Arr.length) + (Brr.length)];
        int Prr[] = new int[Crr.length];

        while (iSum != Arr.length) {
            Crr[iSum] = Arr[iSum];
            iSum++;

        }
        iSum = Arr.length;
        while (iNum != Brr.length) {
            Crr[iSum] = Brr[iNum];
            iSum++;
            iNum++;

        }
        System.out.println();
        for (k = 0; k < (Crr.length); k++) {
            Prr[k] = Crr[k];
            while (Crr[k] != 0) {
                iSum1 = (iSum1 * 10) + (Crr[k] % 10);
                Crr[k] = Crr[k] / 10;
            }
            if (Prr[k] == iSum1) {
                m = 1;
                System.out.print("TRUE" + "\t");
            } else {
                System.out.print("FALSE" + "\t");
            }
            iSum1 = 0;

        }
        System.out.println();
        k = 0;
        for (q = (Prr.length) - 1; q >= 0; q--) {

            System.out.print(Prr[q] + "\t");
            if (Prr[k] == Prr[q]) {
                System.out.print("TRUE" + "\t");
            } else {
                System.out.print("FALSE" + "\t");
            }
            k++;
        }
        System.out.println();

        if ((m == 1) && (n == 1)) {

            System.out.print("TRUE" + "\t");

        } else {
            System.out.print("FALSE" + "\t");
        }

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[3];
        int Brr[] = new int[3];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("ENTER ELEMENT OF 2nd ARRAY");
        for (int j = 0; j < Brr.length; j++) {
            Brr[j] = sobj.nextInt();

        }
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.palindromeArry(Arr, Brr);

    }
} */

///////////////////////////Single array
/* class Demo {

    void palindromeArry(int Arr[]) {
        int iSum = 0;
        int iNum = 0;
        int iSum1 = 0;
        int k = 0;
        int q = 0;
        int m = 0, n = 0;

        int Crr[] = new int[(Arr.length)];
        int Prr[] = new int[Crr.length];
        for (k = 0; k < Arr.length; k++) {
            Prr[k] = Arr[k];
            while (Arr[k] != 0) {

                iSum1 = (iSum1 * 10) + (Arr[k] % 10);
                Arr[k] = Arr[k] / 10;
            }
            System.out.print("\t" + iSum1);

            if (Prr[k] == iSum1) {

                if (Prr[k] == iSum1) {

                    m++;

                } else {
                    m = 0;
                }

            }
            iSum1 = 0;

        }
        int j = 0;
        if (m == 3) {

            System.out.println("YES");
        } else {
            System.out.println("FALSe");
        }
        for (j = (Prr.length - 1); j >= 0; j--) {
            System.out.println(Prr[j]);
        }
        for (k = 0; k < Prr.length; k++) {
            System.out.println(Prr[k]);
        }
        
    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[3];
        int Brr[] = new int[3];
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        Demo dobj = new Demo();
        dobj.palindromeArry(Arr);

    }
} */

////////Logic Building Assignment : 68

// 1. Write java program which accept array from user and reverse each
// number of that array.
// Input : 89 687 56 549 87 9
// Output : 98 786 65 945 78 9 

/* class Demo {

    void reverseArry(int Arr[]) {
        int iSum = 0;
        int iNum = 0;
        int k = 0;
        int iSum1 = 0;

        int Crr[] = new int[(Arr.length)];
        for (k = 0; k < Arr.length; k++) {
            while (Arr[k] != 0) {
                iSum1 = (iSum1 * 10) + (Arr[k] % 10);
                Arr[k] = Arr[k] / 10;
            }
            Arr[k] = iSum1;
            iSum1 = 0;
            System.out.print(Arr[k] + "\t");
        }

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        int Brr[] = new int[3];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.reverseArry(Arr);

    }
}
 */

// 2. Write java program which accept array from user and replace each
// member with summation of its digit.
// Input : 89 687 56 549 87 9
// Output : 17 21 11 18 15 9 

/* class Demo {

    void reverseArryS(int Arr[]) {
        int iSum = 0;
        int iNum = 0;
        int k = 0;
        int iSum1 = 0;

        int Crr[] = new int[(Arr.length)];
        for (k = 0; k < Arr.length; k++) {
            while (Arr[k] != 0) {
                iSum1 = iSum1+ (Arr[k] % 10);
                Arr[k] = Arr[k] / 10;
            }
            Arr[k] = iSum1;
            iSum1 = 0;
            System.out.print(Arr[k] + "\t");
        }

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        int Arr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();

        }
        System.out.println("\t");

        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.reverseArryS(Arr);

    }
}
 */

// 5. Write java program which accept marks of N students from user
// and display class of each student.
// Less than 35 - Fail
// Less than 50 - Pass class
// Less than 60 - Second class
// Less than 70 - First class
// Greater than 70 - First class with Distinction
// Input : 67.3 45.8 88.9 77.5 55.2
// Output : 67.3 First class
//  45.8 Pass class
//  88.9 First class with Distinction
//  77.5 First class with Distinction
//  55.2 Second class 

/* class Demo {

    void MarksArry(float Arr[]) {
        int iSum = 0;
        int iNum = 0;
        int k = 0;
        int iSum1 = 0;

        for (k = 0; k < Arr.length; k++) {
            if (Arr[k] < 35) {
                System.out.println(Arr[k] + "\tFAIL");
            } else if (Arr[k] < 50) {
                System.out.println(Arr[k] + "\tPass class ");
            } else if (Arr[k] < 60) {
                System.out.println(Arr[k] + "\tSecond class ");
            } else if (Arr[k] < 70) {
                System.out.println(Arr[k] + "\tFirst class ");
            } else if (Arr[k] > 70) {
                System.out.println(Arr[k] + "\tFirst class with Distinction ");
            }

        }

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        float Arr[] = new float[6];
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER ELEMENT OF 1st ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextFloat();

        }
        System.out.println("\t");

        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.MarksArry(Arr);

    }
} */

