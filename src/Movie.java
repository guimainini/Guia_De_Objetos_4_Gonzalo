import java.util.ArrayList;




public class Movie {
    private String title;
    private int releaseDate;
    private int duration;
    private String audience; //G  PG  PG-13  R NC-17  UNRATED
    private String country; // AR US UK SP
    private String decription;
    private int stock;



    public Movie(String title, int releaseDate, int duration, String audience, String country, String decription, int stock) {
        this.title = title.toUpperCase();
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.audience = audience;
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
    public String getAudience() {
        return audience;
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

    //unico metodo set q voy a necesitar
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setStockDiscount() {
        this.stock --;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration + " minute"+
                ", audience='" + audience + '\'' +
                ", country='" + country + '\'' +
                ", decription='" + decription + '\'' +
                ", stock=" + stock +
                '}';
    }

    //Creo las peliculas y la mando para quien las llame
    static ArrayList<Movie> listMovie = new ArrayList<Movie>();

    static public ArrayList<Movie> crearPeli(){

        Movie m1 = new Movie("Nemo",2002,120,"G","US","ANIMATED FILM",4);
        Movie m2 = new Movie("Aladin",2006,90,"G","UK","ANIMATED FILM",2);
        Movie m3 = new Movie("Rey Leon",2008,89,"G","AR","ANIMATED FILM",1);
        Movie m4 = new Movie("Los increibles",2004,130,"G","US","ANIMATED FILM",6);

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
