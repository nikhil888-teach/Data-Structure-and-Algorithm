package OOP.ADVANCE;

class Movie {
    private String title, studio, rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "5 Star";
    }

    static Movie[] fiveStarMovie(Movie[] m) {
        Movie[] m1 = new Movie[m.length];
        int size = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null) {
                if (m[i].rating.equalsIgnoreCase("5 Star")) {
                    m1[size] = m[i];
                    size++;
                }
            }
        }
        return m1;
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }
}

public class MovieInfo {
    public static void main(String[] args) {
        Movie[] m = new Movie[5];
        m[0] = new Movie("Salar", "Humble");
        m[1] = new Movie("kgf 2", "Humble");
        m[2] = new Movie("ADIPURUSH", "T-SERIES", "1 Star");
        m[3] = new Movie("Kalki", "YASH RAJ FILMS", "5 Star");
        Movie[] fiveStar = Movie.fiveStarMovie(m);
        for (int i = 0; i < fiveStar.length; i++) {
            if (fiveStar[i] != null) {
                System.out.println(fiveStar[i].getTitle());
            }
        }

    }
}
