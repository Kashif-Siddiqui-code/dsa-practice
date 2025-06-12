class Solution {
    public int addDigits(int num) {
        // repreat until only one digit
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;    // get last digit
                num /= 10;          // remove last digit
            }
            num = sum;              // replace the orginial value with digit sum
        }
        return num;
        
    }
}