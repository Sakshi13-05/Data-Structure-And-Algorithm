public class Reverse_Vowel {
    public static void main(String[] args) {
        String s = "leetcode";
        char[] arr=s.toCharArray();
        int left=0,right= arr.length-1;
        boolean leftGot=false,rightGot=false;

        while(left<right){

           if(arr[left]=='a'||arr[left]=='e'||arr[left]=='i'||arr[left]=='o'||arr[left]=='u'||arr[left]=='A'||arr[left]=='E'||arr[left]=='O'||arr[left]=='U'||arr[left]=='I'){
               leftGot=true;
           }
           if(arr[right]=='a'||arr[right]=='e'||arr[right]=='i'||arr[right]=='o'||arr[right]=='u'||arr[right]=='A'||arr[right]=='E'||arr[right]=='O'||arr[right]=='U'||arr[right]=='I'){
                rightGot=true;
           }
           if(leftGot && rightGot){
               char temp= arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
               left++;
               right--;


           }
           if (!leftGot){
               left++;
           }
           if(!rightGot){
               right--;
           }
            rightGot=leftGot=false;
        }

        String result=new String(arr);
        System.out.println(result);
    }
}
