package draw;

public class HumanResources {

    public static void printBadge(Employee employee) {
        /*
        Get employee name
        Print badge
         */
        String employeeName = employee.getName();
        System.out.println(employeeName);
    }
    public static boolean issueBadges(Employee[] employee) {
       for (Employee employee1 : employee) {
           // Employee[] employeeName = employee;
            System.out.println(employee1.getName());
       }
        return false;
    }

    public static void printPaymentInfo(Employee[] employee) {
        for (Employee employee1 : employee) {
            // Employee[] employeeName = employee;
            System.out.println(employee1.getClass().getName() + " " + employee1.getName());


                System.out.println("Payment: " + employee1.calculatePay());

        }

//        String employeeName = employee.getName();
//        System.out.println(employeeName);

    }
}
