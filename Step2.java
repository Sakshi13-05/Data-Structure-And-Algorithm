import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        //--pattern--
//        for(int rows=1;rows<=4;rows++){
//            for(int cols=5-rows;cols>=1;cols--){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        //--mul table--
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int mul=1;
//        for(int i=1;i<=10;i++){
//            System.out.println(n+"*"+i+"="+(n*i));
//        }

            //--max-min--
//           int arr[]={3, 5, 1, 9, 2, 8};
//           int max=arr[0],min=arr[0];
//           for(int i=1;i<= arr.length-1;i++){
//               if(min>arr[i]) min=arr[i];
//               if(max<arr[i]) max=arr[i];
//           }
//           System.out.println(max);
//           System.out.println(min);

//           check if array is sorted

             Step2 s=new Step2();
             int arr[]={10, 20, 30, 25, 40};
             boolean ans=s.isSorted(arr);
             System.out.println(ans);

    }
    boolean isSorted(int arr[]){
        int i=0;
        while(i<= arr.length-2){
            if (arr[i]<=arr[i+1]) {
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}
