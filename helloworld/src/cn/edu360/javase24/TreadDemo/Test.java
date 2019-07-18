package cn.edu360.javase24.TreadDemo;

public class Test {
    public static void main(String[] args){
        KuCun kuCun = new KuCun();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();
        new Thread(new ShellRunnable(kuCun)).start();

    }
}
