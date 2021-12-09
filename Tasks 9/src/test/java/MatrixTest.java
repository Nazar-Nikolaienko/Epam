import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void Element() {
        Matrix matrix = new Matrix(3, 5);

        matrix.setElement(0, 1, 3.5);

        assertEquals(7.5, matrix.getMatrix()[0][1]);
    }

    @Test
    void addition() throws MatrixExc {
        Matrix matrix = new Matrix(new double[][]{
                {2, 1, 5},
                {8, 4, 3},
                {9, 6, 7}
        });
        Matrix matrix2 = new Matrix(new double[][]{
                {3, 8, 6},
                {7, 1, 4},
                {9, 2, 3}
        });

        matrix = matrix.addition(matrix2);

        assertArrayEquals(new double[]{11, 11, 11}, matrix.getMatrix()[0]);
        assertArrayEquals(new double[]{11, 11, 11}, matrix.getMatrix()[1]);
        assertArrayEquals(new double[]{11, 11, 11}, matrix.getMatrix()[2]);
    }

    @Test
    void deduction() throws MatrixExc {
        Matrix matrix = new Matrix(new double[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        Matrix matrix2 = new Matrix(new double[][]{
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        });

        matrix = matrix.deduction(matrix2);

        assertArrayEquals(new double[]{12, 12, 12}, matrix.getMatrix()[0]);
        assertArrayEquals(new double[]{12, 12, 12}, matrix.getMatrix()[1]);
        assertArrayEquals(new double[]{12, 12, 12}, matrix.getMatrix()[2]);
    }

    @Test
    void multiplication() throws MatrixExc {
        Matrix matrix = new Matrix(new double[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {4, 5, 6}
        });
        Matrix matrix2 = new Matrix(new double[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {4, 3, 7, 6}
        });

        matrix = matrix.multiplication(matrix2);

        assertArrayEquals(new double[]{23, 33, 45, 21}, matrix.getMatrix()[0]);
        assertArrayEquals(new double[]{13, 46, 34, 85}, matrix.getMatrix()[1]);
        assertArrayEquals(new double[]{72, 27, 534, 14}, matrix.getMatrix()[2]);
        assertArrayEquals(new double[]{53, 34, 41, 32}, matrix.getMatrix()[3]);
    }
    @Test
    void testException() {
        Matrix matrix = new Matrix(new double[][]{
                {1, 2},
                {4, 5}
        });
        Matrix matrix2 = new Matrix(new double[][]{
                {1, 5, 6, 4},
                {3, 6, 3, 8},
                {4, 7, 1, 6}
        });

        MatrixExc exceptionAddition = assertThrows(MatrixExc.class, () -> {
            Matrix matrix3 = matrix.addition(matrix2);
        });
        MatrixExc exceptionDeduction = assertThrows(MatrixExc.class, () -> {
            Matrix matrix3 = matrix.deduction(matrix2);
        });
        MatrixExc exceptionMultiplication = assertThrows(MatrixExc.class, () -> {
            Matrix matrix3 = matrix.multiplication(matrix2);
        });

        assertEquals("Операції з матрицею несумісних розмірів", exceptionAddition.getMessage());
        assertEquals("Операції з матрицею несумісних розмірів", exceptionDeduction.getMessage());
        assertEquals("Операції з матрицею несумісних розмірів", exceptionMultiplication.getMessage());
        assertEquals(matrix, exceptionMultiplication.getFirstMatrix());
        assertEquals(matrix2, exceptionMultiplication.getSecondMatrix());
    }
    @Test
    void testException_in_constructor() {
        IllegalArgumentException exceptionRows = assertThrows(IllegalArgumentException.class, () -> {
            Matrix matrix = new Matrix(-4,8);
        });
        IllegalArgumentException exceptionColumn = assertThrows(IllegalArgumentException.class, () -> {
            Matrix matrix = new Matrix(3,0);
        });

        assertEquals("Недопустимий номер рядка або стовпця", exceptionRows.getMessage());
        assertEquals("Недопустимий номер рядка або стовпця", exceptionColumn.getMessage());
    }
    @Test
    void testException_in_setElement() {
        Matrix matrix = new Matrix(4,1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            matrix.setElement(2,5, 3.5);
        });

        assertEquals("Недопустимий номер рядка або стовпця", exception.getMessage());
    }
}