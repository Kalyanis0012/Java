package FileHandling;

import java.io.FileInputStream;
class  ReadDataFromFile {

public static void main(String[] args) {
    try {
        FileInputStream fis = new FileInputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Practice Programs.txt");
        int n = fis.available();
        byte[] b = new byte[n];
        fis.read(b);
        String s = new String(b);
        System.out.println(s);
    } catch (Exception e) {
        System.err.println(e);
    }
}
                 }