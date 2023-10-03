package draw;

public class SalariedEmployee extends Employee{
   // String className = CheckCashingPlace.class.getName();

    public double salary;
    public SalariedEmployee(String name) {
        super(name);
    }




    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
