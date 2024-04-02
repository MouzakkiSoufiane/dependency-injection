package dao;

import org.springframework.stereotype.Component;

@Component("Version 2")
public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("La deuxième version ");
        double Data = 100;
        return Data;
    }
}
