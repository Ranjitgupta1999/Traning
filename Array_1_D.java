public class Array_1_D {
    public static void main(String[] args) {

        // there are three types to make an array
        // 1. int [] arr;                                              Declaration!
        //    arr=new int[5];                                          Memory Allocation!

        // 2.int [] arr=new arr[5];                                    Declaration + Memory Allocation

        // 3.int [] arr={};                                             Declare + Initialize

        // array indices starts from 0 and goes till (n-1)
        // when n is the size of the array.

        // 1-D Array

//        int [] arr;
//        arr=new int[5];
//        arr[0]=65;
//        arr[1]=76;
//        arr[2]=34;
//        arr[3]=90;
//        arr[4]=87;
//        for (int i=0;i<5;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
//        arr[2]=10;
//        for (int i=0;i<5;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for (int e:arr){
//            System.out.println(e);
//        }
//
//        String [] q;
//        q=new String[3];
//        q[0]="nittin";
//        q[1]="ranjit";
//        q[2]="hiren";
//        for (String D:q){
//            System.out.println(D);
//        }
        int [] arr;arr =new int [10];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        arr[6]=70;
        arr[7]=80;
        arr[8]=90;
        arr[9]=100;
        int sum=0;
        for (int i=0;i< arr.length;i++) {
            sum = sum + arr[i];
            System.out.println(sum);
        }
        System.out.println("Total= "+sum);

        sum=0;
        for (int a:arr){
            sum=sum+a;
        }
        System.out.println(sum);

    }
}
