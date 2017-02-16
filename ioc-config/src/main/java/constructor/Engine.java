package constructor;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class Engine {
    private int hp;
    private String producer;

    public Engine(int hp, String producer) {
        this.hp = hp;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "hp=" + hp +
                ", producer='" + producer + '\'' +
                '}';
    }
}
