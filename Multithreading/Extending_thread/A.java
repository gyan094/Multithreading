          //Extending_thread

package Multithreading.Extending_thread;

public class A extends Thread{
    public void run(){
        try{
        for(int i=1;i<=5;i++) {
            System.out.println("gyan");
            Thread.sleep(1000);
        }
        }catch (InterruptedException i){
            System.out.println(i);
        }
    }
}
class B{
    public static void main(String[] args) throws InterruptedException  {
        A t=new A();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("prakash");
            Thread.sleep(1000);
        }
    }
}
