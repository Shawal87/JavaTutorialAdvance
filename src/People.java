public class People {

    int rollno;
    String name;
    String city;

    People (int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String args []){
        People p1 = new People (102, "kamal","ampang");
        People p2 = new People (103, "Mike", "London");

        System.out.println(p1);
        System.out.println(p2);
    }

}
