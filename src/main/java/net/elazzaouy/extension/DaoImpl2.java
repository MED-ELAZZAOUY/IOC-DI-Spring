package net.elazzaouy.extension;

import net.elazzaouy.dao.IDao;
import org.springframework.stereotype.Component;

@Component("vws")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double data = 55;
        return data;
    }
}
