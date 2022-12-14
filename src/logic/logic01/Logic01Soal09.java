package logic.logic01;

import logic.BasicLogic;

public class Logic01Soal09 extends BasicLogic {
    public Logic01Soal09(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 3;
        for (int i = 0; i < this.n; i++) {
            int angka2 = (int)Math.pow(angka, i);
            this.array[0][i]= String.valueOf(angka2);
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
