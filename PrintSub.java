import java.util.ArrayList;
import java.util.List;

class Subsequence{

    public boolean increasingTriplet(int[] nums) {
        boolean check=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]<=nums[j]){
                    int k=j+1;
                    while(k<nums.length){
                        if(nums[i]<=nums[k] && nums[j]<=nums[k]) return true;
                        k++;
                    }
                }
            }
        }
       return false;
    }
}
public class PrintSub {
    public static void main(String[] args) {
        Subsequence s1=new Subsequence();
        int []arr={0,4,2,1,0,-1,-3};
        boolean ans=s1.increasingTriplet(arr);
        System.out.println(ans);
    }
}
