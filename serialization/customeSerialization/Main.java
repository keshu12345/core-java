package serialization.customeSerialization;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data_custom.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
        } catch (Exception ignore) {

        }
        try {
            FileInputStream fileInputStream = new FileInputStream("data_custom.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee emp1 = (Employee) objectInputStream.readObject();
            System.out.println("Id : " + emp1.Id + " " + " Name :" + emp1.name + " " + " Password : " + emp1.password);

        } catch (Exception ignore) {

        }
    }

}
