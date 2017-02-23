package factory;

/**
 * Created by Michał Szewczyk on 2017-02-21.
 */
public class ControllerFactory {
    public Controller getController(String controllerName){
        switch(controllerName){
            case "OtherController":
                return new OtherController();
            case "SampleController":
                return new SampleController();
            default:
                throw new IllegalArgumentException("Wrong controller name.");
        }
    }
}
