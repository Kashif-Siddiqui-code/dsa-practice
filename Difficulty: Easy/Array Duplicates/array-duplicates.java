class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add elements that occurred more than once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        // Optional: Sort the result
        Collections.sort(result);

        return result;
    }
}