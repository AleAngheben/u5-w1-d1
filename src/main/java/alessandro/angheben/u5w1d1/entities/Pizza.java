package alessandro.angheben.u5w1d1.entities;

import alessandro.angheben.u5w1d1.abstracts.Elements;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor

public class Pizza extends Elements {

    private List<Toppings> ingredients;

    public Pizza(String name, int calories, double price, List<Toppings> ingredients) {
        super(name, calories, price);
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", calories=" + calories +
                ", price=" + price +
                "} " + super.toString();
    }
}
