import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import javax.management.relation.Role;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Dodgems dodgem;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    ThemePark themePark2;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgem = new Dodgems("The Magic Dodgems", 12);
        park = new Park("The Magic Park", 3);
        playground = new Playground("The Magic Playground", 10);
        rollerCoaster = new RollerCoaster("The Magic Rollercoaster", 20);
        candyFlossStall = new CandyflossStall("The Magic Candy Floss Stall","Magic Mike", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("The Magic Tobacco Stall","Magic Tyke", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("The Magic Ice Cream Stall", "Magic Ryke", ParkingSpot.A3);
        themePark2 = new ThemePark();
        themePark2.addToAttractions(dodgem);
        themePark2.addToAttractions(park);
        themePark2.addToAttractions(playground);
        themePark2.addToAttractions(rollerCoaster);
        themePark2.addToStalls(candyFlossStall);
        themePark2.addToStalls(tobaccoStall);
        themePark2.addToStalls(iceCreamStall);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0,themePark.getAttractions().size());
        assertEquals(0,themePark.getStalls().size());
    }

    @Test
    public void canAddInterests(){
        themePark.addToAttractions(dodgem);
        themePark.addToAttractions(park);
        themePark.addToAttractions(playground);
        themePark.addToAttractions(rollerCoaster);
        themePark.addToStalls(candyFlossStall);
        themePark.addToStalls(tobaccoStall);
        themePark.addToStalls(iceCreamStall);
        assertEquals(4,themePark.getAttractions().size());
        assertEquals(3,themePark.getStalls().size());
    }

    @Test
    public void canGetAllReviewed(){
        assertEquals(4, themePark2.getAllReviewed().size());
    }
}
