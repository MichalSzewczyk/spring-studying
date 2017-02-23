package args.debug;

/**
 * Created by Michał Szewczyk on 2017-02-23.
 */
public class ServiceFactory {
    public ServiceInterface getService(String type, String arg){
        switch(type){
            case "first":
                return new FirstService(arg);
            default: throw new IllegalArgumentException("Service type not supported.");
        }
    }
}
