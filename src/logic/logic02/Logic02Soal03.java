package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal03 extends BasicLogic {
    public Logic02Soal03(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            int angka = 0;
            for (int j = 0; j < this.n; j++) {
                if(j==0 || i==0  || i == this.n-1 || j== this.n-1 ||
                        i==j || i+j == this.n-1){
                    this.array[i][j] = String.valueOf(angka);
                }
                angka+=2;
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
