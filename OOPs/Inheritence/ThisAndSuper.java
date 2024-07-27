 class A{ // this is an constructor
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println(" in A int");
    }
}
 class B extends A{
    public B(){// this is an constructor
        super();
        System.out.println("in B");
    }
    public B(int n){
        // super();
        // super(5);// this line stating that call the super class parameterised  constructor which is class A parameterised constructor
        this();// this keyword just execute all constructors of the same class here is B class;
        System.out.println(" in B int");
    }
}
public class ThisAndSuper{
    public static void main(String args[]){
        B b= new B(5);// as now it is parametraised constructor so calling the B parameterised constructor
        // B b= new B();
        // Starting
        // since in result you can see that the constructor of B had executed but why the constructor of a executed 

        // this is because  there is a default method which is called super method 
        //which execute automatically as you mention or not as first the super method execute then the constructor executed
        // as if first the super class executed then whats in the super method
        //super method just simply call the super class constructor and the super class of B is A so first calling the super class constructor And then the constructor of B
    }
}
