package net.elazzaouy.presentation;

import net.elazzaouy.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.elazzaouy.dao", "net.elazzaouy.metier");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println(" Res = "+ metier.calcul());
    }
}
