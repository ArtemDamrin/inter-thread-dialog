public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(3000);
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " + Thread.currentThread().getName() +" остановлен");
        }
    }
}


