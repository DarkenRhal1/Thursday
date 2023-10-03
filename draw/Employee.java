package draw;

public abstract class Employee extends Person implements IPayable{

   // String className = CheckCashingPlace.class.getName();

    private HireDate hireDate;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }
//    public Employee() {
//        hireDate = new HireDate();
//    }

    public HireDate gethireDate() {
        return hireDate;
    }

    public void sethireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
}
