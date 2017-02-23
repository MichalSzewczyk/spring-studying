package inheritance.nonconcrete;

/**
 * Created by Michał Szewczyk on 2017-02-21.
 */
public class SmallerBankService {
    private BankService bankService;

    public SmallerBankService(BankService bankService) {
        this.bankService = bankService;
    }
}
