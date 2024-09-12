public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("samir poudel", 1000, "samirpoudel@gamil.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        System.out.println(" ");

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());
        System.out.println(" ");

        Customer thirdCustomer = new Customer("joe", "joe123@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());



    }
}
