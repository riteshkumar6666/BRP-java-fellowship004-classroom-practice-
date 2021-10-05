//***BRP-java fellowship_004***
//Q.wap to MULTIPLY of two matrix program in java

import java.util.Scanner;
public class MulOfTwoMatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER FIRST MATRIX DATA");
        for (int i=0;i<2;i++)  //rows
        {
            for (int j=0;j<2;j++) //column
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("ENTER SECOND MATRIX DATA");
        for (int i=0;i<2;i++)  //rows
        {
            for (int j=0;j<2;j++) //column
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("FIRST MATRIX \n");
        for (int i=0;i<2;i++)  //rows
        {
            for (int j=0;j<2;j++) //column
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("SECOND MATRIX \n");
        for (int i=0;i<2;i++)  //rows
        {
            for (int j=0;j<2;j++) //column
            {
                System.out.println(b[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("MULTIPLICATION OF MATRIX \n");
        for (int i=0;i<2;i++)  //rows
        {
            for (int j=0;j<2;j++) //column
            {
                c[i][j]=a[i][j]*b[i][j];

                System.out.println(c[i][j]+ " ");
            }
            System.out.println("\n");
        }

    }
}

