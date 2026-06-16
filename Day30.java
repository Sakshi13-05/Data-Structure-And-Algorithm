public class Day30 {
    public static void main(String[] args) {
        int[] cardPoints = {1, 50,100,50,1};
        int k = 3;

        int totalSum=0,minWindow=0,maxWindow=0,current=0;

//        total sum
        for(int i=0;i<cardPoints.length;i++) totalSum+=cardPoints[i];

//        get win size
        int win_size=cardPoints.length-k;
        int l=win_size;
//        code
        if(win_size==0) System.out.println(totalSum);

        else {
            for (int i = 0; i < win_size; i++) current += cardPoints[i];
            minWindow=current;

            System.out.println("current" +current);

            while(l<cardPoints.length){



                current+=cardPoints[l]-cardPoints[l-win_size];
                 if(current<minWindow) minWindow=current;

                maxWindow=totalSum-minWindow;
                System.out.println("maxWindow" +maxWindow);

                 l++;



            }

        }
    }
}
