// application of try

public class AIT {
    public static void main(String [] args){
        try {
            int[] myNumbers = {1,2,3,4};
            System.out.println(myNumbers[45]);
        }catch (Exception e){
            System.out.println(" Number is outside of range.");
        }
    }
}
