package net.elazzaouy.presentation;

import net.elazzaouy.dao.DaoImpl;
import net.elazzaouy.extension.DaoImpl2;
import net.elazzaouy.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        /*
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); //  Injection des dependances
        System.out.println("Res = "+metier.calcul());// NullPointerException
         */
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); //  Injection des dependances
        System.out.println("Res = "+metier.calcul());// NullPointerException

    }

}
