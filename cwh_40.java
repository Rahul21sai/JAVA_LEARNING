// if private use getter and setter to get the output


class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name ;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getid(){
        return id;
    }

}





public class cwh_40 {
    public static void main(String[]args){
        MyEmployee rahul =  new MyEmployee();
     //   rahul.id = 45;
      //  rahul.name = "code with rahul"; //-->throws an error due to private access modifer
    rahul.setName("code with rahul");
        System.out.println(rahul.getName());
        rahul.setId(2334);
        System.out.println(rahul.getid());


    }
}
