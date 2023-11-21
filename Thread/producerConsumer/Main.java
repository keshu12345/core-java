package Thread.producerConsumer;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource(3);

        Thread th1=new Thread(()->{
            for(int i=1;i<=7;i++){
                try {
                    sharedResource.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread th2=new Thread(()->{
            try {
                for(int i=0;i<=7;i++) {
                    sharedResource.consume();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        th1.start();
        th2.start();

    }
}
