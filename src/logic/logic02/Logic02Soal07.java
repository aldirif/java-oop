package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal07 extends BasicLogic {
    public Logic02Soal07(int n) {
        super(n);
    }

    public void isiArray(){
        int[][] deret = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= 1 || i <= 1 || i >= n - 2 || j >= n - 2) deret[i][j] = 1;
                else if (j >= i && j < n - i) deret[i][j] = deret[i - 1][n / 2] + deret[i - 2][n / 2];
                else if (j >= n - i - 1 && j <= i) deret[i][j] = deret[n - i - 2][n / 2] + deret[n - i - 3][n / 2];
                else if (j <= n / 2) deret[i][j] = deret[i][j - 1] + deret[i][j - 2];
                else if (j >= n / 2) deret[i][j] = deret[n / 2][n - j - 2] + deret[n / 2][n - j - 3];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i && j >= n - i - 1 && n / 2 <= i
                        || j <= i && j <= n - i - 1 && n / 2 >= i
                        || j >= n / 2 && j <= n - i - 1
                        || j <= n / 2 && j >= n - i - 1) {
                    this.array[i][j] = String.valueOf(deret[i][j]);
                }
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}

