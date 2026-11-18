public class CounttheDigit {
    public static void main(String[] args) {
        
        int num=34216437;
        int count=0;

        while(num>0){

            num =num/10;

            count++;

        }
        System.out.println(" Total of digit" +count);
    }

    
}
