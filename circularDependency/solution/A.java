package circularDependency.solution;

public class A {
    public B b;

    public void set(B b){
        this.b=b;
    }

    public  String print(){
        return " A";
    }
}
