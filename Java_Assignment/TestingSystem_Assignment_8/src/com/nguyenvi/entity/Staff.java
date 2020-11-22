package com.nguyenvi.entity;

// Question 8
public class Staff<K, V> extends MyMap<K,V> {
    public Staff(K id, V name) {
        super(id, name);
    }

    public K getID()
    {
        return super.getKey();
    }
    public V getName()
    {
        return super.getValue();
    }
}
