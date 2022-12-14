package logic;

public class Logic01Soal03 extends BasicLogic{
    public Logic01Soal03(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 0;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(angka);
            angka = angka+2;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
