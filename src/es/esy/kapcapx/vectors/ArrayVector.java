package es.esy.kapcapx.vectors;

public class ArrayVector implements Vector {
    private float[] vector;
    private int arraySize;

    public ArrayVector (float[] vector, int arraySize) {
        this.vector = vector;
        this.arraySize = arraySize;
    }

    @Override
    public void setElement (int i, float values) {
        goingBeyond(arraySize, i);
        vector[i] = values;
    }

    @Override
    public float getElement (int i) {
        goingBeyond(arraySize, i);
        return vector[i];
    }

    @Override
    public int getSize () {
        return arraySize;
    }

    @Override
    public float getNorm () {
        float norm = 0.0f;
        for (int i = 0; i < arraySize; i++) {
            norm += vector[i] * vector[i];
        }
        return (float) Math.sqrt(norm);
    }

    private void goingBeyond (int currentSize, int transmittedIndex) {
        if ( transmittedIndex >= currentSize || transmittedIndex < 0) {
            throw new VectorIndexOutOfBoundsException("Ошибка, выход за границы вектора");
        }
    }
}
