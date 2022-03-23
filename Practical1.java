import java.util.Scanner;
public class Practical1 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your marks");
        int R= S.nextInt();
        if(R>90){
            System.out.println("A");
        }
        else if (R>80 && R<=90){
            System.out.println("B");
        }
        else if (R>70 && R<=80){
            System.out.println("C");
        }
        else if (R>60 && R<=70){
            System.out.println("E");
        }
        else if (R>50 && R<=60){
            System.out.println("F");
        }
        else {
            System.out.println("fail");
        }
    }

}
