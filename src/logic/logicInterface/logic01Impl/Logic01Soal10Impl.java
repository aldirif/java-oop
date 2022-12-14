package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal10Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal10Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka = 3;
        for (int i = 0; i < this.logic.n; i++) {
            int angka2 = (int)Math.pow(i, angka);
            this.logic.array[0][i]= String.valueOf(angka2);
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
