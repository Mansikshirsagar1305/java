public class Functionss {
    public static void main(String[] args) {
        

        greet();
        sayHello("Mansi");
        System.out.println(getNumber());;
       System.out.println( multiply(10, 20));
    }
//no i/p,no o/p
    static void greet(){
        System.out.println("Hello");
        return;
    }
    
//i/p ,No o/p
    static void sayHello(String name)
    {
        System.out.println("Hello" +name);

    }

    //No I/p,o/p
    static int getNumber()
    {
      return(10);
    }
    //I/p,O/p

    static int multiply(int a,int b)
    {
       return a*b;

    }
}
