class Solution {
    public int maxArea(int[] height) {

        int maxlen=0,j=height.length-1,i=0;
        while(i<=j){
            int width=j-i;
            int small=Math.min(height[i],height[j]);
            maxlen=Math.max(maxlen,small*width);
            // System.out.println(maxlen);
            if(height[i]<height[j]) {
                i++;
            }else{
                j--;
            }
        }
        return(maxlen);
    }
}