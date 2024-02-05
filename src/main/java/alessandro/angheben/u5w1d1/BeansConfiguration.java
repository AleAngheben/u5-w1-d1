package alessandro.angheben.u5w1d1;

import alessandro.angheben.u5w1d1.entities.Drinks;
import alessandro.angheben.u5w1d1.entities.Menu;
import alessandro.angheben.u5w1d1.entities.Pizza;
import alessandro.angheben.u5w1d1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {


    //drinks
    @Bean
    Drinks getWine() {
        return new Drinks("Wine", 607, 7.49, 0.75);
    }

    @Bean
    Drinks getWater() {
        return new Drinks("Water", 0, 1.29, 0.5);
    }

    @Bean
    Drinks getLemonade() {
        return new Drinks("Lemonade", 128, 1.29, 0.33);
    }

    //topping

    @Bean
    Toppings getSalami() {
        return new Toppings("Salami", 92, 0.69);
    }

    @Bean
    Toppings getPineapple() {
        return new Toppings("Pineapple", 24, 0.99);
    }

    @Bean
    Toppings getOnions() {
        return new Toppings("Onions", 22, 0.69);
    }

    @Bean
    Toppings getHam() {
        return new Toppings("Ham", 35, 0.99);
    }

    @Bean
    Toppings getCheese() {
        return new Toppings("Cheese", 92, 0.69);
    }

    @Bean
    Toppings getTomato() {
        return new Toppings("Tomato", 10, 1);
    }

    //pizze

    Pizza getMargherita() {
        return new Pizza("Margherita", 1104, 4.99, new ArrayList<>(Arrays.asList(getTomato(), getCheese())));
    }

    Pizza getHawaiianPizza() {
        return new Pizza("Hawaiian Pizza", 1024, 6.49, new ArrayList<>(Arrays.asList(getTomato(), getCheese(), getHam(), getPineapple())));
    }

    Pizza getSalamiPizza() {
        return new Pizza("Salami Pizza", 1160, 5.99, new ArrayList<>(Arrays.asList(getTomato(), getCheese(), getSalami())));
    }

    @Bean
    Menu getMenu() {
        List<Pizza> pizzaList = new ArrayList<>(Arrays.asList(getMargherita(), getHawaiianPizza(), getSalamiPizza()));
        List<Toppings> toppingsList = new ArrayList<>(Arrays.asList(getSalami(), getPineapple(), getOnions(), getHam(), getCheese()));
        List<Drinks> drinksList = new ArrayList<>(Arrays.asList(getWine(), getWater(), getLemonade()));

        return new Menu(pizzaList, drinksList, toppingsList);
    }
}
