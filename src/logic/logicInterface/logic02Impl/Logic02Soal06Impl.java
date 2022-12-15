package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal06Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal06Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int[] deret = new int[logic.n];
        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (j <= 1) deret[j] = 1;
                else deret[j] = deret[j - 1] + deret[j - 2];

                if (j >= i && j <= logic.n - i - 1
                        || j <= i && j >= logic.n - i - 1) {
                    this.logic.array[i][j] = String.valueOf(deret[i]);
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
