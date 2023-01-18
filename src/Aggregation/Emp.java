package Aggregation;

public class Emp {

    int id;
    String name;
    Address address; // aggregation


    public Emp(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Kl","Federal","Malaysia");
        Address address2 = new Address("Perth","south carolina","Australia");

        Emp e = new Emp(120,"Tom" ,address1);
        Emp e2 = new Emp(458,"Jerry" ,address2);

        e.display();
        e2.display();

    }
}
