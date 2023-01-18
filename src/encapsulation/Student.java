package encapsulation;
//example of encapsulation that has only one field with its setter and getter methods.
//a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.


// Encapsulation
public class Student {

    //private data member
    private String name;

    //getter method for name
    public String getName(){
        return name;
    }

    //setter method for name
    public void setName(String name){
        this.name = name;
    }
}
