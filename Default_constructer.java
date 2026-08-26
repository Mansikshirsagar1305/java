public class Default_constructer {

    public static void main(String[] args) {
        

        Student s1= new Student("Mansi",23,"SVERI");

        System.out.println(s1.college);
        System.out.println(s1.name);
        System.out.println(s1.roll);


    }
    /**
     * Student
 
 String name;
    */
    static class Student {
        String name;
        int roll;
        String college;

    
        
    //parametrized Constructor

  Student( String n, int rn, String clg )
    {
     name=n;
       roll=rn;
         college=clg;
    }
    void MarkedAttendence()
    {
        System.out.println("marked Attendence" +name);
    }
}
    
}
