import java.time.LocalDate;

public class Ticket {
    private LocalDate rentDay = LocalDate.now();
    private LocalDate returnDay = rentDay.plusDays(2);
    private String anyClient;
    private String anyMovie;

    public Ticket(){
    }

    /*public Ticket(String anyClient,String anyMovie ){
    }*/

    public Ticket(String anyClient, String anyMovie) {
        this.anyClient = anyClient;
        this.anyMovie = anyMovie;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rentDay=" + rentDay +
                ", returnDay=" + returnDay +
                ", anyClient='" + anyClient + '\'' +
                ", anyMovie='" + anyMovie + '\'' +
                '}';
    }


}
