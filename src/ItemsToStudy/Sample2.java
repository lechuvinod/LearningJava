package ItemsToStudy;

public class Sample2 {
    public static void main(String args[]) {
        double firstResultValue = 0.016782;//0.000973;
        double secondResultValue = 0.016808;//0.000949;
        double absolueDifference = Math.abs(firstResultValue - secondResultValue);
        System.out.println("absolueDifference" + absolueDifference);

     if(Math.abs(absolueDifference / firstResultValue) < 0.02){
        System.out.println("hiii");
    }else {
         System.out.println("no hiii");
     }

    }
}
