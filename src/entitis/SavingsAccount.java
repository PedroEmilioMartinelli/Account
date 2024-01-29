package entitis;

public class SavingsAccount extends  Account {
    private Double interestRate;

    public SavingsAccount(){
        super();

    }

    public SavingsAccount(Integer number, String holver, Double balace, Double interestRate) {
        super(number, holver, balace);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public  void updateBalance(){
        balace += balace * interestRate;

    }
    @Override
    public  void  withdraw(double amount){
        balace -= amount;
    }


}
