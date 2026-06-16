public class CanPlaceFlowers {
    public static void main(String[] args) {
        int []flowerbed = {0, 1, 0};
        int n = 1,i=0;

        for(i=0;i<=flowerbed.length-1;i++){
            if(flowerbed[i]==0){
                boolean leftEmpty = (i==0 || flowerbed[i-1]==0);

                boolean rightEmpty =  (i==flowerbed.length-1 || flowerbed[i+1]==0);

                if(leftEmpty && rightEmpty){
                    System.out.println("u can plant");
                    n--;
                    if(n<=0){
                        System.out.println(true);
                    }else{
                        System.out.println(false);
                    }
                }



            }
        }
    }
}
