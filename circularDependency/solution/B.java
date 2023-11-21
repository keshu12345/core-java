package circularDependency.solution;

public class B {

    public  A a;

    public void setA(A a) {
        this.a = a;
    }

    public void print(){
        System.out.println("Calling from B "+"printed : "+a.print());
    }
}
