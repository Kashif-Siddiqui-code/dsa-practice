class Solution {
    public static void print_divisors(int n) {
        // To store divisors in order
        List<Integer> divisors = new ArrayList<>();
        
        // Loop till sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i); // i is a divisor
                if (i != n / i) {
                    divisors.add(n / i); // n / i is also a divisor (if not same)
                }
            }
        }
        
        // Sort the list to get ascending order
        Collections.sort(divisors);
        
        // Print the divisors
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
        
    }
