 

public class dectobin {
    public static int decToBin(int n){
        int bin=0;
        int power=0;
        while(n>0){
            
            int lastDigit=n%2;
            bin += lastDigit * Math.pow(10, power);
            power++;
            n /= 2;
        }
        return bin;

    }
    public static void main(String args[]){
        System.out.println(decToBin(10));
    }
}
