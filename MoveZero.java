class Help{
    public void moveZeroes(int[] nums) {
       int left=0,right=1;
       while (right<nums.length){
           boolean takeZero=(nums[left]==0);

           boolean takeNonZero=(nums[right]!=0);

           if(!takeNonZero) right++;
           if(!takeZero && left<right) left++;
           if(takeZero && takeNonZero){
               int temp=nums[left];
               nums[left]=nums[right];
               nums[right]=temp;
               left++;
               right++;
           }
       }
       for (int i=0;i< nums.length-1;i++){
           System.out.print(nums[i]+",");
       }
        System.out.print(nums[nums.length-1]);
    }
}
public class MoveZero {
    public static void main(String[] args) {
        Help h1=new Help();
        int []arr={4,0,0,0,0,3,2,5,1,4};
        h1.moveZeroes(arr);
    }
}
