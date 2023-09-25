class A{
    public int a ;
    public int rahul(){
        return 4;
    }
    public void method2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void method2(){
        System.out.println(" i am method 2 of class B");
    }
    public void method3(){
        System.out.println(" i am method 3 of class B");

    }
}



public class cwh_48_method_overriding {
    public static void main(String[] args) {
     A a = new A();
     a.method2();
     B b = new B();
     b.method2();
     b.method3();

    }
}
