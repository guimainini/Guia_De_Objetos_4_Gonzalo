import java.time.LocalDate;

public class Ticket {
    private LocalDate rentDay = LocalDate.now();
    private LocalDate returnDay = rentDay.plusDays(2);
    private String anyClient;
    private String anyMovie;

    public Ticket(){
    }

    public Ticket(String anyClient, String anyMovie) {
        this.anyClient = anyClient;
        this.anyMovie = anyMovie;
    }

    public String getAnyClient() {
        return anyClient;
    }

    public void setAnyClient(String anyClient) {
        this.anyClient = anyClient;
    }

    public String getAnyMovie() {
        return anyMovie;
    }

    public void setAnyMovie(String anyMovie) {
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
