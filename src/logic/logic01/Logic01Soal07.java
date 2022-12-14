package logic.logic01;

import logic.BasicLogic;

public class Logic01Soal07 extends BasicLogic {
    public Logic01Soal07(int n) {
        super(n);
    }

    public void isiArray(){
        char huruf = 'A';
        for (char i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(huruf);
            huruf = (char) (huruf+1);
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
