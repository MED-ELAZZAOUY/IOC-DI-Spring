package net.elazzaouy.presentation;

import net.elazzaouy.dao.DaoImpl;
import net.elazzaouy.extension.DaoImpl2;
import net.elazzaouy.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        System.out.println("----------- Instanciation Statique --------------- ");
        /*
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); //  Injection des dependances
        System.out.println("Res = "+metier.calcul());// NullPointerException
         */

        DaoImpl2 dao = new DaoImpl2(); // Instanciation statique
        MetierImpl metier = new MetierImpl(dao); // injection via le Constructeur
        //metier.setDao(dao); //  Injection des dependances
        System.out.println("Res = "+metier.calcul());

    }

}
