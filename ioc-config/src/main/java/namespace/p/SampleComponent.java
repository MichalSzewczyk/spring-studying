package namespace.p;

import namespace.SampleBean;

/**
 * Created by Michał Szewczyk on 2017-02-26.
 */
public class SampleComponent {
    private String stringValue;
    private int intValue;
    private SampleBean sampleBean;

    public SampleBean getSampleBean() {
        return sampleBean;
    }

    public void setSampleBean(SampleBean sampleBean) {
        this.sampleBean = sampleBean;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
