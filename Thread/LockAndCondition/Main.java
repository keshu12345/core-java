package Thread.LockAndCondition;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();

//        Thread th1=new Thread(()->{
//                    sharedResource.Producer();
//                }
//        );
//        Thread th2=new Thread(()->{
//            sharedResource.Producer();
//        }
//        );
        SharedResource sharedResource2=new SharedResource();
        Thread th1=new Thread(sharedResource::Producer);
        Thread th2=new Thread(sharedResource2::Producer);
        th1.start();
        th2.start();

    }
}