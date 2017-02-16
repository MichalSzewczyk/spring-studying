package combining;

/**
 * Created by Michał Szewczyk on 2017-02-16.
 */
public abstract class MessageSender {
    abstract String sendMessage();
    public String toString(){
        return sendMessage();
    }
}



