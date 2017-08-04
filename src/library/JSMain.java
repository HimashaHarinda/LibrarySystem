
package library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class JSMain {

//inserting data serialize
 public static void Serialization( String fileName, Object object) throws IOException{
        try (FileOutputStream fileoutputstream = new FileOutputStream(fileName)){
            ObjectOutputStream objectOS = new ObjectOutputStream(fileoutputstream);
            objectOS.writeObject(object);
            objectOS.flush();
        }
}     
   //read data deserialize
   public static Object Deserialization(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileinputstream = new FileInputStream(fileName);
        ObjectInputStream objectIS = new ObjectInputStream(fileinputstream);
        return objectIS.readObject();
}    

}
