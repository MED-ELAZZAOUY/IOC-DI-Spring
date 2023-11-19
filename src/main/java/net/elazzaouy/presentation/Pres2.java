package net.elazzaouy.presentation;

import net.elazzaouy.dao.IDao;
import net.elazzaouy.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("----------- Instanciation Dynamique --------------- ");

        //DaoImpl dao = new DaoImpl();
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        System.out.println(daoClassName);
        Class cDao = Class.forName(daoClassName); // Charge la classe DaoImpl dans la memoire
        IDao dao =(IDao) cDao.getConstructor().newInstance(); // ==> new DaoImpl(); (Instanciation Dynamique)

        //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        //metier.setDao(dao); Injection des dependances statique
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // Injection des dependances dynamique

        System.out.println("Res ="+ metier.calcul());
        
    }

}
