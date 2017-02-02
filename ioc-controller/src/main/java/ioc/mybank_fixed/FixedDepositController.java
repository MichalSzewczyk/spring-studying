package ioc.mybank_fixed;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 *
 * 1. Add fixedDepositService as an argument of constructor or setter method, instead of instantiating directly.
 * 2. Now we can use FixedDepositController as a Spring component.
 * 3. Information about objects used by this class, and dependencies between them are included in configuration metadata
 *    which is included in beans.xml
 *    There are also other ways of supplying metadata:
 *    a) via xml files
 *    b) via Java annotations
 *    c) via Java code
 *
 */
public class FixedDepositController {
    private FixedDepositService fixedDepositService;

    public FixedDepositController(FixedDepositService fixedDepositService) {
        this.fixedDepositService = fixedDepositService;
    }

    public boolean submit(){
        return fixedDepositService.save();
    }
}
