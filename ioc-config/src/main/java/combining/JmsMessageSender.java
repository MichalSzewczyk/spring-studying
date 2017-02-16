package combining;

/**
 * Created by Michał Szewczyk on 2017-02-16.
 */
public class JmsMessageSender extends MessageSender{

    @Override
    public String sendMessage() {
        return "jms";
    }
}
