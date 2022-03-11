package com.isitneeded.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CycleDetection {

    public static class Graph {
        int nodes;
        List<List<Integer>> adjList;

        public Graph(int nodes) {
            this.nodes = nodes;
            adjList = new ArrayList<>();

            for (int i = 0; i < nodes; i++) {
                adjList.add(new LinkedList<>());
            }
        }

        void addEdge (int node1, int node2) {
            adjList.get(node1).add(node2);
        }

        void printGraph() {

            for (int i = 0; i < adjList.size(); i++) {
                System.out.println(i + " => "+adjList.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(8);

        graph.addEdge(0,3);
        graph.addEdge(0,1);
        graph.addEdge(3,1);
        graph.addEdge(3,2);
        graph.addEdge(2,1);
        graph.addEdge(4,1);
        graph.addEdge(2,4);
        graph.addEdge(7,1);
        graph.addEdge(7,5);

        graph.printGraph();

        /*Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);*/


        if (cycleDetection(graph, graph.nodes) == true ) {
            System.out.println("Cycle Detected");
            return;
        }

        List<Integer> topoList = new ArrayList<>();

        boolean[] visited = new boolean[8];

        for (int i = 0; i < graph.nodes; i++) {
            if (visited[i] == false)
                topological_sort(graph, topoList, visited, i);
        }

        Collections.reverse(topoList);

        for (int i : topoList)
            System.out.print(i + " ");

    }

    private static void topological_sort(Graph graph, List<Integer> topoList, boolean[] visited, int vertex) {

        visited[vertex] = true;

        for (int neighbourVertex : graph.adjList.get(vertex)) {
            if (visited[neighbourVertex] == false)
                topological_sort(graph, topoList, visited, neighbourVertex);
        }

        topoList.add(vertex);

    }

    private static boolean cycleDetection(Graph graph, int V) {

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            visited[i] = true;

            for (int neighbourVertex : graph.adjList.get(i)) {
                if (isCyclic(graph, neighbourVertex, visited) == true)
                    return true;
            }

            visited[i] = false;
        }
        return false;
    }

    private static boolean isCyclic(Graph graph, int vertex, boolean[] visited) {

        if (visited[vertex] == true)
            return true;

        for (int neighbourVertex : graph.adjList.get(vertex)) {
            if (isCyclic(graph, neighbourVertex, visited) == true)
                return true;
        }

        return false;
    }



}
