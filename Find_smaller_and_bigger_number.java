public class Find_smaller_and_bigger_number {
    static void smaller(int a[]){
        int small=a[0];
        for (int y:a){
            if (small>y){
                small=y;
            }
        }
        System.out.println("The smaller number is "+small);

//        for (int i=1;i<a.length;i++){
//            if (a[i]<small){
//                small=a[i];
//            }
//        }
//        System.out.println("The smaller number is "+small);

    }
    static void bigger(int a[]){
        int big=a[0];
        for (int j:a){
            if (big<j){
                big=j;
            }
        }
        System.out.println("the bigger number is "+big);
//        for (int i=1;i<a.length;i++){
//            if (a[i]>big){
//                big=a[i];
//            }
//        }
//        System.out.println("the bigger number is "+big);
    }
    public static void main(String[] args) {
        int a[]={40,56,78,34,10};
        smaller(a);
        bigger(a);


    }
}
