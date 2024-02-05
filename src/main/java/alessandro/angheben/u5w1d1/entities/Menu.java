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
        return "Menu{" +
                "pizzas= " + pizzas +
                ", drinks= " + drinks +
                ", toppings= " + toppings +
                '}';
    }
}
