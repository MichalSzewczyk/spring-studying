package ioc.mybank_wrong;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 *
 * Fixed deposit controller should be changed into Spring component
 */
public class FixedDepositController {
    private FixedDepositService fixedDepositService;

    public FixedDepositController() {
        this.fixedDepositService = new FixedDepositService();
    }

    public boolean submit(){
        return fixedDepositService.save();
    }
}
