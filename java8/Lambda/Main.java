package java8.Lambda;

public class Main {

    public static void main(String[] args) {
        Addable addable=(a,b)->{
            System.out.println(a);
            System.out.println("String name :: "+b);
        };
        addable.add(10,"keshav");

    }

}
