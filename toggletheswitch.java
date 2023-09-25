//toggle the switch
public class toggletheswitch {
    public static void main(String[] args) {
        int n = 5;
        boolean switchs[] = new boolean[n + 1];
        int oncount = 0;
        int ofcount = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if (switchs[j] == false) {
                    switchs[j] = true;
                } else {
                    switchs[j] = false;
                }
            }
            for (int k = 1; k <= n; k++) {
                if (switchs[k] == true) {
                    oncount = oncount + 1;
                } else {
                    ofcount = ofcount + 1;

                }

            }

            System.out.println(oncount);
            System.out.println(ofcount);
        }
    }
}