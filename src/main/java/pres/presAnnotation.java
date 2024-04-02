package pres;

import dao.IDao;
import metier.Imetier;
import metier.metier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        Imetier metier = context.getBean(Imetier.class);
        System.out.println("Result : "+metier.calcul());
    }
}
