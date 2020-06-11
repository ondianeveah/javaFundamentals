package streams.fileInputStream;

import java.io.FileInputStream;

//read() - reads a single byte from the file
//read(byte[] array) - reads the bytes from the file and stores in the specified array
//read(byte[] array, int start, int length) - reads the number of bytes equal to length from the file and stores in the specified array starting from the position start
public class ReadMethod {
    public static void main(String args[]) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
