package com.nguyenvi.entity;


// Exercise 3 Question 6
/* Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
Tạo các method
a) GetValue()
b) getKey ()
 */
public class MyMap<K,V> {
    private K id;
    private V name;

    public MyMap(K id, V name) {
        this.id = id;
        this.name = name;
    }

    public K getKey() {
        return id;
    }

    public void setKey(K id) {
        this.id = id;
    }

    public V getValue() {
        return name;
    }

    public void setValue(V name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
