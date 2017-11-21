package es.esy.kapcapx.vectors;

import es.esy.kapcapx.vectors.VectorIndexOutOfBoundsException;

public interface Vector {
    void setElement (int i, float values);
    float getElement (int i);
    int getSize ();
    float getNorm ();
}
