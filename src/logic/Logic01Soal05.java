package logic;

public class Logic01Soal05 extends BasicLogic{
    public Logic01Soal05(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 1;
        int angka1 = 1;
        int angka2 = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(angka);
            int sum = angka + angka1 + angka2;
            angka = angka1;
            angka1 = angka2;
            angka2 = sum;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
