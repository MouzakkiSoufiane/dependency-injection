package pres;

import dao.DaoImplV1;
import dao.DaoImplV2;
import dao.IDao;
import metier.Imetier;
import metier.metier;

public class pres1 {
    public static void main(String[] args) {
        IDao dao = new DaoImplV1();
        Imetier metier = new metier(dao);
        System.out.println(metier.calcul());
    }
}
