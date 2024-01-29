package entitis;

public class Account {
    private Integer number;
    private String holver;
    protected   Double balace;

    public Account(){

    }

    public Account(Integer number, String holver, Double balace) {
        this.number = number;
        this.holver = holver;
        this.balace = balace;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolver() {
        return holver;
    }

    public void setHolver(String holver) {
        this.holver = holver;
    }

    public Double getBalace() {
        return balace;
    }

   public void withdraw(double amount){
        balace -= amount + 5.0;
      }


    public void deposit(double amount){
        balace += amount;

    }
}
