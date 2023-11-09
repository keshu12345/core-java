package Thread.LockAndCondition.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;
    public void Producer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock Acquired by :"+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);

        }catch (Exception ignored){

        }
        finally {
            lock.unlock();
            System.out.println("Locked released by: "+Thread.currentThread().getName());
        }
    }
}
