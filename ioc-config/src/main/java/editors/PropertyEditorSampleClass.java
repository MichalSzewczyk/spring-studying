package editors;

import java.util.Date;
import java.util.Properties;

/**
 * Created by Michał Szewczyk on 2017-02-25.
 *
 * PropertyEditor - introduced by JavaBeans implementation of mechanism used to to convert text values into Java values
 */
public class PropertyEditorSampleClass {
    private String string;
    private char[] charArray;
    private char charValue;
    private int intValue;
    private double doubleValue;
    private Properties properties;
    private SampleClass sample;

    public void setString(String string) {
        this.string = string;
    }

    public void setCharArray(char[] charArray) {
        this.charArray = charArray;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setSample(SampleClass sample) {
        this.sample = sample;
    }

    public String getString() {
        return string;
    }

    public char[] getCharArray() {
        return charArray;
    }

    public char getCharValue() {
        return charValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public Properties getProperties() {
        return properties;
    }

    public SampleClass getSample() {
        return sample;
    }
}
