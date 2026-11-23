public class Laergestelementinarray {

    public static void main(String[] args) {

        int[] arr={10,20,50,60,23};
        
        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
            System.out.println("largest Element"+max);
    }
    
}
