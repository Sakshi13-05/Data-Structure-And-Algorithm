import java.io.PrintStream;

public class PdtExceptSelf {
    public static void main(String[] args) {
       int[] nums = {4,3,2,1,2};
       int[] leftPdt=new int [nums.length];
       int[] rightPdt=new int [nums.length];
       int[] result= new int[nums.length];

       int pdt=1;
       for(int i=0;i<= nums.length-1 ;i++) {
           if(i==0) leftPdt[i]=1;
           else {
               for (int j = i - 1; j >= 0; j--) {
                   pdt = pdt * nums[j];
               }
               leftPdt[i] = pdt;
               pdt=1;
           }
       }


       pdt=1;

       for(int i= 0; i<= nums.length-1 ;i++){
           if(i== nums.length-1) rightPdt[i]=1;
           else{
               for (int j = i +1; j<= nums.length-1; j++) {
                   pdt = pdt * nums[j];
               }
               rightPdt[i]=pdt;
               pdt=1;
           }
           result[i]=leftPdt[i]*rightPdt[i];
           System.out.print(result[i]+",");
       }


    }
}
