package Patterns;


import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int osp=n/2;
        int isp=-1;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=osp;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j=1;j<=isp;j++){
                System.out.print("\t");

            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }
            if(i<=n/2){
                osp--;
                isp=isp+2;
            }
            else{
                osp++;
                isp=isp-2;
            }
            System.out.println();


        }





    }
}
