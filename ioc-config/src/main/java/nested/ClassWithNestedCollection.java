package nested;

import java.util.List;
import java.util.Set;

/**
 * Created by Michał Szewczyk on 2017-02-25.
 */
public class ClassWithNestedCollection {
    private List<List<Set<String>>> list;

    public ClassWithNestedCollection(List<List<Set<String>>> list) {
        this.list = list;
    }

    public List<List<Set<String>>> getList() {
        return list;
    }
}
