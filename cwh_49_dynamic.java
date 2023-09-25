class one{
    public void great(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("my name is java ");
    }
}
class two extends one {
    public void name(){
        System.out.println("my name is java in class two");
    }
    public void swagat(){
        System.out.println(" apka swagat");
    }
}

public class cwh_49_dynamic {
    public static void main(String[] args) {
   /* one obj = new one();
    two smobj = new two();
    obj.name();

    */
        one obj2 = new two();// yes allowed
        //two obj = new one();// not aloowed
    obj2.great();
    obj2.name();
    //obj2.swagat();//not allowed
    }
}
