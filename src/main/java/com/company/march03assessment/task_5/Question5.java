package com.company.march03assessment.task_5;

public class Question5 {
    public static void main(String[] args) throws InterruptedException {
        int[][] a = new int[][]{{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3,}};
        int[][] b = new int[][]{{1, 2, 3}, {1, 2, 3,}, {1, 2, 3,}};

        Add add = new Add(a, b);
        Thread t1 = new Thread(add);
        Thread t2 = new Thread(add);
        Thread t3 = new Thread(add);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        int[][] result = Add.print();

        for (int[] row1 : result) {
            for (int column1 : row1) {
                System.out.print(column1 + "   ");
            }
            System.out.println();
        }
    }

}

class Add implements Runnable {
    private static final int row = 3;
    private static final int column = 3;
    public static int[][] c = new int[row][column];
    private static volatile int i;
    private static volatile int j;
    private final int[][] a;
    private final int[][] b;

    public Add(int[][] _a, int[][] _b) {
        a = _a;
        b = _b;
    }

    public static int[][] print() {
        return c;
    }

    @Override
    public void run() {
        for (i = 0; i < row; ++i) {
            for (j = 0; j < column; ++j) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }
}