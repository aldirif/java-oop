package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal09 extends BasicLogic {
    public Logic02Soal09(int n) {
        super(n);
    }

    public void isiArray(){
        int[][] deret = new int[n][n];
        int kolom = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == n / 2 || j == 0 && i == n / 2) deret[i][j] = 1;
                else if (j == n / 2 && i <= n / 2) deret[i][j] = deret[i - 1][j] + 2;
                else if (j == n / 2 && i > n / 2) deret[i][j] = deret[i - 1][j] - 2;
            }
            if (i <= n / 2 && i > 0) {
                for (int k = 1; k <= i; k++) {
                    deret[i][n / 2 - k] = deret[i][n / 2] - 2 * k;
                    deret[i][n / 2 + k] = deret[i][n / 2] - 2 * k;
                }
                kolom++;
            } else {
                for (int k = 1; k <= kolom; k++) {
                    deret[i][n / 2 - k] = deret[i][n / 2] - 2 * k;
                    deret[i][n / 2 + k] = deret[i][n / 2] - 2 * k;
                }
                kolom--;
            }
        }

        int nilaiTengah = this.n / 2;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (j - i <= nilaiTengah
                        && i - j <= nilaiTengah
                        && i + j >= nilaiTengah
                        && i + j <= nilaiTengah+n-1)
                    this.array[i][j] = String.valueOf(deret[i][j]);
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}

