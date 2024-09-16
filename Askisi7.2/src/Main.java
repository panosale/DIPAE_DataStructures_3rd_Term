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
    public static void writeBufferedIntsToFile(int maxpin, String fname, int step) {
        int[] matrix = new int[maxpin];
        for (int i = 0; i < matrix.length; i++)
            matrix[i] = i * step;
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
    public static void mergeFiles(String inp_f1, String inp_f2, String out_f) {
        try {
            FileInputStream inp_file1 = new FileInputStream(inp_f1);
            DataInputStream inp_data1 = new DataInputStream(inp_file1);
            FileInputStream inp_file2 = new FileInputStream(inp_f2);
            DataInputStream inp_data2 = new DataInputStream(inp_file2);
            FileOutputStream out_file = new FileOutputStream(out_f);
            DataOutputStream out_data = new DataOutputStream(out_file);
            int f1_data = 0, f2_data = 0;
            try {
                f1_data = inp_data1.readInt();
                f2_data = inp_data2.readInt();
                while (true) {
                    if (f1_data < f2_data) {
                        out_data.writeInt(f1_data);
                        System.out.println(f1_data + " from file1: " + inp_f1);
                        f1_data = inp_data1.readInt();
                    }
                    else {
                        out_data.writeInt(f2_data);
                        System.out.println(f2_data + " from file2: " + inp_f2);
                        f2_data = inp_data2.readInt();
                    }
                }
            } catch (EOFException eof) {
                if (inp_data1.available() > 0) {
                    inp_data2.close();
                    System.out.println(" exit file2: " + inp_f2);
                    try {
                        while (true) {
                            out_data.writeInt(f1_data);
                            System.out.println(f1_data + " from file1: " + inp_f1);
                            f1_data = inp_data1.readInt();
                        }
                    } catch (EOFException eof1) {
                        inp_data1.close();
                        out_data.close();
                    }
                }
                else {
                    inp_data1.close();
                    System.out.println(" exit file1: " + inp_f1);
                    try {
                        while (true) {
                            out_data.writeInt(f2_data);
                            System.out.println(f2_data + " from file2: " + inp_f2);
                            f2_data = inp_data2.readInt();
                        }
                    } catch (EOFException eof1) {
                        inp_data2.close();
                        out_data.close();
                    }
                }
            }
        } catch (IOException error) {
            System.out.println("Error: " + error);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!\nΑΣΚΗΣΗ ΠΡΑΞΗΣ 7.2");
        writeBufferedIntsToFile(10, "./Integers1_file.dat", 2);
        writeBufferedIntsToFile(10, "./Integers2_file.dat", 3);
        readBufferedIntsFromFile("./Integers1_file.dat");
        readBufferedIntsFromFile("./Integers2_file.dat");
        mergeFiles("./Integers1_file.dat", "./Integers2_file.dat", "./Integers_merged_file.dat");
        readBufferedIntsFromFile("./Integers_merged_file.dat");
    }
}