package ContructorsExample;

public class HelloConstructors {
    int a = 320, b = 680;

    public HelloConstructors(int a, int b) {
        int sum;
        //this.a = a; //13
        //this.b = b; //14
        //sum = this.a + this.b; //27
        a = this.a; //320
        b = this.b; //680
        sum = a + b; //1000
        System.out.println("the sum is: " + sum);
    }
}
