package ThreadPrograms;

public class ThreadClass extends Thread {
//public class ThreadClass implements Runnable {
    int a;

    public ThreadClass(int a) {
        this.a = a;
    }


    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("The ith element " + i + " of value a is " + a);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
