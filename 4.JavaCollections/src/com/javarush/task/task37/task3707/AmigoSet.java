package com.javarush.task.task37.task3707;

import com.sun.org.apache.xalan.internal.xsltc.dom.KeyIndex;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable {

    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        this.map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public Object clone() {
        AmigoSet<E> result = null;
        try {
            result = (AmigoSet<E>) super.clone();
            result.map = (HashMap<E, Object>) map.clone();
        } catch (Exception e) {
            throw new InternalError();
        }
        return result;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
        stream.writeFloat(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));
        stream.writeInt(map.size());
        for (E element : map.keySet()) {
            stream.writeObject(element);
        }
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int capacity = stream.readInt();
        float loadFactor = stream.readFloat();
        map = new HashMap<>(capacity, loadFactor);
        int size = stream.readInt();
        for (int i = 0; i < size; i++) {
            E e = (E) stream.readObject();
            map.put(e, PRESENT);
        }
    }
}
