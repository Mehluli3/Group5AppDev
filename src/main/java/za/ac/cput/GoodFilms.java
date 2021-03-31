package za.ac.cput;
//Dlamini M 219105359 - App Dev 3 2021 March
//This is a class for my favourite film

public class GoodFilms {

    int yearReleased;
    double price;
    String review;
    String title;

    public GoodFilms() {
        this.yearReleased = 1998;
        this.price = 10.00;
        this.review = "Good";
        this.title = "Godzilla";
    }

    public int getYearReleased()
    {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "GoodFilms{" +
                "yearReleased=" + yearReleased +
                ", price=" + price +
                ", review='" + review + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
