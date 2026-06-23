import java.util.Scanner;
public class return_last_digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        int lastdigit=a%10;
        System.out.println("The last digit is: " + lastdigit);



    }

    
}
