public class cwh_29 {
    public static void main(String[] args) {
        // practice 1
        /*float [] marks = {4.0f,5.0f,6.0f,55.0f,32.0f};
         float sum = 0;
        for (float element:marks){
            sum= sum+element;
        }
        System.out.println("sum is "+sum);*/
        // prac 2
       /* float [] marks = {4.0f,5.0f,6.0f,55.0f,32.0f};
        float num = 5.0f;
        boolean isInArray = false;
        for (float element:marks){
            if(num==element){
              isInArray = true;
              break;
            }
        }
        if (isInArray){
            System.out.println("the value is present in the Araay");
        }
        else{
            System.out.println("the value is not present in the array");
        }

        */
    // prac
      /*  float [] marks = {4.0f,5.0f,6.0f,55.0f,32.0f};
        float sum = 0;
        for (float element:marks){
            sum= sum+element;
        }
        System.out.println("the value of average marks is "+sum/ marks.length);

       */
        // prac 4
        int [][] mat1 ={{1,2,3},
                        {4,5,6}};
        int [][] mat2 ={{1,2,3},
                        {4,5,6}};
        int [][] result ={{0,0,0},
                          {0,0,0}};

        for(int i=0; i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("setting the values for i=%d and j=%d\n",i ,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0; i<mat1.length;i++) {
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+"  ");
                result[i][j]= mat1[1][j]+mat2[i][j];

            }
            System.out.println(" ");
        }
    }
}


