package Thread.RunnnablePkg;

public class Client {
    public static void main(String[] args) {
        MultiThreading multiThreading=new MultiThreading();
        Thread th=new Thread(multiThreading);
        th.start();
    }
}
