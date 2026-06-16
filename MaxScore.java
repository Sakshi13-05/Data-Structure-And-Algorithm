import java.util.HashMap;

public class MaxScore {
    public static void main(String[] args) {
        int []nums={4,2,4,5,6};
        int l=0,max_score=0,current_score=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int r=0;r< nums.length;r++){
            int current=nums[r];

            map.put(current, map.getOrDefault(current,0)+1);
            current_score+=current;

//            System.out.println(map+" "+r);

            while(map.containsValue(2)){
                int left=nums[l];
//                System.out.println(left+"---left");

                map.put(left,map.get(left)-1);
//                System.out.println(map+"----inside");

                current_score-=left;
//                System.out.println(max_score+"----inside maxscore");
                l++;
            }
            max_score=Math.max(max_score,current_score);
//            System.out.println(max_score+"----outside");
        }
        System.out.println(max_score);
    }
}
