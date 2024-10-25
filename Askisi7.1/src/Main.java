import java.io.*;

public class Main {
    public static void writeIntsToFile(int maxpin, String fname) {
        int[] matrix = new int[maxpin];
        for (int i = 0; i < matrix.length; i++)
            matrix[i] = i * 20;
        try {
            FileOutputStream file = new FileOutputStream(fname);
            DataOutputStream data = new DataOutputStream(file);
            for (int i = 0; i < matrix.length; i++)
                data.writeInt(matrix[i]);
            data.close();
        }
        catch (IOException error) {
            System.out.println("Error: " + error.toString());
        }
    }
    public static void readIntsFromFile(String fname) {
        int count = 0;
        try {
            FileInputStream file = new FileInputStream(fname);
//            BufferedInputStream buff = new BufferedInputStream(file);
            DataInputStream data = new DataInputStream(file);
            try {
                while (true) {
                    int input = data.readInt();
                    count++;
                    System.out.print(input + ", ");
                }
            } catch (EOFException eof) {
                data.close();
                System.out.println("\nIntegers read: " + count);
            }

        } catch (IOException error) {
            System.out.println("Error: " + error.toString());
        }
    }
    public static void readBufferedIntsFromFile(String fname) {
        int count = 0;
        try {
            FileInputStream file = new FileInputStream(fname);
            BufferedInputStream buff = new BufferedInputStream(file);
            DataInputStream data = new DataInputStream(buff);
            try {
                while (true) {
                    int input = data.readInt();
                    count++;
                    System.out.print(input + ", ");
                    }
                } catch (EOFException eof) {
                buff.close();
                System.out.println("\nIntegers read: " + count);
            }

        } catch (IOException error) {
            System.out.println("Error: " + error.toString());
        }
    }
    public static void writeBufferedIntsToFile(int maxpin, String fname) {
        int[] matrix = new int[maxpin];
        for (int i = 0; i < matrix.length; i++)
            matrix[i] = i * 20;
        try {
            FileOutputStream file = new FileOutputStream(fname);
            BufferedOutputStream buff = new BufferedOutputStream(file);
            DataOutputStream data = new DataOutputStream(buff);
            for (int i = 0; i < matrix.length; i++)
                data.writeInt(matrix[i]);
            data.close();
        }
        catch (IOException error) {
            System.out.println("Error: " + error.toString());
        }
    }
    public static void writeBytesToFile(String fname) {
        int[] data = { 34, 76, 2, 7, 35, 22, 65, 2, 8, 43, 73,
                12, 65, 82, 43, 81, 9, 15, 43, 72, 83,
                47, 78, 0, 1, 234, 235, 154, 134, 14, 185,
                255, 214, 14, 63, 56, 73, 87, 25, 34, 166,
                125, 34, 47, 236, 64, 127, 194, 13, 99, 10};
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(fname);
            for (int i = 0; i < data.length; i++)
                file.write(data[i]);
        } catch (IOException error) {
            System.out.println("Error: " + error.toString());
        }
        finally {
            if (file != null)
                try {
                    file.close();
                } catch (IOException error) {
                    System.out.println("Error: " + error.toString());
                }
        }
    }
    public static void readBytesFromFile(String fname) {
        try {
            FileInputStream file = new FileInputStream(fname);
            boolean eof = false;
            int count = 0;
            while (!eof) {
                int input = file.read(); // Η .read() διαβάζει 1 byte.
                if (input == -1)
                    eof = true;
                else {
                    System.out.print(input + ", ");
                    count++;
                }
            }
            file.close();
            System.out.println("\nBytes read: " + count);
        } catch (IOException error) {
            System.out.println("Error: " + error.toString());
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!\nΑΣΚΗΣΗ ΠΡΑΞΗΣ 7.1");
        writeBytesToFile("./File_with_bytes.dat");
        readBytesFromFile("./File_with_bytes.dat");
        writeIntsToFile(100, "./File_with_Integers.dat");
        writeBufferedIntsToFile(100, "./File_with_Integers.dat"); // Πολύ πιο γρήγορη εγγραφή με τη χρήση της κλάσης BufferedInputStream
        readIntsFromFile("./File_with_Integers.dat");
        readBufferedIntsFromFile("./File_with_Integers.dat"); // Πολύ πιο γρήγορη ανάγνωση με τη χρήση της κλάσης BufferedInputStream
    }
}