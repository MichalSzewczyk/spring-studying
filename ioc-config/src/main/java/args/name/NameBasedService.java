package args.name;

import java.beans.ConstructorProperties;

/**
 * Created by Michał Szewczyk on 2017-02-23.
 */
public class NameBasedService {
    private String arg1;
    private String arg2;
    private String arg3;

    @ConstructorProperties({"arg2", "arg3", "arg1"})
    public NameBasedService(String arg2, String arg3, String arg1) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public String getArg3() {
        return arg3;
    }
}
