package logic;

import logic.logic02.*;

public class MainLogic02 {
    public static void main(String[] args) {
        System.out.println("Logic 02 Soal 01");
        Logic02Soal01 logic02Soal01 = new Logic02Soal01(9);
        logic02Soal01.cetakArray();

        System.out.println("\n\nLogic 02 Soal 02");
        Logic02Soal02 logic02Soal02 = new Logic02Soal02(9);
        logic02Soal02.cetakArray();

        System.out.println("\n\nLogic 02 Soal 03");
        Logic02Soal03 logic02Soal03 = new Logic02Soal03(9);
        logic02Soal03.cetakArray();
    }
}
