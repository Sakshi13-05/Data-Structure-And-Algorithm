public class Candies {
    public static void main(String[] args) {
        int []candies = {2,3,5,1,3};
        int extraCandies = 3;
        int max=candies[0];
        boolean result[]=new boolean[candies.length];
        for(int i=1;i<=candies.length-1;i++){
            if(candies[i]>max) max=candies[i];
        }
        for(int i=0; i<=candies.length-1; i++){
            if(candies[i]+extraCandies>=max) result[i]=true;
            else result[i]=false;
        }
        for(int i=0; i<=result.length-1; i++){
            System.out.print(result[i]+",");
        }

    }
}
