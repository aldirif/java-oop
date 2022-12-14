package logic;

public class Logic02Soal01 extends BasicLogic{
    public Logic02Soal01(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            int angka = 1;
            for (int j = 0; j < this.n; j++) {
                if(i==j || i+j == this.n-1){
                    this.array[i][j] = String.valueOf(angka);
                }
                angka+=3;
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}

