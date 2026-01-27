class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < 2 * n; i++) {
            adj.add(new ArrayList<>());
        }
        int[][] threnquivar = edges;
        for (int i = 0; i < n; i++) {
            adj.get(i).add(new int[]{i + n, 0});
        }
        for (int[] edge : threnquivar) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(u + n).add(new int[]{v, w});
            adj.get(v + n).add(new int[]{u, 2 * w});
        }

        long[] dist = new long[2 * n];
        Arrays.fill(dist, Long.MAX_VALUE);
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));

        dist[0] = 0;
        pq.offer(new long[]{0, 0}); 

        while (!pq.isEmpty()) {
            long[] current = pq.poll();
            long cost = current[0];
            int uNode = (int) current[1];
            if (cost > dist[uNode]) {
                continue;
            }
            for (int[] neighbor : adj.get(uNode)) {
                int vNode = neighbor[0];
                int weight = neighbor[1];
                if (dist[uNode] + weight < dist[vNode]) {
                    dist[vNode] = dist[uNode] + weight;
                    pq.offer(new long[]{dist[vNode], vNode});
                }
            }
        }
        long result = Math.min(dist[n - 1], dist[2 * n - 1]);
        return result == Long.MAX_VALUE ? -1 : (int) result;
    }
}