package logic;

public class Logic01Soal01 extends BasicLogic{
    public Logic01Soal01(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(angka);
            angka = angka+1;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
