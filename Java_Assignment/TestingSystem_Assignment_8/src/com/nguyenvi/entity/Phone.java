package com.nguyenvi.entity;

public class Phone<K,V> extends MyMap<K,V> {

    public Phone(K id, V name) {
        super(id, name);
    }

    public V getPhoneNumber()
    {
        return super.getValue();
    }
    public K getKey()
    {
        return super.getKey();
    }
}
