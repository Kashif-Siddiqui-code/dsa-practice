class Solution {
    static String decToBinary(int n) {
        
        StringBuilder binary = new StringBuilder();
        int rem = 0;
        while(n > 0){
            rem = n % 2;
            binary.append(rem);
            n = n/2;
        }
        return binary.reverse().toString();
        
    }
}