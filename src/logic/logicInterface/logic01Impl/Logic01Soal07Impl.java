package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal07Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal07Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        char huruf = 'A';
        for (char i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(huruf);
            huruf = (char) (huruf+1);
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
