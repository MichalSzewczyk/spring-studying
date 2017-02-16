package constructor;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class Passenger {
    private String name;
    private String surname;

    public Passenger(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
