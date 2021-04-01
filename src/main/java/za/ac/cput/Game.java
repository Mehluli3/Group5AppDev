package za.ac.cput;

/**
 * @author Ameer Dollie (218336934)
 *
 * This is a simple game application
 * Date: 1 April 2021
 */

public class Game {
    private String name, yearReleased;

    public String getName(String name){
        return name;
    }

    public String getYearReleased(String yearReleased){
        return yearReleased;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString(){
        return "Game{" +
                "Name = " + name + " / " +
                "Year released : " + yearReleased + " / " +
                "}";
    }
}
