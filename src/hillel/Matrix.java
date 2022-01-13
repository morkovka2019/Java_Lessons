package hillel;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        printMatrix(matrix);
        System.out.println();
        if(isMatrixSquare(matrix)){
            int[][] newMatrix = changeElements(matrix);
            System.out.println("Matrix with changed elements: ");
            printMatrix(newMatrix);
        } else{
            System.out.println("Your matrix is not square and can't be changed.");
        }

    }
    public static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line quantity for your matrix: ");
        int line = scanner.nextInt();
        System.out.println("Input column quantity for your matrix: ");
        int column = scanner.nextInt();
        int[][] myMatrix = new int[line][column];
        Random random = new Random();
        for (int k = 0; k < myMatrix.length; k++) {
            for (int l = 0; l < myMatrix[k].length; l++) {
                myMatrix[k][l] = random.nextInt(100);
            }
        }
            return myMatrix;
        }
        ;
        public static void printMatrix ( int[][] m){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.printf("%3d", m[i][j]);
                }
                System.out.println();
            }
        }
        public static int[][] changeElements(int[][] matr){
            int p = matr.length - 1;
            int[][] changedMatr = matr;
            for (int q = 0; q < matr.length; q++) {
                for (int w = 0; w < matr[q].length; w++) {
                    if(q == w){
                        int a = matr[q][w];
                        changedMatr[q][w] = changedMatr[q][p-w];
                        changedMatr[q][p-w] = a;
                    }
                }
            }
            return changedMatr;
        }
        public static boolean isMatrixSquare(int[][] matr){
            int a = matr.length;
            int b = matr[0].length;
            return a == b;
        }
    }
