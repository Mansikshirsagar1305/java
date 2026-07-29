
public class Arithmaticop {

    

public static void main(String[] args) {
    //oprators in java
    //Arithmatic oprator 

    int a=5;
    int b=10;
    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a/b;
    int g= b%a;

    System.out.println(c +"," + d +","+ e +","+ f+ ","+g);

    int h=a+2;

   // h=h+2;
   h+=2;

   h-=2;
   h*=3;
   h%=5;
    System.err.println(h);



    //increment  Decrement Oprator
    int i=5;
    i++;
    System.out.println(i);
    i--;
    System.out.println(i);


    //prifix and postfix oprator
    int j=5;
    j++;
    ++j;

    int k=j++;
   

    int l=++j;
    System.out.println(l);

}}