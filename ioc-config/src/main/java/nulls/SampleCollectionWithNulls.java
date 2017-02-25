package nulls;

import java.util.Map;

/**
 * Created by Michał Szewczyk on 2017-02-25.
 */
public class SampleCollectionWithNulls {
    private Map<String, String> map;

    public SampleCollectionWithNulls(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getMap() {
        return map;
    }
}
