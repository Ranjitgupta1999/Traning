public class RuntimeExceptionHandling {
    public static void main(String[] args) {
        // array index out of bond

        int[] a={5,6,3,7,8,};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        try {
            System.out.println(a[8]);
        }
        catch (Exception d){
            System.out.println(d);
        }
        System.out.println("Excuted");

        //        int b= 6;
        //        try {
        //            System.out.println(b/0);
        //        }
        //        catch (Exception d){
        //            System.out.println(d);
        //        }
        //        System.out.println("program executed");
    }
}
