public class Chaining_fun {

    public static void main(String[] args) {
        
        fun1();
        System.out.println("Bye");
    }
    
    static void fun1()
    {
        fun2();
        System.out.println("Hii");

    }

    static void fun2()
    {
        fun3();
        System.err.println("Hello");
    }

    static void fun3(){
        System.out.println("How Are You");
    }


}
