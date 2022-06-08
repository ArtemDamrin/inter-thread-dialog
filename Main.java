public class Main {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        ThreadGroup group = new ThreadGroup("Stream");
        Thread stream1 = new Thread(group, myRunnable);
        Thread stream2 = new Thread(group,myRunnable);
        Thread stream3 = new Thread(group,myRunnable);
        Thread stream4 = new Thread(group,myRunnable);
        stream1.setName("1");
        stream2.setName("2");
        stream3.setName("3");
        stream4.setName("4");
        System.out.println("Создаю потоки...");
        stream1.start();
        stream2.start();
        stream3.start();
        stream4.start();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершаю все потоки!");
        group.interrupt();
    }
}
