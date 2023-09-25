
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
      int i = 34;
        System.out.println("thank you");

      }
    }



public class cwh_73 {
    public static void main(String[] args) {
        mythr t1 = new mythr("harry");
        mythr t2 = new mythr("ram candr");
        t1.start();
        t2.start();
        System.out.println("the id of the thread t is "+t1.getId());
        System.out.println("the id of the thread t is "+t1.getName());
        System.out.println("the id of the thread t is "+t2.getId());
        System.out.println("the id of the thread t is "+t2.getName());
    }
}
