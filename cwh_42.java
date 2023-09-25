class MyEmyployee{
    private int id ;
    private String name ;

    public MyEmyployee(){
        id =45;
        name = "your-name-here";

    }
    public MyEmyployee(String myname , int myid){
        id = myid;
        name = myname;
    }
    public String getname(){
        return name ;
    }
    public void setName(String n){
        name = n;
    }public void setid(int i ){
        id = i ;
    }
    public int getid(){
        return id ;

    }



}


public class cwh_42 {
    public static void main (String[]args){
       // MyEmyployee rahul = new MyEmyployee("programming with rahul",112);
        //rahul.setName("code with rahul");
       // rahul.setid(24);
       MyEmyployee rahul = new MyEmyployee();
        System.out.println(rahul.getid());
        System.out.println(rahul.getname());

    }
}
