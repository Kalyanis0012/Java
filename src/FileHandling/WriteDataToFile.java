package FileHandling;

import java.io.FileOutputStream;

public class WriteDataToFile {
    public static void main(String[] args){
        try{
            FileOutputStream fos= new FileOutputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Practice Programs.txt");
            String s="Hello java\nWelcome to FileOutput Stream";
            byte[] b= s.getBytes();
            fos.write(b);
            System.out.println("Data written successfully");
            fos.close();
         } catch (Exception e) {
            System.err.println(e);
        }
    }
}
