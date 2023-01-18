package ItemsToStudy;

public class Sample1 {
    public static void main(String args[]) {
        HelloSample s1 = new HelloSample();
        HelloSample s2 = new HelloSample();
        s1.a = 10;
        s1.b = 20;
        s2.a = 456;
        s2.b = 389;
       int sumSample1 = s1.a + s1.b;
       int sumSample2 = s2.a + s2.b;
        System.out.println("First sum: " + sumSample1);
        System.out.println("Second sum: " + sumSample2);
        s1.display();
        s2.display();
        s1.sumofVariables();
        s2.sumofVariables();
        s1.sumCalculate();
        s2.sumCalculate();
    }
}
