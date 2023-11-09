package Thread.LockAndCondition.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        SharedResource sharedResource1=new SharedResource();
        Thread th1=new Thread(()->sharedResource1.Producer(lock));
        SharedResource sharedResource2=new SharedResource();
        Thread th2=new Thread(()->sharedResource2.Producer(lock));
        th1.start();
        th2.start();

    }
}
