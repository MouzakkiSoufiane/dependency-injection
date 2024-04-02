package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class metier implements Imetier{
    private IDao dao ;
    public metier( @Qualifier("Version 2") IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double Data ;
        Data = this.dao.getData() *5;
        return Data ;
    }
}
