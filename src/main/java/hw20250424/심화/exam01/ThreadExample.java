package hw20250424.심화.exam01;

public class ThreadExample {
    public static void main(String[] args) {
        Thread MovieThread = new MovieThread();
        MovieThread.start();

        Runnable MusicRunnable = new MusicRunnable();
        Thread MusicThread = new Thread(MusicRunnable);
        MusicThread.start();
    }
}
