package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal03Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal03Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka = 0;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(angka);
            angka = angka+2;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
