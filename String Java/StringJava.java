import java.lang.*;
import java.io.*;
import java.util.*;

// Logic Building Assignment : 64 
// 1. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H * * * *
//  H e * * *
//  H e l * *
//  H e l l * 

/*
class Demo {
    void Pattern(String Name) {
        char Arr[];
        Arr = Name.toCharArray();
        int k = 0, i = 0, j = 0;
        int Size = Arr.length;
        int Size1 = ((Arr.length) - 1);
        Size = 0;

        while (k != (Arr.length) - 1) {
            System.out.println();
            if (i > Size) {
                break;

            }

            for (i = 0; i <= (Size); i++) {

                System.out.print(Arr[i] + "\t");

            }
            k++;
            Size++;
            for (j = 0; j < (Size1); j++) {
                System.out.print("#" + "\t");

            }
            Size1--;

        }

    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        Demo dobj = new Demo();

        System.out.println("ENTER STRING");
        String Name = sobj.nextLine();

        dobj.Pattern(Name);

    }
}
*/

// 2. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H e l l o
//  H e l l *
//  H e l * *
//  H e * * *
//  H * * * * 

// class Demo {
//     void Pattern(String Name) {
//         char Arr[];
//         Arr = Name.toCharArray();
//         int k = 0, i = 0, j = 0;
//         int Size = Arr.length;
//         int Size1 = ((Arr.length) - 1);
//         Size1 = 0;

//         while (k != (Arr.length)) {
//             System.out.println();

//             for (i = 0; i < Size; i++) {

//                 System.out.print(Arr[i] + "\t");

//             }
//             k++;
//             Size--;
//             for (j = 0; j < Size1; j++) {
//             System.out.print("*" + "\t");

//             }
//             Size1++;

//         }

//     }
// }

// class StringJava {
//     public static void main(String Args[]) throws Exception {
//         Scanner sobj = new Scanner(System.in);
//         Demo dobj = new Demo();

//         System.out.println("ENTER STRING");
//         String Name = sobj.nextLine();

//         dobj.Pattern(Name);

//     }
// }

// 3. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H # # # #
//  H e # # #
//  H e l # #
//  H e l l #
//  H e l l o

/* class Demo {
    void Pattern(String Name) {
        char Arr[];
        Arr = Name.toCharArray();
        int k = 0, i = 0, j = 0;
        int Size = Arr.length;
        int Size1 = ((Arr.length) - 1);
        Size = 0;

        while (k != (Arr.length)) {
            System.out.println();
            if (i > Size) {
                break;

            }

            for (i = 0; i <= (Size); i++) {

                System.out.print(Arr[i] + "\t");

            }
            k++;
            Size++;
            for (j = 0; j < (Size1); j++) {
                System.out.print("#" + "\t");

            }
            Size1--;

        }

    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        Demo dobj = new Demo();

        System.out.println("ENTER STRING");
        String Name = sobj.nextLine();

        dobj.Pattern(Name);

    }
} */

// 4. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H e l l o
//  H e l l *
//  H e l * *
//  H e * * *
//  H * * * *
//  H e * * *
//  H e l * *
//  H e l l *
//  H e l l 0 

/* class Demo {
    void Pattern(String Name) {
        char Arr[];
        Arr = Name.toCharArray();
        int k = 0, i = 0, j = 0;
        int Size = (Arr.length);
        int Size1 = ((Arr.length) - 1);
        Size1 = 0;
        while (k != (Arr.length)) {

            if (Size > Arr.length) {
                break;
            }
            System.out.println();

            for (i = 0; i < (Size); i++) {

                System.out.print(Arr[i] + "\t");

            }
            Size--;
            k++;
            for (j = 0; j < (Size1); j++) {
                System.out.print("#" + "\t");

            }
            Size1++;

            if (Size == 1) {
                Size1 = ((Arr.length) - 1);
                while (k != (Arr.length)) {

                    if (Size > Arr.length) {
                        break;
                    }
                    System.out.println();

                    for (i = 0; i < (Size); i++) {

                        System.out.print(Arr[i] + "\t");

                    }

                    Size++;
                    k--;

                    for (j = 0; j < (Size1); j++) {
                        System.out.print("#" + "\t");

                    }
                    Size1--;

                }
            }
        }

    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        Demo dobj = new Demo();

        System.out.println("ENTER STRING");
        String Name = sobj.nextLine();

        dobj.Pattern(Name);

    }
}

 */

