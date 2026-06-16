//class CanPlace{
//    boolean canPlaceFower(int flowerbed[],int extra){
//        if (extra<=0) return true;
//
//        else {
//
//            for (int i = 0; i < flowerbed.length; i++) {
//                if (flowerbed[i] == 0) {
//                    boolean isLeftEmpty = (i == 0 || flowerbed[i - 1] == 0);
//                    boolean isRightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
//
//                    if (isLeftEmpty && isRightEmpty) {
//                        flowerbed[i] = 1;
//                        extra--;
//                        if (extra <= 0) {
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}
//public class Revision3025 {
//    public static void main(String[] args) {
//        int arr[]={1,0,1,0,1};
//
//        int n=1;
//
//        CanPlace c1=new CanPlace();
//
//        boolean result=c1.canPlaceFower(arr,n);
//        System.out.println(result);
//
//
//    }
//}



class Reverse{

    boolean isVowel(char c){
        char a=Character.toLowerCase(c);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true;
        }
        return false;
    }
    String reverse(String s){
        char[] arr=s.toCharArray();

        int left=0,right=s.length()-1;

        while(left<right){
            if(!isVowel(arr[left])) left++;
            if(!isVowel(arr[right])) right--;

            if(isVowel(arr[left]) && isVowel(arr[right])){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }

        return new String(arr);
    }
}

public  class Revision3025 {
    public static void main(String[] args) {
         Reverse r1=new Reverse();
         String s1="IceCreAm";
         String ans=r1.reverse(s1);
        System.out.println(ans);
    }
}



















