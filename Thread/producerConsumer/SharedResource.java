package Thread.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer>sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        this.sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public  synchronized  void produce(int item) throws InterruptedException {
        if(sharedBuffer.size()==bufferSize){
            System.out.println("Queue is fulled producer is waiting for produce");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced : "+item);
        // notify to consumer there is item to consume now
        notify();
    }

    public  synchronized  int consume() throws InterruptedException {
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty , Consumer waiting for consume");
            wait();
        }

        int item=sharedBuffer.poll();
        System.out.println("Consumed item : "+item);
        // notify to producer there is item to consume now
        notify();
        return item;
    }
}
