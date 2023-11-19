package net.elazzaouy.extension;

import net.elazzaouy.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double data = 55;
        return data;
    }
}
