/* Chimaobi Onwuka
 * ceo2134
 * Easter.java
/**
 * This program implements the algorithm created by Fredrich Gauss 
 * for determining the date of Easter
 * 
 * @author: <Chimaobi Onwuka>
 * @date: <2/5/22>
 */

import java.util.Scanner;

public class Easter
{
  
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Welcome to the Easter Sunday Date Calculator. On what year would you like to find the date of Easter Sunday?");
        final int YEAR = input.nextInt();
        int a = (YEAR%19);
        int c = (YEAR%100);
        int b = (YEAR/100);
        int e = (b%4);
        int d = (b/4);
        int g = ((8*b +13)/25);
        int h = (((19*a)+ b - d - g +15)%30);
        int j = (c/4);
        int k = (c%4);
        int m = (((a+11)*h)/319);
        int r = (((2*e)+(2*j -k -h +m +32))%(7));
        int n = ((h - m + r +90)/(25));
        int p = ((h - m + r + n +19)%(32));

        if (YEAR >= 2022)
        {
            if (n==4)
            {
                System.out.println("A fine choice. In the year " + YEAR + ", Easter Sunday falls on April " 
                + p + ".");
            }
            else 
            {
                System.out.println("Delightful. In the year " + YEAR + ", Easter Sunday falls on March " 
                + p + ".");
            }
        }
        else if ((YEAR < 2022) && (YEAR >= 0))
        {
          if (n==4)
            {
                System.out.println("Interesting. In the year " + YEAR + ", Easter Sunday fell on April " 
                + p + ".");
            }
            else 
            {
                System.out.println("Auspicious indeed. In the year " + YEAR + ", Easter Sunday fell on March " + p + ".");
            } 
        } 
        else if (YEAR < 0)
        {
          if (n==4)
            {
                System.out.println("*WARNING*: Because of a subzero input. The following output may be unreliable. In the year " 
                + YEAR + ", Easter Sunday fell on April " + p + ".");
            }
            else 
            {
                System.out.println("*WARNING*: Because of a subzero input." + 
                " The following output may be unreliable. In the year " 
                + YEAR + ", Easter Sunday fell on March " + p + ".");
            }  
        }

        System.out.println("Listed below are the values that went into this calculation");
        System.out.println("a = " + a + ", b = " +  b + ", c = " + c  + ", d = " + d 
        + ", e = " + e + ", g = " + g + ", h = " + h + ", j = " + j + ", k = " 
        + k + ", m = " + m + ", r = " + r + ", n = " + n + ", p = " + p);
        System.out.println("Thank you for using this calculator based on Carl Friedrich Gauss' algorithim. Goodbye!");
    }





}	
