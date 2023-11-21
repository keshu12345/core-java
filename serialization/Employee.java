package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    int Id;
    String name;

    public Employee(int id, String name) {
        Id = id;
        this.name = name;
    }
}
