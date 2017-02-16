package combining;

import sun.plugin2.message.Message;

/**
 * Created by Michał Szewczyk on 2017-02-16.
 */
public class BankingService {
    private MessageSender first;
    private MessageSender second;
    BankingService(MessageSender first){
        this.first = first;
    }

    public void setSecond(MessageSender second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "BankingService{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