// 5. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H # # # #
//  H e # # #
//  H e l # #
//  H e l l #
//  H e l l o
//  H e l l #
//  H e l # #
//  H e l # #
//  H e # # #
//  H # # # # 

/* class Demo {
   void Pattern(String Name) {
       char Arr[];
       Arr = Name.toCharArray();
       int k = 0, i = 0, j = 0;
       int Size = (Arr.length);
       int Size1 = ((Arr.length) - 1);
       Size = 0;
       while (k != (Arr.length)) {

           if (Size > Arr.length) {
               break;
           }
           System.out.println();

           for (i = 0; i <= (Size); i++) {

               System.out.print(Arr[i] + "\t");

           }
           Size++;
           k++;
           for (j = 0; j < (Size1); j++) {
               System.out.print("#" + "\t");

           }
           Size1--;

           if (Size == (Arr.length)) {
               k = 0;
               Size1 = 1;
               while (k != (Arr.length)) {

                   if (Size > Arr.length) {
                       break;
                   }
                   System.out.println();

                   for (i = 0; i < (Size) - 1; i++) {

                       System.out.print(Arr[i] + "\t");

                   }
                   Size--;
                   k++;

                   for (j = 0; j < (Size1); j++) {
                       if (Size == 0) {
                           break;
                       }
                       System.out.print("#" + "\t");

                   }
                   Size1++;

               }
           }
       }

   }
}

class StringJava {
   public static void main(String Args[]) throws Exception {
       Scanner sobj = new Scanner(System.in);
       Demo dobj = new Demo();

       System.out.println("ENTER STRING");
       String Name = sobj.nextLine();

       dobj.Pattern(Name);

   }
}
 */

// 1. Write Java program which accept number of rows and number of columns
// from user and display below pattern.
// Input : iRow = 4 iCol = 4
// Output : A B C D
//  A B C D
//  A B C D
//  A B C D 
/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        char ch = 'A';
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t" + ch);
                ch++;

            }
            ch = 'A';
        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
} */

// 2. Write Java program which accept number of rows and number of columns
// from user and display below pattern.
// Input : iRow = 4 iCol = 4
// Output : A B C D
//  a b c d
//  A B C D
//  a b c d 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        char ch1 = 'A';
        char ch2 = 'a';
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                if (i % 2 == 0) {
                    System.out.print("\t" + ch2);
                } else {
                    System.out.print("\t" + ch1);
                }
                ch1++;
                ch2++;
            }
            ch1 = 'A';
            ch2 = 'a';
        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
} */

// 3. Write Java program which accept number of rows and number of columns
// from user and display below pattern.
// Input : iRow = 3 iCol = 5
// Output : A A A A A
//  B B B B B 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        char ch1 = 'A';
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t" + ch1);
            }
            ch1++;

        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
} */

//Logic Building Assignment : 59 

// 1. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H e l l o
//  H e l l o
//  H e l l o
//  H e l l o 

/* class Demo {
    void Pattern(String Name, int row) {

        int k = row;
        char Arr[];
        Arr = Name.toCharArray();
        while (k != 0) {
            System.out.println();
            for (int o = 0; o < Arr.length; o++) {
                System.out.print(Arr[o] + "\t");
            }
            k--;
        }
    }

}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        System.out.println("ENTER NUMBER OF ROWS");
        int row = sobj.nextInt();
        Demo dobj = new Demo();
        dobj.Pattern(Name, row);
    }
} */

// 2. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H e l l o
//  H e l l
//  H e l
//  H e
//  H 

/* class Demo {
    void Pattern(String Name, int row) {

        int k = row;
        char Arr[];
        Arr = Name.toCharArray();
        int Size = (Arr.length);

        while (k != 0) {

            System.out.println();
            for (int o = 0; o < Size; o++) {
                System.out.print(Arr[o] + "\t");
            }
            Size--;
            k--;
        }
    }

}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        System.out.println("ENTER NUMBER OF ROWS");
        int row = sobj.nextInt();
        Demo dobj = new Demo();
        dobj.Pattern(Name, row);
    }
} */

/* 3. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output : H
 H e
 H e l
 H e l l
 H e l l o  */

