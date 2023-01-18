public class Person {
   protected String  fname ="John";
   protected String lname="Wick";
   protected String email ="mdhas.dakdad.com";
   protected int age =23;
}

 class Student extends Person {
    private int graduationYear = 2018;
    public static void main (String [] args){
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
 }
