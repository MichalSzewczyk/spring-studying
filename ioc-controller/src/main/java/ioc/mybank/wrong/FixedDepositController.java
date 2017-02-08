package ioc.mybank.wrong;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 * <p>
 * Fixed deposit components.controller should be changed into Spring component
 */
public class FixedDepositController {
    private FixedDepositService fixedDepositService;

    public FixedDepositController() {
        this.fixedDepositService = new FixedDepositService();
    }

    public boolean submit() {
        return fixedDepositService.save();
    }
}
