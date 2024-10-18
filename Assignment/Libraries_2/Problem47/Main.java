package Libraries_2.Problem47;

import java.nio.file.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        try{
            Path file = Paths.get("Sample.txt");
            if(!(Files.exists(file))){
                Files.createFile(file);
                
                
            }else{
                System.out.println("File Already exists");

            }
            Files.write(file,("fiewereh").getBytes());
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}