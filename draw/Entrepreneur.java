package draw;

public class Entrepreneur extends Person implements IPayable{
   String className = CheckCashingPlace.class.getName();

    private double revenue;
    private double expenses;

    public Entrepreneur(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public Entrepreneur(String name) {
        super(name);
    }

    @Override
    public double calculatePay() {
        return revenue-expenses;
    }
}
