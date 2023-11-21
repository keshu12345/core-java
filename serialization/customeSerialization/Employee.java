package serialization.customeSerialization;

import java.io.*;

public class Employee implements Serializable {
   transient final int Id = 110;
    String name = "keshav";
    transient String password = "pass";


    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {

        objectOutputStream.defaultWriteObject();
        String password = 123+"pass";
        objectOutputStream.writeObject(password);

    }

    @Serial
    private  void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {


        objectInputStream.defaultReadObject();
        String pass= (String) objectInputStream.readObject();
          password= pass.substring(3);

    }

}
