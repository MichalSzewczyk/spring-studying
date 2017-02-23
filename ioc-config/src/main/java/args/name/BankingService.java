package args.name;

import inheritance.concrete.Service;

import java.beans.ConstructorProperties;

/**
 * Created by Michał Szewczyk on 2017-02-23.
 */
public class BankingService extends ServiceTemplate{
    private String arg3;

    @ConstructorProperties({"arg3", "arg2", "arg1"})
    public BankingService(String arg3, String arg2, String arg1) {
        super(arg2, arg1);
        this.arg3 = arg3;
    }

    public String getArg3() {
        return arg3;
    }
    public String getArg2() {
        return arg2;
    }
    public String getArg1() {
        return arg1;
    }
}
