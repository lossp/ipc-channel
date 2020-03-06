package main.io;

public class MessageReader {
    private final String fileName;
    private MemoryMappedFile memoryMappedFile;

    public MessageReader(String fileName) {
        this.fileName = fileName;
    }

    public void open() {
        try {
            memoryMappedFile = new MemoryMappedFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read(IpcMessage message) {
        message.read(memoryMappedFile);
    }
}
