
class MyRunnable implements Runnable{
    String message;

    public MyRunnable(String message) {
        this.message=message;
    }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(message+" "+i);
        }
    }
    
}
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyRunnable("Thread1 is running"));
        Thread t2=new Thread(new MyRunnable("Thread2 is running"));
        t1.start();
        t2.start();

    }
}
