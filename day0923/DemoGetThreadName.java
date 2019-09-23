public class DemoGetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("xiaoming");
        mt.start();

        new MyThread("xiaoqiang").start();

        System.out.println(Thread.currentThread().getName());
    }
}
