// Division.java

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // Constructor requiring both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method
    public abstract void display();
}