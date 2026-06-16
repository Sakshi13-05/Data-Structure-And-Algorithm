class Count{
    int count=0,maxCount=0;
    int countVowels(String s1){
        count=0;
        s1=s1.toLowerCase();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') count++;
        }

        return count;
    }
    public int maxVowels(String s, int k) {
        int l=0,r=k;
        while(r<=s.length()){
            String s1=s.substring(l,r);

            count=countVowels(s1);
            l++;
            r++;
            if(maxCount<=count) maxCount=count;

        }
        return maxCount;
    }
}
public class MaxVowels {
    public static void main(String[] args) {
        Count c1=new Count();
        int ans=c1.maxVowels("weallloveyou",7);
        System.out.println(ans);
    }
}
