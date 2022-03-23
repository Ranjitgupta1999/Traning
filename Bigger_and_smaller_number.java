public class Bigger_and_smaller_number {
    public static void main(String[] args) {
        int arr[]={65,87,67,20,12};
        int small=arr[0];
        for (int a:arr){
            if (small>a){
                small=a;
            }
        }
        System.out.println("The smaller number is "+small);

//        for (int i=1;i<arr.length;i++){
//            if (arr[i]<small){
//                small=arr[i];
//            }
//        }
//        System.out.println("The smallest number is "+small);


        int big=arr[0];
        for (int b:arr){
            if (big<b){
                big=b;
            }
        }
        System.out.println("The bigger number is "+big);


//        for (int i=1;i<arr.length;i++){
//            if (arr[1]<big){
//                big=arr[i];
//            }
//        }
//        System.out.println("The bigger number is "+big);
    }
}
