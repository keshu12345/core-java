package circularDependency;

public class A {
    public B b;

    public A() {
        this.b = new B();
    }

    public String print() {
        return "A";
    }
}
