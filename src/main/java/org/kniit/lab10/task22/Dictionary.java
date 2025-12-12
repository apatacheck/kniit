package org.kniit.lab10.task22;

import java.util.ArrayList;
import java.util.List;

public class Dictionary<K, V> {
    private List<Pair<K, V>> pairs;

    private static class Pair<K, V> {
        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public Dictionary() {
        pairs = new ArrayList<>();
    }

    public void put(K key, V value) {
        for (Pair<K, V> pair : pairs) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }
        pairs.add(new Pair<>(key, value));
    }

    public V get(K key) {
        for (Pair<K, V> pair : pairs) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        for (int i = 0; i < pairs.size(); i++) {
            if (pairs.get(i).key.equals(key)) {
                pairs.remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < pairs.size(); i++) {
            Pair<K, V> pair = pairs.get(i);
            sb.append(pair.key).append("=").append(pair.value);
            if (i < pairs.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}