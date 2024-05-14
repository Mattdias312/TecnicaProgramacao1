
package Persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public  class Serializador {
    public static void gravar(String endereco, Object obj) throws FileNotFoundException, IOException{
        FileOutputStream outFile = new FileOutputStream(endereco);
        ObjectOutputStream s = new ObjectOutputStream(outFile);
        s.writeObject(obj);
        s.close();
    }
    
    public static Object ler(String endereco)
            throws FileNotFoundException,IOException,ClassNotFoundException{
        FileInputStream inFile = new FileInputStream(endereco);
        ObjectInputStream s = new ObjectInputStream(inFile);
        Object objeto =s.readObject();
        s.close();
        return objeto;
    } 
    
}
