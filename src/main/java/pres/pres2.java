package pres;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class Cdao = Class.forName(daoClassName);
        IDao  dao = (IDao) Cdao.getConstructor().newInstance();
        String metierClassName = scanner.nextLine();
        Class Cmetier = Class.forName(metierClassName);
        Imetier metier = (Imetier) Cmetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("Result :"+metier.calcul());
    }
}
