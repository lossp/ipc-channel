package sample;

import main.io.MessageWriter;
import main.io.ObjectMessage;

public class ObjectWriteSample {

    public static void main(String[] args) {
        String fileName = "/tmp/test12";
        MessageWriter writer = new MessageWriter(fileName);
        writer.open();
        ObjectMessage message = new ObjectMessage(100, "ric", "Police");
        writer.write(message);
    }

}
