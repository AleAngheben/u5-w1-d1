package alessandro.angheben.u5w1d1;

import alessandro.angheben.u5w1d1.entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {

    @Autowired
    private AnnotationConfigApplicationContext ctx ;


    @Override
    public void run(String... args) throws Exception {
        Menu menu  = (Menu) ctx.getBean("getMenu");
        System.out.println(menu);
        ctx.close();
    }
}
