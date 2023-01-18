package MultipleInheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        InheritanceA inheritanceA = new InheritanceA(30,20);

        int b = inheritanceA.b;
        int a = inheritanceA.a;
        inheritanceA.display();
        inheritanceA.parentDisplay();
    }
}
