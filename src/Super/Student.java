package Super;

/*

 */
class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Pupil extends Student{
  float salary;
  Pupil( int id, String name, float salary){
      super(id, name); // reusing parent constructor
      this.salary = salary;
  }

  void display() {
      System.out.println(id + " " + name + " " + salary);
  }

}

class Test4 {
    public static void main(String[] args) {
        Pupil p1 = new Pupil(124,"Lan",25000);
        p1.display();

    }
}