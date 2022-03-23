public class Dowhile2 {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("The number is" + a);
            a++;
        } while (a <= 100);

        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }

        for (int k=100;k>=1;k--){
            System.out.println(k);
        }
    }
}