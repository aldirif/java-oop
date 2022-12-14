package logic;

public class Logic01Soal02 extends BasicLogic {
    public Logic01Soal02(int n) {
        super(n);
    }

    public void isiArray(){
        int hasil = 0;
        int akhir = 0;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i] = String.valueOf(hasil);
            if (i % 2 == 0) {
                if (i == 0) {
                    hasil = 1;
                    this.array[0][i] = String.valueOf(hasil);
                } else {
                    this.array[0][i] = String.valueOf(hasil);
                }
            } else {
                akhir = hasil * 3;
                hasil = akhir - i;
                this.array[0][i] = String.valueOf(akhir);
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
