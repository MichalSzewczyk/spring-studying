package constructor;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class Wheels {
    private Wheel one;
    private Wheel two;
    private Wheel three;
    private Wheel four;

    public Wheels(Wheel one, Wheel two, Wheel three, Wheel four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                ", four=" + four +
                '}';
    }
}
