public class Main {
    public static void main (String[] args){
        //bankAccount samirAccount = new bankAccount();
        bankAccount samirAccount = new bankAccount(11233, 120000,
                "samir", 34, "samirpoudel@gmail.com" );


        samirAccount.depositFund(100);
        samirAccount.withdrawFund(250);
        samirAccount.depositFund(1200);
        samirAccount.withdrawFund(650);

    }
}
