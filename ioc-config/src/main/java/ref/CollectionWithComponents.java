package ref;

import java.util.List;

/**
 * Created by Michał Szewczyk on 2017-02-25.
 */
public class CollectionWithComponents {
    private List<SampleBean> list;

    public CollectionWithComponents(List<SampleBean> list) {
        this.list = list;
    }

    public List<SampleBean> getList() {
        return list;
    }

}
