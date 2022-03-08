package com.isitneeded.tree;

import java.util.*;

public class FoxAndNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; ++i) {
            names[i] = sc.next();
        }

        boolean ok = true;

        // graph[i][j] = true IFF there is an edge i -> j
        boolean[][] graph = new boolean[26][26];

        for (int i = 0; i + 1 < n; ++i) {
            String prev = names[i];
            String next = names[i + 1];

            if (prev.startsWith(next) && !prev.equals(next)) {
                System.out.println("Impossible");
                return;
            }

            for (int j = 0; j < prev.length() && j < next.length(); ++j) {
                if (prev.charAt(j) != next.charAt(j)) {
                    graph[prev.charAt(j) - 'a'][next.charAt(j) - 'a'] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        // topo sort
        Queue<Integer> queue = new LinkedList<Integer>();
        String answer = "";
        int[] deg = new int[26];
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < 26; ++j) {
                if (graph[j][i]) ++deg[i];
            }
            if (deg[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int u = queue.remove();
            answer += (char) ('a' + u);
            for (int v = 0; v < 26; ++v) {
                if (graph[u][v]) {
                    --deg[v];
                    if (deg[v] == 0) {
                        queue.add(v);
                    }
                }
            }
        }

        if (answer.length() < 26) {
            System.out.println("Impossible");
        } else {
            System.out.println(answer);
        }
    }

    Map<Integer,Integer> map = new TreeMap<>();

    
}
