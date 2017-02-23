package inheritance.nonconcrete;

/**
 * Created by Michał Szewczyk on 2017-02-21.
 */
public class BiggerBankController {
    private BankService bankService;
    private String name;

    public BiggerBankController(BankService bankService, String name) {
        this.bankService = bankService;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
