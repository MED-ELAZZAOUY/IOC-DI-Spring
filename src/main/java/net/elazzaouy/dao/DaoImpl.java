package net.elazzaouy.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/** @Component :
 *  utilisée pour indiquer à Spring que la classe annotée est un composant.
 *  Les composants sont des objets gérés par le conteneur Spring et sont souvent utilisés dans le cadre de
 *  l'inversion de contrôle (IoC) et de l'injection de dépendances.
 */
//@Component
@Repository // Utilisé uniquement pour la couche d'accès aux données (DAO)
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double data = 34;
        return data;
    }
}
