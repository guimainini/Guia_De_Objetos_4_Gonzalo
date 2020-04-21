import java.util.ArrayList;

enum Gene{
    action, adventure, comedy, drama,horror,documentary;
}
enum Rate{
    G, PG, PG_13, R, NC_17, UNRATED;
}

public class Movie {
    private String title;
    private int releaseDate;
    private int duration;
    private Rate rate; //G  PG  PG-13  R NC-17  UNRATED
    private String country; // AR US UK SP
    private String decription;
    private int stock;
    private Gene gene;
    private int timesRent = 0;

    public Movie(String title, int releaseDate, int duration, Rate rate,Gene gene, String country, String decription, int stock) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.rate = rate;
        this.gene = gene;
        this.country = country;
        this.decription = decription;
        this.stock = stock;

    }

    // metodos Get
    public String getTitle() {
        return title;
    }
    public int getReleaseDate() {
        return releaseDate;
    }
    public int getDuration() {
        return duration;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Gene getGene() {
        return gene;
    }

    public void setGene(Gene gene) {
        this.gene = gene;
    }

    public String getCountry() {
        return country;
    }
    public String getDecription() {
        return decription;
    }
    public int getStock() {
        return stock;
    }

    public int getTimesRent() {
        return timesRent;
    }

    public void setTimesRent(int timesRent) {
        this.timesRent = timesRent;
    }

    //unico metodo set q voy a necesitar
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setStockDiscount() {
        this.stock --;
    }
    public void setStockIncrement() {
        this.stock ++;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", rate=" + rate +
                ", country='" + country + '\'' +
                ", decription='" + decription + '\'' +
                ", stock=" + stock +
                ", gene=" + gene +
                '}';
    }

    //Creo las peliculas y la mando para quien las llame
    static ArrayList<Movie> listMovie = new ArrayList<Movie>();

    static public ArrayList<Movie> crearPeli(){

        Movie m1 = new Movie("nemo",2002,120,Rate.G,Gene.action,"US","ANIMATED FILM",4);
        Movie m2 = new Movie("nladin",2006,90,Rate.G,Gene.action,"UK","ANIMATED FILM",2);
        Movie m3 = new Movie("rey Leon",2008,89,Rate.G,Gene.action,"AR","ANIMATED FILM",1);
        Movie m4 = new Movie("los increibles",2004,130,Rate.G,Gene.action,"US","ANIMATED FILM",6);

        listMovie.add(m1);
        listMovie.add(m2);
        listMovie.add(m3);
        listMovie.add(m4);

        return listMovie;
    }

    //buscar una peli si existe y devuelve si o no esta
    static public String cheackMovie (String title){
        int exist = -1;
        String thisMovie = "La pelicula que busca Existe";
        int i = 0;
        while(i < listMovie.size() && exist == -1){
            if(listMovie.get(i).getTitle().equals(title)){
                exist = i;
            }
            i++;
        }
        if(exist == -1){
            thisMovie = "La pelicula que busca No Existe";
        }else{
            thisMovie += " y cuanta con un stock de : "+listMovie.get(exist).getStock();
        }
        return thisMovie;
    }

    //buscar la posicion de la peli
    static public int  posicionMovie (String title) {
        int exist = -1;
        int i = 0;
        while(i < listMovie.size() && exist == -1){
            if(listMovie.get(i).getTitle().equals(title)){
                exist = i;
            }
            i++;
        }
        return exist;
    }









}
