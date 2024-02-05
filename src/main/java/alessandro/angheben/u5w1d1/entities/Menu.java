package alessandro.angheben.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    private List<Pizza> pizzas;

    private List<Drinks> drinks;

    private List<Toppings> toppings;

    @Override
    public String toString() {
        return "MENU DELLA PIZZERIA \n {" +
                "\n PIZZE = \n" +
                " " + pizzas +
                "\n BEVANDE= \n" + drinks +
                "\n TOPPINGS= \n" + toppings +
                '}';
    }
}
