//LEETCODE___1_______ CONSECUTIVE ONES|||

class Solution0703{
	public static void main(String[] args){
		int nums[]={1,1,1,0,0,0,1,1,1,1,1,0};
		int k=2;
		
		int l=0,r=0,count_zero=0,max_len=0;
		while(r<nums.length && l<=r){
			if(nums[r]==0){
				count_zero++;
				if(count_zero>k){
					while(count_zero!=k){
						if(nums[l]==0){
							count_zero--;
							System.out.println("inside----------"+max_len);
						}
						l++;
					}
			}
			}
			
			max_len=Math.max(max_len,r-l+1);
			r++;
			System.out.println("outside------"+max_len);
		}
		System.out.println("final========="+max_len);
		
	}
}