/* class Demo {
    void Pattern(String Name, int row) {

        int k = row;
        int i = 0;
        char Arr[];
        Arr = Name.toCharArray();
        int Size = (Arr.length);
        Size = 1;
        while (k != 0) {

            System.out.println();
            for (i = 0; i < Size; i++) {
                System.out.print(Arr[i] + "\t");
            }
            Size++;
            k--;
        }
    }

}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        System.out.println("ENTER NUMBER OF ROWS");
        int row = sobj.nextInt();
        Demo dobj = new Demo();
        dobj.Pattern(Name, row);
    }
}

 */

// 4. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H e l l o
//  H e l l
//  H e l
//  H e
//  H
//  H e
//  H e l
//  H e l l
//  H e l l 0 

/* class Demo {
    void Pattern1(String Name) {
        int i = 0;
        char Arr[];
        Arr = Name.toCharArray();
        int Size = (Arr.length);
        int k = 0;
        for (int j = 1; j <= 1; j++) {

            while (k != (Arr.length)) {
                if (Size > Arr.length) {
                    break;
                }
                System.out.println();
                for (i = 0; i < (Size); i++) {
                    System.out.print(Arr[i] + "\t");

                }
                Size--;
                k++;

                if (Size == 1) {
                    Size = 1;
                    while ((k != (Arr.length))) {
                        if (Size > Arr.length) {
                            break;
                        }
                        System.out.println();
                        for (i = 0; i < (Size); i++) {

                            System.out.print(Arr[i] + "\t");

                        }
                        Size++;
                        k--;

                    }
                }
            }
        }

    }
} 

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        Demo dobj = new Demo();
        dobj.Pattern1(Name);
    }
}*/

// 5. Write Java program which accept String from user and display
// below pattern.
// Input : Hello
// Output : H
// H e
// H e l
// H e l l
// H e l l o
// H e l l
// H e l
// H e l
// H e
// H

/* class Demo {
    void Pattern1(String Name) {
        int i = 0;
        char Arr[];
        Arr = Name.toCharArray();
        int Size = (Arr.length);
        Size = 1;
        int k = 0;
        int c = 0;
        for (int j = 0; j <= Size; j++) {

            while (k != (Arr.length)) {
                if (Size > Arr.length) {
                    break;
                }
                System.out.println();
                for (i = 0; i < Size; i++) {
                    System.out.print(Arr[i] + "\t");
                }
                Size++;
                if (Size == (Arr.length)) {
                    k = 0;
                    while ((k != (Arr.length))) {

                        System.out.println();
                        for (i = 0; i < (Size); i++) {

                            System.out.print(Arr[i] + "\t");

                        }
                        Size--;
                        k++;

                    }
                }

            }

        }

    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        Demo dobj = new Demo();
        dobj.Pattern1(Name);
    }
}
 */

// 4. Write java program which accept array of characters from user and
// count number of capital characters.
// Input : b N j B R b A d G G
// Output : 6 

/* class Demo {

    void CapitalArry(String Name) {
        int iSum = 0;
        int iNum = 0;
        int k = 0;
        int iSum1 = 0;
        char Arr[];

        Arr = Name.toCharArray();
        for (k = 0; k < Arr.length; k++) {
            if ((Arr[k] >= 'A') && (Arr[k] <= 'Z')) {
                System.out.print(Arr[k]);
                iSum++;

            }

        }
        System.out.println();
        System.out.print("CAPTITAL CHAR ARE;--->>" + iSum);

    }
}

class ArrayJava {
    public static void main(String args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();

        System.out.println("\t");

        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.CapitalArry(Name);

    }
}
 */

// Logic Building Assignment : 69 
// 1. Write Java program which accept array of characters from user and
// replace each capital character with its corresponding small character.
// Input : b N j B R b A d G G
// Output : b n j b r b a d g g 

/* class Demo {

    void SMALLArry(String Name) {
        int iSum = 0;
        int iNum = 0;
        int k = 0;
        int iSum1 = 0;
        char Arr[];
        Arr = Name.toCharArray();
        for (int p = 0; p < Arr.length; p++) {

            if ((Arr[p] >= 'A') && (Arr[p] <= 'Z')) {
                System.out.print((char) (Arr[p] + 32));
                iSum++;
                Arr[p] = (char) (Arr[p] + 32);
            }

        }
        System.out.println();
        System.out.print("SMALL CHAR ARE;--->>" + iSum);
        System.out.println();
        for (char Brr : Arr) {

            System.out.print(Brr);

        }
    }
}

class StringJava {
    public static void main(String args[]) throws Exception {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        System.out.println("ENTER String");
        String Name = bobj.readLine();

        System.out.println("\t");

        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.SMALLArry(Name);

    }
}

 */

