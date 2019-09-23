// 1.创建一个Thread类的子类
public class MyThread extends Thread{
    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }
/*    // 2.在Thread类的子类中重写Thread类中的run方法
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }*/

    @Override
    public void run() {
/*        // 获取线程名称方法一
        String name = getName();
        System.out.println(name);*/

        // 获取线程名称方法二
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
