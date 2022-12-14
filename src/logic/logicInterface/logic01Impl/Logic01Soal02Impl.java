package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal02Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal02Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int hasil = 0;
        int akhir = 0;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i] = String.valueOf(hasil);
            if (i % 2 == 0) {
                if (i == 0) {
                    hasil = 1;
                    this.logic.array[0][i] = String.valueOf(hasil);
                } else {
                    this.logic.array[0][i] = String.valueOf(hasil);
                }
            } else {
                akhir = hasil * 3;
                hasil = akhir - i;
                this.logic.array[0][i] = String.valueOf(akhir);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
