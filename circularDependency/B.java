package circularDependency;

public class B {

    public A a;

    public B() {
        this.a = new A();
    }
    public void  print(){
        System.out.println("printed : "+a.print());
    }
}
