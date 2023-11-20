package net.elazzaouy.extension;

import net.elazzaouy.dao.IDao;

public class DaoImplVCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs ");
        double data = 77;
        return data;
    }
}
