package constructor;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class Wheel {
    private String place;

    public Wheel(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "place='" + place + '\'' +
                '}';
    }
}
