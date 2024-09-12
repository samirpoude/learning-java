public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmail(){
        return email;
    }
    // first constructor with all three field where
    // arguments are assigned directly to instance field.
    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // second constructor where it calls another constructor
    // to pass some literal values to each arguments.

    public Customer(){
        this("nobody", 115.55, "nobody@gmail.com");
    }

    public Customer(String name, String email){
        this(name, 1000, email);
    }

}
