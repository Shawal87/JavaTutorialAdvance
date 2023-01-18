package Polymorphism;
  // Method Overloading: changing data type of arguments
class Pluss {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

    class TestOverloading2{
        public static void main(String[] args) {
            System.out.println(Pluss.add(45,42));
            System.out.println(Pluss.add(47.21,42.64));
        }
    }

