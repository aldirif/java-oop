package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal07Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal07Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int[][] deret = new int[logic.n][logic.n];
        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (j <= 1 || i <= 1 || i >= logic.n - 2 || j >= logic.n - 2) deret[i][j] = 1;
                else if (j >= i && j < logic.n - i) deret[i][j] = deret[i - 1][logic.n / 2] + deret[i - 2][logic.n / 2];
                else if (j >= logic.n - i - 1 && j <= i) deret[i][j] = deret[logic.n - i - 2][logic.n / 2] + deret[logic.n - i - 3][logic.n / 2];
                else if (j <= logic.n / 2) deret[i][j] = deret[i][j - 1] + deret[i][j - 2];
                else if (j >= logic.n / 2) deret[i][j] = deret[logic.n / 2][logic.n - j - 2] + deret[logic.n / 2][logic.n - j - 3];
            }
        }

        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (j >= i && j >= logic.n - i - 1 && logic.n / 2 <= i
                        || j <= i && j <= logic.n - i - 1 && logic.n / 2 >= i
                        || j >= logic.n / 2 && j <= logic.n - i - 1
                        || j <= logic.n / 2 && j >= logic.n - i - 1) {
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
