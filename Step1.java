//--print all subseq


class Help2{
    String s="abc";


    void sub(int index,String res){
        if(index>=s.length()){
            if(res.equals("ax")){
                System.out.println(true);
            }
        }else{

            sub(index+1,res+s.charAt(index));

            sub(index+1,res);
        }
    }

}

public class Step1 {
    public static void main(String[] args) {

        Help2 h1=new Help2();
        h1.sub(0,"");



    }
}
