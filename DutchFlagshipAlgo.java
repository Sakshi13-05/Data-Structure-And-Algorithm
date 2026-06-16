public class DutchFlagshipAlgo {
    static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    public static void main(String[] args) {
        int []nums={2,0,2,1,1,0};

//        int count0=0,count1=0,count2=0;
//
//        for(int i=0;i< nums.length;i++){
//
//            if(nums[i]==0) count0++;
//            if(nums[i]==1) count1++;
//            if(nums[i]==2) count2++;
//        }
//        System.out.println(count0+" "+count1+" "+count2);
//        int i,j,k;
//        for(i=0;i<count0;i++) nums[i]=0;
//        for(j=i;j<count1+i;j++) nums[j]=1;
//        for(k=j;k<count2+j;k++) nums[k]=2;
//        for (i=0;i< nums.length;i++) System.out.println(nums[i]);

        int low=0,mid=0,high= nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                for(int i=0;i<nums.length;i++){
                    System.out.println("when mid==0");
                    System.out.println(nums[i]);
                }
                System.out.println("---------------");
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                System.out.println("when mid==1");
                for(int i=0;i<nums.length;i++){
                    System.out.println(nums[i]);
                }
                System.out.println("---------------");
                mid++;
            }
            else if(nums[mid]==2){
                System.out.println("when mid==2");
                swap(nums,mid,high);
                for(int i=0;i<nums.length;i++){
                    System.out.println(nums[i]);
                }
                System.out.println("---------------");
                high--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
//use if else ladder so that a  time only one iteration happens at a time
