package entitis;

public class BussinessAcount  extends Account {

    private Double loanlimit;


    public  BussinessAcount(){
        super();

    }

    public BussinessAcount(Integer number, String holver, Double balace, Double loanlimit) {
        super(number, holver, balace);
        this.loanlimit = loanlimit;
    }


    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }


    public  void  loan(double amont){

        if (amont <= loanlimit){
            balace += amont - 10.0;
        }


    }
    public  void  withdraw(double amount){
        super.withdraw(amount);
        balace -= 2.0;
    }



}
