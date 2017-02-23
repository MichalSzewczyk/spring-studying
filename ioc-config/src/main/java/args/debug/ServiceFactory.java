package args.debug;

/**
 * Created by Michał Szewczyk on 2017-02-23.
 */
public class ServiceFactory {
    public ServiceInterface getService(Base type, Derived arg){
        switch(type.getValue()){
            case "first":
                return new FirstService(arg.getValue());
            default: throw new IllegalArgumentException("Service type not supported.");
        }
    }
}
