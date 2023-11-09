package Thread.LockAndCondition;

// ReadLock :: more than 1 thread can acquire lock
// WriteLock :: only 1 thread can acquire the lock
// synchronized work on the monitor lock that is associated with object
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;
    ReentrantLock lock=new ReentrantLock();
    public synchronized void Producer(){
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
