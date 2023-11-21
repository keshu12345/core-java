package Thread.LockAndCondition.StampedLock;


import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread Started...");
        StampedLock lock=new StampedLock();
        SharedResource sharedResource1=new SharedResource();

        Thread th1=new Thread(()->{
            System.out.println("Read Shared Resource");
            sharedResource1.produce(lock);
        });
        Thread th2=new Thread(()->{
            System.out.println("Read Shared Resource");
            sharedResource1.produce(lock);
        });
//        Thread th3=new Thread(()->{
//            System.out.println("Write Shared Resource");
//            sharedResource1.consume(lock);
//        });
        SharedResource sharedResource2=new SharedResource();
        Thread th3=new Thread(()->{
            System.out.println("Write Shared Resource");
            sharedResource2.consume(lock);
        });

        th1.start();
        th2.start();
        th3.start();
        System.out.println("Main thread completed...");
    }
}
