public class RunnableClass implements Runnable {
    private int sleepTime;
    private String threadName;

    public RunnableClass(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            System.out.println(threadName + " " + i);
            try{
                Thread.sleep(sleepTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
