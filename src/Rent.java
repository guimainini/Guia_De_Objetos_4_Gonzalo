import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rent {

    public static ArrayList<Movie> listMovie = new ArrayList<Movie>();
    public static ArrayList<Ticket> listTicket = new ArrayList<Ticket>();
    public static ArrayList<Client> listClient = new ArrayList<Client>();

    public static void printMovieList (ArrayList<Movie> listMovie){
        for (int i = 0; i < listMovie.size();i++){
            System.out.println(listMovie.get(i).toString());
        }
    }

    public static void printTicketList (ArrayList<Ticket> listTicket) {
        for (int i = 0; i < listTicket.size(); i++) {
            System.out.println(listTicket.get(i).toString());
        }
    }
        //pelis alquiladas hoy
    public static void printMoviesRentToday (ArrayList<Ticket> listTicket)  {
        LocalDate today = LocalDate.now();
        for(int i = 0;i<listTicket.size();i++){
            if(listTicket.get(i).getRentDay().equals(today)){
                System.out.println(listTicket.get(i).getAnyMovie());
            }
        }

        }


        //pelis devueltas hoy
        public static void printMoviesToBeReturnToday (ArrayList<Ticket> listTicket)  {
            LocalDate today = LocalDate.now();
            for(int i = 0;i<listTicket.size();i++){
                if(listTicket.get(i).getReturnDay().equals(today)){
                    System.out.println(listTicket.get(i).getAnyMovie());
                }
            }

        }
//ultimas 10
public static void printLastTenMoviesRentFromClient (String name, ArrayList<Ticket> listTicket){
        int i = listTicket.size();
        int j = 0;
        while (i>0 && j<10){
            if(listTicket.get(i).getAnyClient().equals(name)){
                System.out.println(listTicket.get(i).getAnyMovie());
                j++;
            }
        i--;
        }
    }

    //mas alquilada
    public static String knowMostRentMovie (ArrayList<Movie> listMovie){
        String movie = "La mas alquilada es : ";
        int aux = 0;
        for ( int i = 0;i<listMovie.size();i++){
            if(listMovie.get(i).getTimesRent() > listMovie.get(aux).getTimesRent()){
                aux = i;
            }
        }

        return movie + listMovie.get(aux).getTitle();
    }

        //mas alquilada x genero
    public static void printMoviesMostRentGene (Gene gene, ArrayList<Movie> listMovie){
        ArrayList<Movie> auxMovieList = new ArrayList<Movie>();
        int j = 0;
        for(int i = 0;i<listMovie.size();i++){                     // sobreescribo el metodo de comparacion para poder usarlo
            if(listMovie.get(i).getGene().equals(gene)){    //y mostar los dalos ordenadas de mayor a menos
                auxMovieList.add(j,listMovie.get(i));
                j++;
            }
        }
    Collections.sort(auxMovieList, new Comparator<Movie>() {   //sobreescribo el metodo de comparacion para poder usarlo
        @Override                                               //y mostrar los datos ordenados de mayor a menor
        public int compare(Movie o1, Movie o2) {
            return new Integer(o1.getTimesRent()).compareTo(new Integer(o1.getTimesRent()));
        }
    });
        printMovieList(auxMovieList);
    }







}
