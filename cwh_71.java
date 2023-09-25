
class mythreadrunnable1 implements Runnable{
    public void run(){
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
        System.out.println("i am a thread 1 not a threat 1");
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
        System.out.println("i am a thread 2 not a threat 2");
    }
}



public class cwh_71 {
    public static void main(String[] args) {
    mythreadrunnable1 bullet1 = new mythreadrunnable1();
    Thread gun1 = new Thread(bullet1);
    mythreadrunnable2 bullet2 = new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
