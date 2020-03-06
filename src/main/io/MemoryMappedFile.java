package main.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class MemoryMappedFile {
    public final String name;
    public final RandomAccessFile file;
    public MemoryMappedFile(String name) throws Exception{
        this.name = name;
        this.file = new RandomAccessFile(this.name, "rw");
    }

    public void writeInt(int value) {
        try {
            file.writeInt(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeUTF(String value) {
        try {
            file.writeUTF(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int readInt() {
        try {
            return file.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String readUTF() {
        try {
            return file.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
