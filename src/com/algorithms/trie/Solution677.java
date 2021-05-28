package com.algorithms.trie;

import java.util.TreeMap;

/**
 * @author itjunjun  2021/5/27 16:22
 */
public class Solution677 {

    private class Node {
        public int value;

        public TreeMap<Character, Node> next;

        public Node(int value) {
            this.value = value;
            next = new TreeMap<>();
        }

        public Node() {
            this(0);
        }
    }

    private Node node;

    public Solution677() {
        node = new Node();
    }

    public void insert(String key, int val) {
        Node cur = node;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (cur.next.get(c) == null) {
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }
        cur.value = val;
    }

    public int sum(String prefix) {
        Node cur = node;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (cur.next.get(c) == null) {
                return 0;
            }
            cur = cur.next.get(c);
        }
        return sum(cur);
    }

    private int sum(Node cur) {
        int res = cur.value;
        for(char nextChar : node.next.keySet()){
            res += sum(node.next.get(nextChar));
        }
        return res;
    }
}
