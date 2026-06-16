import java.util.HashMap;

public class FruitBasket {
    public static void main(String[] args) {
        int []fruits={3,3,3,1,2,1,1,2,3,3,4};
        int l=0,r=0,max_size=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(r=0;r<fruits.length;r++){
            int current=fruits[r];
            map.put(current,map.getOrDefault(current,0)+1);

            while(map.size()>2){
                int left=fruits[l];
                map.put(left,map.get(left)-1);
                if(map.get(left) ==0) map.remove(left);
                l++;
            }

            max_size=Math.max(max_size,r-l+1);
        }
        System.out.println(max_size);
    }
}
