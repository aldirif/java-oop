package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal08 extends BasicLogic {
    public Logic02Soal08(int n) {
        super(n);
    }

    public void isiArray(){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= 1) deret[j] = 1;
                else deret[j] = deret[j - 1] + deret[j - 2];

                if (j >= n/2 && j <= n - i - 1
                        || j <= n/2 && j >= n - i - 1) {
                    if (n/2 < i) this.array[i][j] = String.valueOf(deret[n-1-i]);
                    else this.array[i][j] = String.valueOf(deret[i]);
                }
            }
        }
    }


    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}

