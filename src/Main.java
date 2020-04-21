import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Movie> listMovie = new ArrayList<Movie>();
    static ArrayList<Client> listClient = new ArrayList<Client>();
    static ArrayList<Ticket> listTicket = new ArrayList<Ticket>();

    static Ticket ticket = new Ticket();



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        boolean exit = true;
        int flag,flag2;
        String title,name,newClientName,newClientCell,newClientAddress;
        char option2,option3;





        //traigo las pelis y cliente creados en otras clases
        listMovie = Movie.crearPeli();
        listClient = Client.createClient();


        //muestro clientes y pelis
        for(Movie e:listMovie){
            System.out.println(e.toString());
        }
        System.out.println();
        for(Client r:listClient){
            System.out.println(r.toString());
        }




        while(exit){

        System.out.println("1. Buscar pelicula si existe y si esta en stock ");
        System.out.println("2. Alquilar ");
        System.out.println("3. Devolucion ");
        System.out.println("4. Alquileres del dia");
        System.out.println("5. Que tienen que devolver hoy");
        System.out.println("6. Pelis del cliente");
        System.out.println("7. La mas alquilada");
        System.out.println("8. Ver pelis por genero");
        System.out.println("9.Exit");
        option = in.nextInt();


        switch (option) {
            case 1:
                System.out.print("Digite el nombre de la pelicula que desea buscar : ");
                in.nextLine();
                title = in.nextLine();
                String hi = Movie.cheackMovie(title);
                System.out.println(hi);
                break;
            case 2:
                do {
                    System.out.print("Digite el nombre de la pelicula que desea buscar : ");
                    in.nextLine();
                    title = in.nextLine();
                    String his = Movie.cheackMovie(title);
                    System.out.println(his);

                    System.out.println("Desea buscar otra (s/n)");
                    option3 = in.next().charAt(0);
                }while(option3 == 's');


                in.nextLine();
                System.out.print("Ingrese el nombre del cliente : ");
                name = in.nextLine();
                flag = Client.searchExistsClient(name);

                    if(flag != -1){
                        int flag3 = Movie.posicionMovie(title);
                        listMovie.get(flag3).setStockDiscount();

                        Ticket t1 = new Ticket(name,title);
                        listTicket.add(t1);
                        System.out.println(t1.toString());


                       /* System.out.println("\n\n\n");
                        System.out.println(ticket.toString());*/


                    }else {
                        System.out.print("El cliente no existe...");
                        System.out.println("Desea ingresar un nuevo cliente (s/n)");
                        option2 = in.next().charAt(0);

                        if(option2 == 's'){
                            in.nextLine();
                            System.out.print("Digite name : ");
                            newClientName = in.nextLine();
                            System.out.print("Digite cell : ");
                            newClientCell = in.nextLine();
                            System.out.print("Digite address : ");
                            newClientAddress = in.nextLine();

                            Client s1 = new Client(newClientName,newClientCell,newClientAddress);

                            listClient.add(s1);
                            System.out.println();

                            //nuestro que se alla cargado el usuario nuevo
                            for(Client r:listClient) {
                                System.out.println(r.toString());
                            }

                            //renerando el ticker del usuario
                            int flag3 = Movie.posicionMovie(title);
                            listMovie.get(flag3).setStockDiscount();

                            Ticket t1 = new Ticket(name,title);
                            listTicket.add(t1);
                            System.out.println(t1.toString());
                        }

                    }


                break;
            case 3:
                in.nextLine();
                System.out.println("Ingrese el nombre del cliente : ");
                name = in.nextLine();
                System.out.println("Ingrese el nombre de la pelicula : ");
                title = in.nextLine();
                int flag4 = Movie.posicionMovie(title);

                for (Ticket e:listTicket){
                    if(e.getAnyClient().equals(name) && e.getAnyMovie().equals(title)){
                        System.out.println("Devuelta la peli");

                        listMovie.get(flag4).setStockDiscount();
                        listTicket.clear();
                    }
                }

//

                break;
            case 4:
                in.nextLine();
                System.out.println("Las pelis del dia");
                Rent.printMoviesRentToday(Rent.listTicket);

                break;
            case 5:
                in.nextLine();
                System.out.println("Todas la pelis de hoy");
                Rent.printMoviesToBeReturnToday(Rent.listTicket);
                break;
            case 6:
                in.nextLine();
                System.out.println("Nombre del cliente");
                String clientLastTenMovie = in.nextLine();
                Rent.printLastTenMoviesRentFromClient(clientLastTenMovie, Rent.listTicket);
                break;

            case 7:
                System.out.println(Rent.knowMostRentMovie(Rent.listMovie));
                break;

            case 8:
                Rent.printMoviesMostRentGene(Gene.action, Rent.listMovie);

                break;

            case 9:
                exit = false;
                break;
            default:
                System.out.println("Opcion invalida...");
        }







        }











    }



}
