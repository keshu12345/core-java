package Thread.LockAndCondition.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable=false;

    public void produce(StampedLock lock){
        lock.asReadLock().lock();
        System.out.println("Read Lock acquired :"+Thread.currentThread().getName());
        try {
            isAvailable=true;
        }catch (Exception ignored){

        }
        finally {
            lock.asReadLock().unlock();
            System.out.println("Read Lock release :"+Thread.currentThread().getName());
        }
    }

    public void consume(StampedLock lock){
        lock.asWriteLock().lock();
        System.out.println("Write Lock acquired :"+Thread.currentThread().getName());
        try {
            isAvailable=false;
        }catch (Exception ignore){

        }
        finally {
            lock.asWriteLock().unlock();
            System.out.println("Write Lock Release:"+Thread.currentThread().getName());
        }
    }
}
