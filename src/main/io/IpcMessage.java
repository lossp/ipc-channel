package main.io;

public interface IpcMessage {
    /**
     * Writes a message
     */
    public void write(MemoryMappedFile messageMappedFile);


    /**
     * Reads a message
     */
    public void read(MemoryMappedFile messageMappedFile);


    /**
     * Returns the message type
     * @return returns the message type
     */
    public int type();
}
