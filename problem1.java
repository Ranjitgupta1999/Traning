import java.util.Scanner;

public class problem1{
    public static void main(String [] argu){
        int a,b,c,d,e,f,g,h,i,j;
        a=76;
        b=89;
        c=76;
        d=86;
        e=45;
        f=65;
        g=76;
        h=87;
        i=46;
        j=875;
        System.out.println ("the numbers are\n"+a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+j+",");
        System.out.print("the greater number is\t");
        if(a>=b&&a>=c&&a>=d&&a>=e&&a>=f&&a>=g&&a>=h&&a>=i&&a>=j){
            System.out.println(a);
        }
        else if(b>=a&&b>=c&&b>=d&&b>=e&&b>=f&&b>=g&&b>=h&&b>=i&&b>=j){
            System.out.println(b);
        }
        else if(c>=b&&c>=a&&c>=d&&c>=e&&c>=f&&c>=g&&c>=h&&c>=i&&c>=j){
            System.out.println(c);
        }
        else if(d>=b&&d>=c&&d>=a&&d>=e&&d>=f&&d>=g&&d>=h&&d>=i&&d>=j){
            System.out.println(d);
        }
        else if(e>=b&&e>=c&&e>=d&&e>=a&&e>=f&&e>=g&&e>=h&&e>=i&&e>=j){
            System.out.println(e);
        }
        else if(f>=b&&f>=c&&f>=d&&f>=e&&f>=a&&f>=g&&f>=h&&f>=i&&f>=j){
            System.out.println(f);
        }
        else if(g>=b&&g>=c&&g>=d&&g>=e&&g>=f&&g>=a&&g>=h&&g>=i&&g>=j){
            System.out.println(g);
        }
        else if(h>=b&&h>=c&&h>=d&&h>=e&&h>=f&&h>=g&&h>=a&&h>=i&&h>=j){
            System.out.println(h);
        }
        else if(i>=b&&i>=c&&i>=d&&i>=e&&i>=f&&i>=g&&i>=h&&i>=a&&i>=j){
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }     
    }
}