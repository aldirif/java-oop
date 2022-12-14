package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic02Impl.Logic02Soal01Impl;
import logic.logicInterface.logic02Impl.Logic02Soal02Impl;
import logic.logicInterface.logic02Impl.Logic02Soal03Impl;

public class MainLogic02Interface {
    public static void main(String[] args) {
        System.out.println("Logic 02 Soal 01");
        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogic(9));
        logic02Soal01.cetakArray();

        System.out.println("\n\nLogic 02 Soal 02");
        LogicInterface logic02Soal02 = new Logic02Soal02Impl(new BasicLogic(9));
        logic02Soal02.cetakArray();

        System.out.println("\n\nLogic 02 Soal 03");
        LogicInterface logic02Soal03 = new Logic02Soal03Impl(new BasicLogic(9));
        logic02Soal03.cetakArray();
    }

}
