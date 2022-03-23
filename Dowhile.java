import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        boolean B= false;
        Scanner S= new Scanner(System.in);
        do{
            System.out.println("enter number 1");
            float a= S.nextInt();
            System.out.println("enter number 2");
            float b= S.nextInt();
            System.out.println("enter the arithmatic operation(+,-,*,/,%)");
            char c= S.next().charAt(0);
            switch(c){
                case '+':
                    float sum =a+b;
                    System.out.println(sum);
                    break;
                case '-':
                    float sub =a-b;
                    System.out.println(sub);
                    break;
                case '*':
                    float multi =a*b;
                    System.out.println(multi);
                    break;
                case '/':
                    float div =a/b;
                    System.out.println(div);
                    break;
                case '%':
                    float mod =a%b;
                    System.out.println(mod);
                    break;
                default:
                    System.out.println("invalied");
            }
            System.out.println("Type N for continue");
            char ch= S.next().charAt(0);
            if (ch=='N'){
                B=true;
            }
            else{
                B=false;
            }

        }while(B);


    }
}
