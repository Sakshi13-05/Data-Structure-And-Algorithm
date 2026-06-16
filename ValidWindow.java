public class ValidWindow {
    public static void main(String[] args) {
        int []nums={10,5,2,6};
        int k=100;
        int count=0,pdt=1,left=0,right=0;

//        generate all subarray
        while(right < nums.length) {
            pdt *= nums[right];
            while (pdt >= k) {
                pdt /= nums[left];
                left++;
            }
            if (pdt < k) {
                count += right - left + 1;
            }
            right++;
        }
        System.out.println(count);

    }
}
