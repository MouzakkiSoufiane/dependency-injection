package dao;

import org.springframework.stereotype.Component;

@Component("Version 1")
public class DaoImplV1 implements IDao{
    @Override
    public double getData() {
        System.out.println("La première version ");
        double data = 10;
        return data;
    }
}
