public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("tim", "11/01/1985", "01/01/2020" );
        System.out.println(tim);
        System.out.print("age = " + tim.getAge());
        System.out.println(" pay = " + tim.collectPay());

        salariedEmployee joe = new salariedEmployee("joe", "11/11/1980", "11/11/2019", 35000);
        System.out.println(joe);
        System.out.println("joe's paycheck = " + joe.collectPay() );
        joe.retire();
        System.out.println("joe's pension check = $" + joe.collectPay());
        hourlyEmployee mary = new hourlyEmployee("mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("mary's paycheck = $" + mary.collectPay());
        System.out.println("mary's holiday pay = $" + mary.getDoublePay());

    }
}
