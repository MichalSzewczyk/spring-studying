package other;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class DaoAdditionalInfo {
    private String info;

    public DaoAdditionalInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "DaoAdditionalInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
