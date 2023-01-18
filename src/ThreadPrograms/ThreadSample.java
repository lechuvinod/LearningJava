package ThreadPrograms;

public class ThreadSample {
    public static void main(String[] args) {
ThreadClass threadClass1 = new ThreadClass(1);
ThreadClass threadClass2 = new ThreadClass(2);
ThreadClass threadClass3 = new ThreadClass(3);
threadClass1.start();
threadClass2.start();
threadClass3.start();
// public class ThreadClass implements Runnable
        /*threadClass1.run();
        threadClass2.run();
        threadClass3.run();*/
    }
}
