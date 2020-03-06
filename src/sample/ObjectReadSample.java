package sample;

import main.io.MessageReader;
import main.io.ObjectMessage;

public class ObjectReadSample {
    public static void main(String[] args) {
        String fileName = "/tmp/test12";
        MessageReader reader = new MessageReader(fileName);
        reader.open();
        ObjectMessage message = new ObjectMessage();
        reader.read(message);
    }
}
