package args.different;

/**
 * Created by Michał Szewczyk on 2017-02-21.
 */

/**
 * Passing primitive and component values to constructor via XML
 */
public class SampleController {
    private SampleService sampleService;
    private String stringValue;
    private int intValue;

    public SampleController(SampleService sampleService, String stringValue, int intValue) {
        this.sampleService = sampleService;
        this.stringValue = stringValue;
        this.intValue = intValue;
    }
    public boolean isProperlyCreated(int value){
        return sampleService!=null&& stringValue!=null && intValue == value;
    }
}
