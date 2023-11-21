package serialization.transientKey;

import java.io.Serializable;

public class Employee implements Serializable {
    int Id;
    String name ;
    transient String  password;

    public Employee(int id, String name, String password) {
        Id = id;
        this.name = name;
        this.password = password;
    }
}
