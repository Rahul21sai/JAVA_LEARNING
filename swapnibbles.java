public class swapnibbles {
    public static void main (String []args){
        int n = 150;
        int t = ((n&240)>>4)|((n&15)<<4);
        System.out.println(t);
    }
}