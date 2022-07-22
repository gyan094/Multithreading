package Multithreading.runnable_interface;

public class A implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("gyan prakash ");
        }
    }
}
class B{
    public static void main(String[] args) {
        A r=new A();
        Thread t=new Thread(r);
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("golu ");
        }
    }
}
