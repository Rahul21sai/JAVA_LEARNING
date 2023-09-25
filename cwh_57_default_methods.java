interface mycamera{
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
interface mywifi{
    String[] getnetworks();
    void connecttonetworks(String network);
}
class mycellphone {
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }

    void pickcall() {
        System.out.println("connecting");
    }
}
class mysmartphone extends mycellphone implements mywifi,mycamera{
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
public class cwh_57_default_methods {
    public static void main (String[]args){
        mysmartphone ms =new mysmartphone();
        ms.record4kvideo();
        String[] ar = ms.getnetworks();
        for (String item: ar){
            System.out.println(item);
        }

    }
}
