package net.elazzaouy.metier;

import net.elazzaouy.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/** @Component :
 *  Spring détectera automatiquement la classe "MetierImpl" lors du balayage du chemin de classe
 *  (classpath scanning) et l'enregistrera comme un bean dans le contexte de l'application.
 */
//@Component
@Service // Utilisé uniquement pour la couche metier (Service)
public class MetierImpl implements IMetier {

    //@Autowired // effectuer l'injection de dépendances automatique
    //@Qualifier(value = "vws") // specify which bean should be injected "vws"
    private IDao dao;  // Couplage Faible
    /**
     * Le couplage faible entre une interface et une classe est une bonne pratique de conception logicielle
     * qui favorise la flexibilité, la maintenance et la réutilisabilité du code.
     */

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

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
