import java.util.Scanner;

public class ExceptionHandlingForThrowKeyword {
    static void checkEligibility(int age){
        if (age<18){
            throw new ArithmeticException("You are not eligible for voting.");
        }
        else{
            System.out.println("You are eligible for voting.");
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= Sc.nextInt();
        System.out.print("Hello,");

        try {
            checkEligibility(age);
        }
        catch (Exception E){
            System.out.println(E);
        }
    }
}


