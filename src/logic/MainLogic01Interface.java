package logic;


import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.*;

public class MainLogic01Interface {
    public static void main(String[] args) {
        System.out.println("Logic 01 Soal 01");
        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(9));
        logic01Soal01.cetakArray();

        System.out.println("\n\nLogic 01 Soal 02");
        LogicInterface logic01Soal02 = new Logic01Soal02Impl(new BasicLogic(9));
        logic01Soal02.cetakArray();

        System.out.println("\n\nLogic 01 Soal 03");
        LogicInterface logic01Soal03 = new Logic01Soal03Impl(new BasicLogic(9));
        logic01Soal03.cetakArray();

        System.out.println("\n\nLogic 01 Soal 04");
        LogicInterface logic01Soal04 = new Logic01Soal04Impl(new BasicLogic(9));
        logic01Soal04.cetakArray();

        System.out.println("\n\nLogic 01 Soal 05");
        LogicInterface logic01Soal05 = new Logic01Soal05Impl(new BasicLogic(9));
        logic01Soal05.cetakArray();

        System.out.println("\n\nLogic 01 Soal 06");
        LogicInterface logic01Soal06 = new Logic01Soal06Impl(new BasicLogic(9));
        logic01Soal06.cetakArray();


        System.out.println("\n\nLogic 01 Soal 07");
        LogicInterface logic01Soal07 = new Logic01Soal07Impl(new BasicLogic(9));
        logic01Soal07.cetakArray();

        System.out.println("\n\nLogic 01 Soal 08");
        LogicInterface logic01Soal08 = new Logic01Soal08Impl(new BasicLogic(9));
        logic01Soal08.cetakArray();

        System.out.println("\n\nLogic 01 Soal 09");
        LogicInterface logic01Soal09 = new Logic01Soal09Impl(new BasicLogic(9));
        logic01Soal09.cetakArray();

        System.out.println("\n\nLogic 01 Soal 10");
        LogicInterface logic01Soal10 = new Logic01Soal10Impl(new BasicLogic(9));
        logic01Soal10.cetakArray();
    }
}
