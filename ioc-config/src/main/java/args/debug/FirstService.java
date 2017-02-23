package args.debug;

/**
 * Created by Michał Szewczyk on 2017-02-23.
 */
public class FirstService implements ServiceInterface {
    private final String arg;

    public FirstService(String arg) {
        this.arg = arg;
    }

    @Override
    public String method() {
        return arg;
    }
}
