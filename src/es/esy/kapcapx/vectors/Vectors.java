package es.esy.kapcapx.vectors;

public class Vectors {

    public static float[] mult (Vector vector, float mulNumber) {
        float[] resultVector = new float[vector.getSize()];
        for (int i = 0; i < vector.getSize(); i++) {
            resultVector[i] = vector.getElement(i) * mulNumber;
        }
        return resultVector;
    }

    public static float[] sum (Vector firstVector, Vector secondVector) {
        try {
            lengthVector(firstVector.getSize(), secondVector.getSize());
        } catch (IncompatibleVectorSizesException e) {
            e.printStackTrace();
            System.exit(1);
        }
        float[] resultVector = new float[firstVector.getSize()];
        for (int i = 0; i < firstVector.getSize(); i++) {
            resultVector[i] = firstVector.getElement(i) + secondVector.getElement(i);
        }
        return resultVector;
    }

    public static float scalarMult (Vector firstVector, Vector secondVector) {
        float result = 0.0f;
        try {
            lengthVector(firstVector.getSize(), secondVector.getSize());
        } catch (IncompatibleVectorSizesException e) {
            e.printStackTrace();
            System.exit(1);
        }
        for (int i = 0; i < firstVector.getSize(); i++) {
            result += firstVector.getElement(i) * secondVector.getElement(i);
        }
        return result;
    }

    private static void lengthVector (int firstVectorSize, int secondVectorSize) throws IncompatibleVectorSizesException {
        if (firstVectorSize != secondVectorSize) {
            throw new IncompatibleVectorSizesException("Ошибка, длина векторов не соответствует");
        }
    }
}
