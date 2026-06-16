class Help4{
    public int maxArea(int[] height){
        int maxHeight=0,i=0,j=height.length-1;
        while(i<j){
            if(height[i]<=height[j]){
//                i is small
                if(maxHeight<=height[i]*(j-i)) maxHeight=height[i]*(j-i);
                i++;
            }else{
                if(maxHeight<=height[j]*(j-i)) maxHeight=height[j]*(j-i);
                j--;
            }
        }

        return (maxHeight);
    }
}
public class MaxWater {
    public static void main(String[] args) {
        Help4 h1=new Help4();
        int [] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(h1.maxArea(arr));
    }
}
