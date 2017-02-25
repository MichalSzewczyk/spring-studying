package containers;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Michał Szewczyk on 2017-02-25.
 *
 * Example of configuration bean which contains containers as constructor arguments
 */
public class ClassWithContainers {
    private List<Integer> listType;
    private Map<Integer, Integer> mapType;
    private Set<Integer> intType;
    private Properties properties;

    public ClassWithContainers(List<Integer> listType, Map<Integer, Integer> mapType, Set<Integer> intType, Properties properties) {
        this.listType = listType;
        this.mapType = mapType;
        this.intType = intType;
        this.properties = properties;
    }

    public List<Integer> getListType() {
        return listType;
    }

    public Map<Integer, Integer> getMapType() {
        return mapType;
    }

    public Set<Integer> getIntType() {
        return intType;
    }

    public Properties getProperties() {
        return properties;
    }
}