// 3. Write Java program which accept array of characters from user and
// accept one character. Return occurrence of that character without
// considering case.
// Input : b N e B R b A i G i B
//  b
// Output : 4 

/* class Demo {

    void SearchChar(String Name, String ch) {
        int iSum = 0;
        int iNum = 0;
        int k = 0;
        int iSum1 = 0;
        char Arr[];
        char Brr[];
        Brr = ch.toCharArray();
        Arr = Name.toCharArray();

        for (int p = 0; p < Arr.length; p++) {
            for (k = 0; k < Brr.length; k++) {

                if ((Arr[p] == Brr[k])|| (Arr[p] == ((char)Brr[k]+32))) {
                    iSum++;
                }

            }
        }
        System.out.println();
        System.out.print("Frequence CHAR ARE;--->>" + iSum);
        System.out.println();
    }
}

class StringJava {
    public static void main(String args[]) throws Exception {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        System.out.println("ENTER String");
        String Name = bobj.readLine();
        System.out.println("ENTER CHARACTER");
        String ch = bobj.readLine();
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.SearchChar(Name, ch);

    }
}
 */

// 4. Write Java program which accept array of characters from user and
// return difference between frequency of capital and frequency of small
// characters.
// Input : b N e B R b A I O G i
// Output : 3 (7 - 4) 

/* class Demo {

    void SearchChar(String Name) {
        int iSum = 0;
        int iNum = 0;
        int k = 0;
        int iSum1 = 0;
        char Arr[];
        
        Arr = Name.toCharArray();

        for (int p = 0; p < Arr.length; p++) {
            for (k = 0; k < Brr.length; k++) {

                if ((Arr[p] >= 'A') && (Arr[p] <= 'Z')) {
                    iSum++;
                } else if ((Arr[p] >= 'a') && (Arr[p] <= 'z')) {
                    iSum--;
                }

            }
        }
        System.out.println();
        System.out.print("Difference of captial and small CHAR ARE;--->>" + iSum);
        System.out.println();
    }
}

class StringJava {
    public static void main(String args[]) throws Exception {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        System.out.println("ENTER String");
        String Name = bobj.readLine();
        System.out.println("\t");
        Demo dobj = new Demo();
        dobj.SearchChar(Name);

    }
}
 */

// ----------------------Logic Building Assignment : 60

// 1. Write a java program which accepts 2 strings from user and
// concat N characters of second string after first string.Value of N
// should be accepted from user.
// Note : If third parameter is greater than the size of second string
// then concat whole string after first string.

/* class Demo {
    void StringConct(String Name1, String Name2, int iNo) {
        char Arr[];
        char Brr[];
        int i = 0;
        Brr = Name2.toCharArray();
        Arr = Name1.toCharArray();
        char Crr[] = new char[(Arr.length + Brr.length)];
        if (iNo > (Brr.length)) {
            iNo = (Brr.length);
        }
        for (int k = 0; k < (Arr.length); k++) {
            Crr[i] = Arr[k];
            i++;
        }
        i = (Arr.length);
        for (int k = 0; k < (iNo); k++) {
            Crr[i] = Brr[k];
            i++;
        }
        System.out.print(" ");
        for (int k = 0; k < Crr.length; k++) {
            System.out.print(Crr[k]);
        }
    }

}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER 1ST STRING");
        String Name1 = sobj.nextLine();
        System.out.println("ENTER 2ST STRING");
        String Name2 = sobj.nextLine();
        System.out.println("ENTER N NUMBER");
        int iNo = sobj.nextInt();
        Demo dobj = new Demo();
        dobj.StringConct(Name1, Name2, iNo);

    }
}
 */

