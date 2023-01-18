package ItemsToStudy;

public class staticJava {
    int a;
    static int b;
    public static void main(String[] args) {

        staticJava stJava = new staticJava();
        stJava.a=10;
        b=100;
        System.out.println(stJava.a);
        System.out.println(staticJava.b);
        stJava.nonstaticMethod();
        staticMethod();
    }
    public void nonstaticMethod(){
        System.out.println("non static method");
    }
    public static void staticMethod(){
        System.out.println("static Method");
    }
}
