
class mythread extends Thread{
    public void run(){
        while(true){
            System.out.println("my thread is running ");
            System.out.println("i am happy");
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
       while(true){
           System.out.println("thrad 2 is good");
           System.out.println("i am sad");
       }
    }
}


public class cwh_70 {
    public static void main(String[]args){
        mythread t1 = new mythread();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();




    }
}
