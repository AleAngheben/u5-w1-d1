package alessandro.angheben.u5w1d1.entities;

import alessandro.angheben.u5w1d1.abstracts.Elements;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor


public class Drinks extends Elements {

    private double quantity;

    public Drinks(String name, int calories, double price, double quantity) {
        super(name, calories, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drinks{" +

                " name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", quantity=" + quantity +
                "} ";
    }
}
