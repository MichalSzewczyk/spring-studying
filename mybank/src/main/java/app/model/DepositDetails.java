package app.model;

/**
 * Created by Michał Szewczyk on 2017-02-10.
 *
 */
public class DepositDetails {
    private String userID;
    private int amount;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