// 2. Write a program which 2 strings from user and check whether
// contents of two strings are equal or not.
// Output : TRUE
/* class Demo {
   boolean Stringequal(String Name1, String Name2) {
       char Arr[];
       char Brr[];
       char Crr[];
       boolean flag = false;
       int j = 0;
       Brr = Name2.toCharArray();
       Arr = Name1.toCharArray();
       int p = 0;
       for (j = 0; j < (Arr.length); j++) {
           if (Brr[j] == Arr[j]) {
               p++;
           } else {
               p = 0;
           }
       }
       if (p == Arr.length) {
           return true;
       } else {
           return false;
       }

   }

}
class Assipart2 {
   public static void main(String Args[]) throws Exception {
       Scanner sobj = new Scanner(System.in);
       System.out.println("ENTER 1ST STRING");
       String Name1 = sobj.nextLine();
       System.out.println("ENTER 2ST STRING");
       String Name2 = sobj.nextLine();
       Demo dobj = new Demo();
       boolean iRet = dobj.Stringequal(Name1, Name2);
       if (iRet == true) {
           System.out.println("String is equal");
       } else {
           System.out.println("String is not equal");
       }
   }
} 
*/

// 3. Write a program which 2 strings from user and check whether
// first N contents of two strings are equal or not. 

/* class Demo {
   boolean Stringequal(String Name1, String Name2, int iNo) {
       char Arr[];
       char Brr[];
       char Crr[];
       boolean flag = true;
       int j = 0;
       Brr = Name2.toCharArray();
       Arr = Name1.toCharArray();
       int p = 0;

       for (j = 0; j < iNo; j++) {
           if (Brr[j] != Arr[j]) {
           flag=false;
           }
       }
     return flag;
   }

}

class StringJava {
   public static void main(String Args[]) throws Exception {
       Scanner sobj = new Scanner(System.in);
       System.out.println("ENTER 1ST STRING");
       String Name1 = sobj.nextLine();
       System.out.println("ENTER 2ST STRING");
       String Name2 = sobj.nextLine();
       System.out.println("ENTER NUMBER");
       int iNo = sobj.nextInt();
       Demo dobj = new Demo();
       boolean iRet = dobj.Stringequal(Name1, Name2, iNo);
       if (iRet == true) {
           System.out.println("String is equal");
       } else {
           System.out.println("String is not equal");
       }
   }
}  */

// 4. Accept sing from user and reverse the contents of that string
// by toggling the case.

/* class Demo {

    char Arr[];
    char Brr[];
    int i = 0;

    void StringToggle(String Name1) {
        Arr = Name1.toCharArray();
        int Size = 0;
        while (Size != Arr.length) {

            if ((Arr[i] >= 'a') && (Arr[i] <= 'z')) {

                Arr[i] = ((char) (Arr[i] - 32));

            } else if ((Arr[i] >= 'A') && (Arr[i] <= 'Z')) {
                Arr[i] = ((char) (Arr[i] + 32));

            }
            System.out.print((Arr[i]));
            i++;
            Size++;
        }

    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER 1ST STRING");
        String Name1 = sobj.nextLine();

        Demo dobj = new Demo();
        dobj.StringToggle(Name1);

    }
}
 */

// 5. Accept string from user and check whether the string is
// palindrome or not without considering its case. 

/* class Demo {
    boolean StringPalindrom(String Name1) {
        char Arr[];
        char Brr[];
        char Crr[];
        int j = 0, i = 0;
        boolean flag = true;
        Brr = Name1.toCharArray();
        Arr = Name1.toCharArray();
        int p = 0;

        for (j = (Arr.length) - 1; j >= 0; j--) {
            if ((Arr[i] >= 'A') && (Arr[i] <= 'Z')) {

                Arr[i] = ((char) (Arr[i] + 32));
            }
            Brr[j] = Arr[i];
            i++;
        }
        for (j = 0; j < Arr.length; j++) {
            if (Brr[j] != Arr[j]) {
                flag = false;
                break;

            }

        }
        return flag;

    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER 1ST STRING");
        String Name1 = sobj.nextLine();
        Demo dobj = new Demo();
        boolean iRet = dobj.StringPalindrom(Name1);
        if (iRet == true) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
} */
////////////////////practice//////////////
class StringJava {
    public static void main(String args[])

    {
        StringBuffer s3 = new StringBuffer("java");
        s3.setCharAt(3, 'p');
        s3.deleteCharAt(3);
        System.out.println(s3.capacity() + " " + s3.length() + "  " + s3.charAt(2) + " " + s3.delete(0, 1) + " " + s3);
        String ok = "omkar";
        String ok1 = "OmLar";
        StringBuilder str = new StringBuilder("my is OMkar");
        String p = "name";
        str.insert(2, p);
        System.out.println(str);
    }
}