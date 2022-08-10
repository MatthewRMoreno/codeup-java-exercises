package java_two.movies;

public class Movie {
        //create 2 private fields
    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " -- " + category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //create a constructor for both of the private fields
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


}
