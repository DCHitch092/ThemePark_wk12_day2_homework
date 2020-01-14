import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import javax.management.relation.Role;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Dodgems dodgem;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgem = new Dodgems("The Magic Dodgems", 12);
        park = new Park("The Magic Park", 3);
        playground = new Playground("The Magic Playground", 10);
        rollerCoaster = new RollerCoaster("The Magic Rollercoaster", 20);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0,themePark.getAttractions().size());
        assertEquals(0,themePark.getStalls().size());

    }

}
