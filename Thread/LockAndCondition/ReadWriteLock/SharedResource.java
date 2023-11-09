package Thread.LockAndCondition.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable=false;

    public void Producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Read Lock Acquired by :"+Thread.currentThread().getName());
            Thread.sleep(8000);

        }catch (Exception ignored){

        }
        finally {
            lock.readLock().unlock();
            System.out.println(" Read Locked released by: "+Thread.currentThread().getName());
        }

    }

    public void consume(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock Acquired by :"+Thread.currentThread().getName());
        }catch (Exception ignored){

        }
        finally {
            lock.writeLock().unlock();
            System.out.println(" Write Locked released by: "+Thread.currentThread().getName());
        }

    }
}
