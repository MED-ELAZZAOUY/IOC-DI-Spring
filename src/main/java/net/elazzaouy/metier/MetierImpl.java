package net.elazzaouy.metier;

import net.elazzaouy.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;  // Couplage Faible
    /**
     * Le couplage faible entre une interface et une classe est une bonne pratique de conception logicielle
     * qui favorise la flexibilité, la maintenance et la réutilisabilité du code.
     */
    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data * 11.5;
        return res;
    }

    /**
     * pour permettre d'injecter dans la variable dao
     * un objet d'une classe qui implemente l'interface IDao
     * @param dao
     */
    public void setDao(IDao dao) {  // Setter pour faire l'injection de dependances
        this.dao = dao;
    }
}
