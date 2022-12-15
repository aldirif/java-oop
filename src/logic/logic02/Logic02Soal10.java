package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal10 extends BasicLogic {
    public Logic02Soal10(int n) {
        super(n);
    }

    public void isiArray(){
        int[][] deret = new int[n][n];
        int kolom = n / 2;
        int baris = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) deret[i][j] = n;
                else if (j == 0 && i <= n / 2) deret[i][j] = deret[i - 1][j] - 2;
                else if (j == 0 && i > n / 2) deret[i][j] = deret[i - 1][j] + 2;
            }

            if (i <= n / 2) {
                for (int k = 1; k < kolom + 1; k++) {
                    deret[i][k] = deret[i][k - 1] - 2;
                    deret[i][n - k] = deret[i][k - 1];
                }
                kolom--;
            } else {
                for (int k = 1; k < kolom + 3; k++) {
                    deret[i][k] = deret[i][k - 1] - 2;
                    deret[i][n - k] = deret[i][k - 1];
                }
                kolom++;
            }

            if (i > 0 && i <= n / 2) {
                deret[i][n / 2 - i] = 1;
                deret[i][n / 2 + i] = 1;
                baris++;
            } else if (i > 0 && i > n / 2) {
                baris--;
                deret[i][n / 2 - baris] = 1;
                deret[i][n / 2 + baris] = 1;
            }
        }

        int nilaiTengah = this.n/2;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (j - i < nilaiTengah && i - j < nilaiTengah
                        && i + j > nilaiTengah && i + j < nilaiTengah+n-1){
                }
                else {
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

