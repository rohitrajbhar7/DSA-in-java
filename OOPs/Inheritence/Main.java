public class Main{
    public static void main(String[] args){
    //    advCalc r= new advCalc();
    //    System.out.println(r.add(7,5));
    //    System.out.println(r.sub(7,5));
    //    System.out.println(r.mul(7,5));
    //    System.out.println(r.div(20.0f,5.0f));


    multiLevel r= new multiLevel();
    System.out.println(r.add(7,5));
    System.out.println(r.sub(7,5));
    System.out.println(r.mul(7,5));
    System.out.println(r.div(20.0f,5.0f));
    System.out.println(r.power(7.0,5.0));
    }
}
// java does not support multiple inheritence because of ambiguity

//problem of ambiguity---->
// suppose we have a class A and it has a method of show()
// and we have a class B and it has a method of show()
// we have a class C who is child class of both and if child class want to access the show method it does not accessed 
// because the compiler compiler confused which class of show method u r calling