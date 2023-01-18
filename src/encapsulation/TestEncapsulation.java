package encapsulation;

public class TestEncapsulation
{

    public static void main(String[] args) {
        Account acc = new Account();

        // setting values through setter methods
        acc.setAcc_no(7561223132L);
        acc.setName("MayBank");
        acc.setEmail("mhd.shawal@gmail.com");
        acc.setAmount(5000000.00f);


        // getting values through getter method
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
