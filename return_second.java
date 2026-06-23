import java.util.Scanner;
public class return_second {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        int lastdigit=(a/10)%10;
        System.out.println("The second last digit is: " + lastdigit);



    }

    
}
