package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Dodgems extends Attraction  {

    public Dodgems(String name, int rating) {
        super(name, rating);

    }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        double ticket = defaultPrice();
        if (visitor.getAge() < 12){
            return ticket / 2;
        }
        return ticket;
    }

}
