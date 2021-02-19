package edu.zxie0018.Matrix;

public class ComplexMatrix extends GenericMatrix<Object> {
    @Override
    protected Object add(Object o1, Object o2) {
        return o1 + o2;
    }

    @Override
    protected Object multiply(Object o1, Object o2) {
        return o1 * o2;
    }

    @Override
    protected Object zero() {
        return 0;
    }
}
