package es.esy.kapcapx.vectors;

import java.util.LinkedList;

public class LinkedListVector implements Vector {

    private LinkedList<Float> linkedListVector = new LinkedList<>();

    public LinkedListVector (float[] vector) {
        for (int i = 0; i < vector.length; i++) {
            linkedListVector.add(i, vector[i]);
        }
    }

    @Override
    public void setElement (int i, float values) throws VectorIndexOutOfBoundsException {
        goingBeyond(linkedListVector.size(), i);
        linkedListVector.set(i, values);
    }

    @Override
    public float getElement (int i) {
        goingBeyond(linkedListVector.size(), i);
        return linkedListVector.get(i);
    }

    @Override
    public int getSize () {
        return linkedListVector.size();
    }

    @Override
    public float getNorm () {
        float norm = 0.0f;
        for (int i = 0; i < linkedListVector.size(); i++) {
            norm += linkedListVector.get(i) * linkedListVector.get(i);
        }
        return (float) Math.sqrt(norm);
    }

    public void addElement (float element) {
        linkedListVector.add(element);
    }

    public void addElement (int i, float element) throws VectorIndexOutOfBoundsException {
        goingBeyond(linkedListVector.size(), i);
        linkedListVector.add(i, element);
    }

    public void removeElement (float element) {
        linkedListVector.remove(element);
    }

    public void removeElement (int i) throws VectorIndexOutOfBoundsException {
        goingBeyond(linkedListVector.size(), i);
        linkedListVector.remove(i);
    }

    private void goingBeyond (int currentSize, int transmittedIndex) throws VectorIndexOutOfBoundsException {
        if ( transmittedIndex >= currentSize || transmittedIndex < 0) {
            throw new VectorIndexOutOfBoundsException("Ошибка, выход за границы вектора");
        }
    }
}
