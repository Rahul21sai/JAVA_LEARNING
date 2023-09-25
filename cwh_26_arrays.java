public class cwh_26_arrays {
    public static void main(String[] args) {
      /*  int [] marks = new int[5];
        marks[0]= 1090;
        marks[1]= 10000;
        marks[2]= 100;
        marks[3]= 10;
        marks[4]= 1000;
        System.out.println(marks[4]);*/
       // int[]marks = {98,5,545,45,34};
        int[]marks = {98,5,545,45,34};
        System.out.println(marks.length);

        //for loop
        for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        for(int element: marks){
            System.out.println(element);
        }

    }
}
