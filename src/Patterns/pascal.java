
package Patterns;
import java.util.Scanner;

public class pascal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" \t");
            }
            for (int j=1;j<=1;j++){
                System.out.print(i+"\t");
            }
            for(int j=2;j<=n-i;j++){
                System.out.print(" \t");
            }
            for (int j=1;j<=1;j++){
                System.out.print(j+"\t");
            }

            System.out.println();


        }





    }
}