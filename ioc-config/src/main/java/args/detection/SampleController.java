package args.detection;

/**
 * Created by Michał Szewczyk on 2017-02-21.
 */
public class SampleController {
    private FirstService firstService;
    private SecondService secondService;

    public SampleController(FirstService firstService, SecondService secondService) {
        this.firstService = firstService;
        this.secondService = secondService;
    }

    public FirstService getFirstService() {
        return firstService;
    }

    public SecondService getSecondService() {
        return secondService;
    }
}
