package args.matching;

import args.detection.*;

/**
 * Created by Michał Szewczyk on 2017-02-22.
 */
public class MainController {
    private FirstService firstService;
    private SecondService secondService;

    public MainController(FirstService firstService, SecondService secondService) {
        this.firstService = firstService;
        this.secondService = secondService;
    }
}
