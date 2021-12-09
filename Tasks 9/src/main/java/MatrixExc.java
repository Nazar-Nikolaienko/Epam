public class MatrixExc extends Exception {
    Matrix f;
    Matrix s;

    public Matrix getFirstMatrix() {
        return f;
    }

    public Matrix getSecondMatrix() {
        return s;
    }

    public MatrixExc(String message, Matrix f, Matrix s) {
        super(message);
        this.f = f;
        this.s = s;
    }
}