import java.util.Scanner;
public class Practical2 {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("enter the ten number");
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();
        int d = S.nextInt();
        int e = S.nextInt();
        int f = S.nextInt();
        int g = S.nextInt();
        int h = S.nextInt();
        int i = S.nextInt();
        int j = S.nextInt();
        System.out.println("the numbers are\n"+a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+j);
        System.out.print("the greater number is: ");
        if (a>=b&&a>=c&&a>=d&&a>=e&&a>=f&&a>=g&&a>=h&&a>=i&&a>=j){
            System.out.println(a);
        }
        else if(b>=a&&b>=c&&b>=d&&b>=e&&b>=f&&b>=g&&b>=h&&b>=i&&b>=j){
            System.out.println(b);
        }
        else if(c>=a&&c>=b&&c>=d&&c>=e&&c>=f&&c>=g&&c>=h&&c>=i&&c>=j){
            System.out.println(c);
        }
        else if (d>=a&&d>=b&&d>=c&&d>=e&&d>=f&&d>=g&&d>=h&&d>=i&&d>=j){
            System.out.println(d);
        }
        else if (e>=a&&e>=b&&e>=c&&e>=d&&e>=f&&e>=g&&e>=h&&e>=i&&e>=j){
            System.out.println(e);
        }
        else if (f>=a&&f>=b&&f>=c&&f>=d&&f>=e&&f>=g&&f>=h&&f>=i&&f>=j){
            System.out.println(f);
        }
        else if (g>=a&&g>=b&&g>=c&&g>=d&&g>=e&&g>=f&&g>=h&&g>=i&&g>=j){
            System.out.println(g);
        }
        else if (h>=a&&h>=b&&h>=c&&h>=d&&h>=e&&h>=f&&h>=g&&h>=i&&h>=j){
            System.out.println(h);
        }
        else if (i>=b&&i>=c&&i>=d&&i>=e&&i>=f&&i>=g&&i>=h&&i>=a&&i>=j){
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }
        System.out.println("enter another number ");
        int q = S.nextInt();
        System.out.println(q);

    }
}
