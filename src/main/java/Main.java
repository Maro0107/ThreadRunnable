public class Main {
    public static void main(String[] args) {

        RunnableClass t1 = new RunnableClass(1000, "Thread1");
        Thread thread1 = new Thread(t1, "Thread1");
        thread1.start();

        RunnableClass t2 = new RunnableClass(1000, "Thread2");
        Thread thread2 = new Thread(t2, "Thread2");
        thread2.start();
    }
}
