public class ListingThread implements Runnable {
    Thread thread;
    String threadName;

    public ListingThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run () {
        try {
            for (int i=0;i<=10;i++) {
                System.out.println(threadName + " :" + i);
            }
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void start() {
        if(thread == null) {
            thread = new Thread(this,this.threadName);
        }
        thread.start();
    }
}
