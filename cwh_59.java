interface mycamera2{
    void takesnapshot();
    void recordVideo();
    private void great(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        great();
        System.out.println("recording in 4k ...");
    }

}
interface mywifi2{
    String[] getnetworks();
    void connecttonetworks(String network);
}
class mycellphone2 {
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }

    void pickcall() {
        System.out.println("connecting");
    }
}
class mysmartphone2 extends mycellphone implements mywifi2,mycamera2{
    public void takesnap(){
        System.out.println("taking the snap");
    }

    @Override
    public void takesnapshot() {

    }

    public void recordVideo(){
        System.out.println("taking snap");
    }
    public String[] getnetworks(){
        System.out.println("getting list of networks");
        String[] networklist = {"rahul","prashant","anjali"};
        return networklist;
    }

    @Override
    public void connecttonetworks(String network) {

    }

    public void connecttonetworks(){
        System.out.println("taking snap");
    }
}



public class cwh_59 {
    public static void main(String[] args) {
        mycamera2 cam1 = new mysmartphone2();
        //cam1.getnetworks();>> not allowed
        cam1.record4kvideo();
    }
}
