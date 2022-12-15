package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal08Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal08Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int[] deret = new int[logic.n];
        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (j <= 1) deret[j] = 1;
                else deret[j] = deret[j - 1] + deret[j - 2];

                if (j >= logic.n/2 && j <= logic.n - i - 1
                        || j <= logic.n/2 && j >= logic.n - i - 1) {
                    if (logic.n/2 < i) this.logic.array[i][j] = String.valueOf(deret[logic.n-1-i]);
                    else this.logic.array[i][j] = String.valueOf(deret[i]);
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
