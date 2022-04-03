public class TreadExmpl extends Thread{
    public void run(){
        System.out.println("Thread is running "+Thread.currentThread().getPriority());
        try {
            for (int i=1;i<5;i++){
                Thread.sleep(3000);
            }
        }
        catch (Exception E){
            System.out.println(E);
        }
    }
    public static void main(String[] args) {
        TreadExmpl S=new TreadExmpl();
        TreadExmpl S1=new TreadExmpl();
        S.setPriority(Thread.MAX_PRIORITY);
        S1.start();
        S.start();

    }
    
}
