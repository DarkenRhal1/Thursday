package draw;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class CheckCashingPlace {
    public static void main(String[] args) {

        String className = CheckCashingPlace.class.getName();

        SalariedEmployee salariedEmployee = new SalariedEmployee("Jim");
        salariedEmployee.getName();
        System.out.println("Name: " + salariedEmployee.getName());
        System.out.println("Type of Employee: SalariedEmployee");

        HireDate hireDate = new HireDate("02", "03", "04");
        salariedEmployee.sethireDate(hireDate);
        System.out.println(salariedEmployee.gethireDate());
        System.out.println("================");
        salariedEmployee.toString();
        salariedEmployee.calculatePay();

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Jimmy");
        salariedEmployee1.getName();
        System.out.println("Name: " + salariedEmployee1.getName());
        System.out.println("Type of Employee: SalariedEmployee" );
        new HireDate("3", "05", "06");
        salariedEmployee1.sethireDate(hireDate);
        System.out.println(salariedEmployee1.gethireDate());
        System.out.println("=====================");


        Entrepreneur entrepreneur = new Entrepreneur("NIcky");
        System.out.println(entrepreneur.getName());
        Entrepreneur entrepreneur1 = new Entrepreneur("05", 693.0, 9.0);
        entrepreneur.setExpenses(entrepreneur.getExpenses());
        System.out.println("Type of Employee: Entrepreneur " );
        System.out.println(entrepreneur.getExpenses());

//
//        System.out.println("Name: " + entrepreneur.getName());
//
        System.out.println("==============");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Josh");
        hourlyEmployee.getName();
        System.out.println("Name: " + hourlyEmployee.getName());
        System.out.println("Type of Employee: HourlyEmployee ");
        new HireDate("05", "07", "09");
        hourlyEmployee.sethireDate(hireDate);
        System.out.println(hourlyEmployee.gethireDate());
//
//        HumanResources humanResources = new HumanResources();
//
        Person[] person = {entrepreneur, hourlyEmployee, salariedEmployee, salariedEmployee1};

        Employee[] employee = {hourlyEmployee, salariedEmployee, salariedEmployee1 };
//
//
//       // System.out.println("Name: ");
////        HumanResources.printBadge(salariedEmployee);
////        String employeeType = "SalariedEmployee";
////        System.out.println("Type of employee: " + employeeType);
//
//        HireDate employee1 = new HireDate();
//        employee1.HireDate("January", "23", "2002");


      //  System.out.println( "Hired Date: " + employee1.hireDate("January", "2", "02"));

        System.out.println("==================");

        for (int i = 0; i < employee.length; i++){
            employee[i].getName();
            System.out.println(employee[i].getName());
           // HumanResources.printBadge(employee[i].getName());
        }
//
        System.out.println("==================");
        HumanResources.issueBadges(employee);

        System.out.println("==================");
        HumanResources.printPaymentInfo(employee);

        System.out.println("==================");
        System.out.println(HumanResources.issueBadges(employee));

        System.out.println("==================");



//        for (Employee i : employee) {
//            System.out.println(i);
//        }
       // HumanResources.issueBadges(employee);

       // HumanResources.printPaymentInfo();





    }
}
