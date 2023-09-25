class mythr1 extends Thread{
    public mythr1(String name){
        super(name);

    }
    public void run(){
        int i =34;
        System.out.println("thank you" + this.getName());


    }
}

public class cwh_74 {
    public static void main(String[] args) {
        // ready queue: T1 t2 t3 t4 t5
        mythr1 t1 = new mythr1("rahul1");
        mythr1 t2 = new mythr1("rahul2");
        mythr1 t3 = new mythr1("rahul3");
        mythr1 t4 = new mythr1("rahul4");
        mythr1 t5 = new mythr1("rahul5   (most important)");
        t5.setPriority(mythread.MAX_PRIORITY);
        t3.setPriority((mythread.MIN_PRIORITY));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
