import java.time.LocalDate;

public class Rental{
    private LocalDate rentDay = LocalDate.now();
    private LocalDate returnDay = rentDay.plusDays(2);

    public Rental (){
    }








    @Override
    public String toString() {
        return "Rental{" +
                "rentDay=" + rentDay +
                ", returnDay=" + returnDay +
                '}';
    }
}
