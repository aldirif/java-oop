package logic.logic01;

import logic.BasicLogic;

public class Logic01Soal04 extends BasicLogic {
    public Logic01Soal04(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 1;
        int angka1 = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(angka);
            int sum = angka + angka1;
            angka = angka1;
            angka1 = sum;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
