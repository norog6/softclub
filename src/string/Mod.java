package string;

class Mod implements Runnable {
    private String str;
    private String threadName;

    public Mod(String str, String threadName) {
        this.str = str;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Попытка "изменить" строку (создание новой строки)
        str = str + " modified by " + threadName;
        System.out.println(threadName + " result: " + str);
    }
}
