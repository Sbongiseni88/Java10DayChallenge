package recursion.memoization;
//5 factorial == 5*4*3*2*1 = 120
public class factorial {
    public static void main(String[] args) {
        int num;
        int res=0;

        res=fact(5);
        System.out.println(res);

    }
    public static int fact(int num){

        if (num==1){
            return 1;
        }
        return num * fact(num-1);
//        int val=1;
//        for (int i=1;i<=num;i++){
//            val=val*i;
//        }
//        return val;
    }
}
