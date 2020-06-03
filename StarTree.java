/*
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 * ********
 * Above tree will be prduced.
 */
import java.util.Scanner;
class StarTree
{
    static Scanner sc = new Scanner(System.in);

 public static void main(String[] args)
 {
     System.out.println("Enter number of lines to be printed : ");
     int noOfLines = sc.nextInt();
     for ( int i = 1 ; i <= noOfLines ; i++)
     {
        for ( int j = 0 ; j < i ; j++)
        {
         System.out.print("*");
        }
        System.out.println();
     }
 }
}