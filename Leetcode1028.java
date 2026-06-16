public class Leetcode1028 {
    public static void main(String[] args) {
        String s="abcd";
        String t="cdef";
        int maxCost=3;

        int l=0,max_len=0,sum_cost=0;
        for(int r=0;r<s.length();r++){
            int current_S=s.charAt(r);
            int current_T=t.charAt(r);
            sum_cost+=Math.abs(current_T-current_S);
            while(sum_cost>maxCost){
                int left_S=s.charAt(l);
                int left_T=t.charAt(l);
                sum_cost-=Math.abs(left_T-left_S);
                l++;
            }
            max_len=Math.max(max_len,r-l+1);
        }
        System.out.println(max_len);
    }
}
