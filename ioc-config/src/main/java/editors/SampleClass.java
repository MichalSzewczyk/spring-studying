package editors;

/**
 * Created by Michał Szewczyk on 2017-02-25.
 */
public class SampleClass {
    private String value;

    public SampleClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "value='" + value + '\'' +
                '}';
    }
}
