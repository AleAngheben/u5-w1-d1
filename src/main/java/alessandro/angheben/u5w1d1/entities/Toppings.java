package alessandro.angheben.u5w1d1.entities;

import alessandro.angheben.u5w1d1.abstracts.Elements;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter

@NoArgsConstructor
public class Toppings extends Elements {

    public Toppings(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} \n" ;
    }
}
