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
    ParkingSpot parkingSpot1;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgem = new Dodgems("The Magic Dodgems", 12);
        park = new Park("The Magic Park", 3);
        playground = new Playground("The Magic Playground", 10);
        rollerCoaster = new RollerCoaster("The Magic Rollercoaster", 20);
        parkingSpot1 = new ParkingSpot(ParkingSpot.A1);
        candyFlossStall = new CandyflossStall("The Magic Candy Floss Stall","Magic Mike", parkingSpot1);
        tobaccoStall = new TobaccoStall("The Magic Tobacco Stall","Magic Tyke", parkingSpot1);
        iceCreamStall = new IceCreamStall("The Magic Ice Cream Stall", "Magic Ryke", parkingSpot1);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0,themePark.getAttractions().size());
        assertEquals(0,themePark.getStalls().size());
    }

    @Test
    public void canAddItems(){
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
}
