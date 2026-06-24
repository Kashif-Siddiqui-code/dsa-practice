class Solution {
    public int lastStoneWeight(int[] stones) {
        // Max Heap
        PriorityQueue<Integer> maxHeap = 
                new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to heap
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        // Smash stones until at most one remains
        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(); // heaviest
            int x = maxHeap.poll(); // second heaviest

            if (x != y) {
                maxHeap.offer(y - x);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}