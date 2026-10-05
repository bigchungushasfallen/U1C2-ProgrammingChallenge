public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) Math.round(average);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        userDouble *= 100;
        int hundred = (int) Math.floor(userDouble / 10000);
        int tens = (int) Math.floor(userDouble / 1000 % 10);
        int ones = (int) Math.floor(userDouble / 100 % 10);
        int tenths = (int) Math.floor(userDouble / 10 % 10);
        int hundredths = (int) Math.floor(userDouble % 10);

        hundred = (hundred + 1) % 10;
        tens = (tens + 1) % 10;
        ones = (ones + 1) % 10;
        tenths = (tenths + 1) % 10;
        hundredths = (hundredths + 1) % 10;
        return 100 * hundred + 10 * tens + ones + .1 * tenths + .01 * hundredths;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
