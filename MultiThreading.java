public class MultiThreading extends Thread {
    public void run(){
        try {
            System.out.println("Threads "+Thread.currentThread().getId()+" is running");
        }
        catch (Exception D){
            System.out.println(D);
        }
    }
    public static void main(String[] args) {
        int a=4;
        for (int i=0;i<a;i++){
            MultiThreading de=new MultiThreading();
            de.start();
        }

    }
    
}
