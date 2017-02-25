package idref;

import java.util.List;
import java.util.Map;

/**
 * Created by Michał Szewczyk on 2017-02-25.
 *
 * <idref> element gives as an opportunity to use bean's id as value. What is more, Spring automatically check if required bean
 *  exists in application context
 */
public class IdRefUsage {
    private Map<String,SampleBean> map;

    public IdRefUsage(Map<String, SampleBean> map) {
        this.map = map;
    }

    public Map<String, SampleBean> getMap() {
        return map;
    }
}
