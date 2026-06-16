public class Break_Continue {
    public static void main(String[] args) {
        //---print odd---
//        int sum=0;
//        for(int i=1;i<=50;i++){
//            if(i%2==0) continue;
//            sum +=i;
//        }
//        System.out.println(sum);

        //-- writing code for a Microsoft Azure IoT sensor that monitors temperature.--
//        int[] temps = {25, 28, 30, 34, 45, 22, 19};
//        for(int i=0;i<= temps.length-1;i++){
//            if(temps[i]>40) {
//                System.out.println("CRITICAL HEAT DETECTED: SHUTTING DOWN");
//                break;
//            }else{
//                System.out.print(temps[i]+" ");
//            }
//        }

//        --both the keywords--
        int[] prices = {10, -5, 20, 0, 80, 150, 30, 10};
        int totalPrice=0;

        for(int i=0;i<=prices.length-1;i++){
            if(prices[i]<=0){
                System.out.println("its an error");
                continue;
            }else{

                if(totalPrice>100) break;
                totalPrice +=prices[i];
            }
        }
        System.out.println(totalPrice);
    }
}
