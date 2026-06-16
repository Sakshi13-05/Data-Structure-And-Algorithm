import java.util.*;

class String_Reversal{
    public static void main(String[] args) {
//        String s="sakshi";
//
//        int left=0,right=s.length()-1;
//
//        if(s==null) System.out.println("null");
//        else if (s.equals("")) System.out.println("");
//        else{
//            char []arr=s.toCharArray();
//            for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
//            while(left<=right){
//                char temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//                left++;
//                right--;
//           }
//            s=new String(arr);
//        }
//
//        System.out.println(s);

        int [] nums={1,2,4,5,6};
        int n=6;

        int sum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i< nums.length;i++) actualsum+=nums[i];

        int miss=sum-actualsum;
        System.out.println(miss);
    }
}