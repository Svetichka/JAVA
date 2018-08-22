public class Rekursija {
    public static void main(String[]args){
        int val= calcSum(1,-1);
        System.out.println(val);

    }
    static int calcSum(int a, int b){
        int sum=a+b;
        if (sum==0) {
            sum = calcSum(1, 1);
        }
        return sum;
    }
}


