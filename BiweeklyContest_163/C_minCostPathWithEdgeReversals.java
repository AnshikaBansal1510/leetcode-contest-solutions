package BiweeklyContest_163;

import java.util.*;

public class C_minCostPathWithEdgeReversals {

	public int minCost(int n, int[][] edges) {

        List<List<int[]>> adj = new ArrayList<>();

        for(int idx = 0 ; idx < n ; idx++){

            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){

            adj.get(edge[0]).add(new int[] {edge[1], edge[2]});
            adj.get(edge[1]).add(new int[] {edge[0], edge[2] * 2});
        }

        int[] minCost = new int[n];
        Arrays.fill(minCost, (int)1e9);

        Queue<int[]> pq = new LinkedList<>();
        pq.offer(new int[] {0, 0});
        minCost[0] = 0;

        while(!pq.isEmpty()){

            int[] N = pq.poll();
            int node = N[0], cost = N[1];

            for(int[] adjNode : adj.get(node)){

                int nextNode = adjNode[0];
                int edgeWeight = adjNode[1];

                if(cost + edgeWeight < minCost[nextNode]){

                    minCost[nextNode] = cost + edgeWeight;
                    pq.offer(new int[] {nextNode, cost + edgeWeight});
                }
            }
        }

        if(minCost[n - 1] == (int)1e9)       return -1;
        return minCost[n - 1];
    }
}
