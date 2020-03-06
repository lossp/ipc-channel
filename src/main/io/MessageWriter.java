package main.io;

public class MessageWriter {

    private MemoryMappedFile memoryMappedFile;
    private final String fileName;

    public MessageWriter(String fileName) {
        this.fileName = fileName;
    }

    public void open(){
        try {
            memoryMappedFile = new MemoryMappedFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(IpcMessage message) {
        message.write(memoryMappedFile);
    }
}
