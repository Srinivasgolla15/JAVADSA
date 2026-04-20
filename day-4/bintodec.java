

public class bintodec {
    public static void main(String args[]){
        System.out.println(binToDec(10));
    }

    public static int binToDec(int n){
        int dec=0;
        int power=0;
        while(n>0){
            int lastDigit = n%10;
            dec += lastDigit * Math.pow(2, power);
            power++;
            n /= 10;
        }
        return dec;

    }
}
