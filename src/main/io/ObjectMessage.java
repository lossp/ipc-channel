package main.io;

import java.io.*;

public class ObjectMessage implements IpcMessage {

    private int balance;
    private String name;
    private String job;


    public ObjectMessage() {
    }

    public ObjectMessage(int balance, String name, String job) {
        this.balance = balance;
        this.name = name;
        this.job = job;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void write(MemoryMappedFile messageMappedFile) {
        messageMappedFile.writeInt(this.balance);
        messageMappedFile.writeUTF(this.name);
        messageMappedFile.writeUTF(this.job);
    }

    @Override
    public int type() {
        return 1;
    }

    @Override
    public void read(MemoryMappedFile messageMappedFile) {
        int balance = messageMappedFile.readInt();
        String name = messageMappedFile.readUTF();
        String job = messageMappedFile.readUTF();
        System.out.println("balance = " + balance + " ,name = " + name + " ,job = " + job);
    }

}
