package Immutability;


// mutable is word for changeble.
// immutable is an object can't be changed once it's created.
class Mutable {
    private String s;
    public void setS(String newS)  // setting makes it mutable
    {s = newS;}

     public String getS()
     {return s;}
}

 final class Immutable{
    private String s = "name";
    public String getS()
    { return s;}
 }
