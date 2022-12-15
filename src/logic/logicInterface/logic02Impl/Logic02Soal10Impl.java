package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal10Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal10Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int[][] deret = new int[logic.n][logic.n];
        int kolom = logic.n / 2;
        int baris = 0;

        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (i == 0 && j == 0) deret[i][j] = logic.n;
                else if (j == 0 && i <= logic.n / 2) deret[i][j] = deret[i - 1][j] - 2;
                else if (j == 0 && i > logic.n / 2) deret[i][j] = deret[i - 1][j] + 2;
            }

            if (i <= logic.n / 2) {
                for (int k = 1; k < kolom + 1; k++) {
                    deret[i][k] = deret[i][k - 1] - 2;
                    deret[i][logic.n - k] = deret[i][k - 1];
                }
                kolom--;
            } else {
                for (int k = 1; k < kolom + 3; k++) {
                    deret[i][k] = deret[i][k - 1] - 2;
                    deret[i][logic.n - k] = deret[i][k - 1];
                }
                kolom++;
            }

            if (i > 0 && i <= logic.n / 2) {
                deret[i][logic.n / 2 - i] = 1;
                deret[i][logic.n / 2 + i] = 1;
                baris++;
            } else if (i > 0 && i > logic.n / 2) {
                baris--;
                deret[i][logic.n / 2 - baris] = 1;
                deret[i][logic.n / 2 + baris] = 1;
            }
        }

        int nilaiTengah = this.logic.n/2;
        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if (j - i < nilaiTengah && i - j < nilaiTengah
                        && i + j > nilaiTengah && i + j < nilaiTengah+logic.n-1){
                }
                else {
                    this.logic.array[i][j] = String.valueOf(deret[i][j]);
                }
            }
        }
    }


    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
