import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import stalls.CandyflossStall;
import stalls.Stall;
import java.util.ArrayList;
import java.util.Collection;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark (){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }


    public void addToAttractions(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addToStalls(Stall stall) {
        stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewedList = new ArrayList<IReviewed>();
        for (Attraction attraction : attractions){
            if ( attraction.getRating() != 0){
                reviewedList.add(attraction);
            }
        }
        for (Stall stall : stalls){
            if ( stall.getRating() != 0){
                reviewedList.add(stall);
            }
        }

        return reviewedList;
    }
}
