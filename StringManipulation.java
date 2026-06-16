public class StringManipulation {
    public static void main(String[] args) {
        String s="......a.....";
        System.out.println(s.indexOf("."));

        if(s.isEmpty()) System.out.println("is a palindrome");

        else if(s.length()==1) System.out.println("yes");

        else {
            String change = s.toLowerCase().replace(" ", "");
            System.out.println(change);
            System.out.println("-------------");

            int l=0,r=change.length()-1;
            while(l<r){
                if(!Character.isLetterOrDigit(change.charAt(l))) l++;
                else if(!Character.isLetterOrDigit(change.charAt(r))) r--;
                else if(change.charAt(l)==change.charAt(r)) {
                    if(l==r) break;
                    l++;
                    r--;
                }else{
                    break;
                }
            }
            if(l>=r) System.out.println("palindrome");
            else System.out.println("not");
        }


    }
}
