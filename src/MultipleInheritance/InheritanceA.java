package MultipleInheritance;

public class InheritanceA extends InheritanceASuper {
    int a = 200, b = 800;

    InheritanceA(int a, int b) {
        int sum;
        this.a = a;
        this.b = b;
        sum = this.a + this.b;
        System.out.println("The sum is: " + sum);
    }


    public void display() {
        super.display();
        System.out.println("I am class A");
    }
    public void parentDisplay() {
        super.display();
        display();
    }
}
