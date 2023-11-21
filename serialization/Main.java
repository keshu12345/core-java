package serialization;


import java.io.*;

public class Main {
    public static void main(String[] args){

        Employee employee=new Employee(101,"Keshav");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
        }catch (Exception ignore){

        }
        try{
            FileInputStream fileInputStream=new FileInputStream("data.ser");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Employee emp1= (Employee) objectInputStream.readObject();
            System.out.println("Id : "+emp1.Id+" "+" Name :"+emp1.name);

        }catch (Exception ignore){

        }


    }


}
