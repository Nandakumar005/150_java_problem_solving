import java.util.Scanner;
public class is_even{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int a=sc.nextInt();
        if(a%2==0)
        System.out.print("The given number is even");
        else
        System.out.print("The given number is not even");

        
    }


}