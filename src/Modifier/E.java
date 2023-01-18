package Modifier;

/* overriden subclass method with parent class with procted modifies

 */
class D {
    protected void msg() {System.out.println("Hello Java");}
}



public class E extends D {
    public static void main(String[] args) {
    //   void msg() {System.out.println("Hello java");}
        E obj = new E();
        obj.msg();
    }

}
