import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Movie> listMovie = new ArrayList<Movie>();
    static ArrayList<Client> listClient = new ArrayList<Client>();
    static Rental rental = new Rental();




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;

        boolean exit = true;
        int flag,flag2;
        String title,name,newClientName,newClientCell,newClientAddress;
        char option2,option3;






        listMovie = Movie.crearPeli();
        listClient = Client.createClient();

        for(Movie e:listMovie){
            System.out.println(e.toString());
        }

        System.out.println();
        for(Client r:listClient){
            System.out.println(r.toString());
        }




        while(exit){

        System.out.println("1. Buscar pelicula y si esta en stock ");
        System.out.println("2. Alquilar");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("8. Quiere poder ver información detallada de un determinado título.");
        System.out.println("9.Exit");
        option = in.nextInt();


        switch (option) {
            case 1:
                System.out.print("Digite el nombre de la pelicula que desea buscar : ");
                in.nextLine();
                title = in.nextLine();
                title = title.toUpperCase();
                flag = Movie.buscarSiExiste(title);
                if(flag != -1) {
                    if (listMovie.get(flag).getStock() > 1) {
                        System.out.println("Hay peliculas en stock.");
                        System.out.println("Usted tiene en stock " + listMovie.get(flag).getStock());
                    } else {
                        System.out.println("No tiene en stock");
                    }
                }else{
                    System.out.println("La pelicula q busca no existe");
                }
                break;
            case 2:
                do {
                    System.out.print("Digite el nombre de la pelicula que desea buscar : ");
                    in.nextLine();
                    title = in.nextLine();
                    title = title.toUpperCase();
                    flag = Movie.buscarSiExiste(title);
                    if (flag != -1) {
                        if (listMovie.get(flag).getStock() > 1) {
                            System.out.println("Hay peliculas en stock.");
                            System.out.println("Usted tiene en stock " + listMovie.get(flag).getStock());
                        } else {
                            System.out.println("No tiene en stock");
                        }
                    } else {
                        System.out.println("La pelicula q busca no existe");
                    }
                    System.out.println("Desea buscar otra (s/n)");
                    option3 = in.next().charAt(0);
                }while(option3 == 's');


                in.nextLine();
                System.out.print("Ingrese el nombre del cliente : ");
                name = in.nextLine();

                flag2 = Client.searchExistsClient(name);
                System.out.println(flag2);
                    if(flag2 != -1){
                        listMovie.get(flag).setStockDiscount(1);
                        System.out.println("Hay peliculas en stock.");
                        System.out.println("Usted tiene en stock " + listMovie.get(flag).getStock());


                        System.out.println("\n\n\n");
                        System.out.println(rental.toString());


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
                            for(Client r:listClient){
                                System.out.println(r.toString());
                            }
                        }

                    }


                break;
            case 3:
                    //devolucion

                break;
            case 4:
                    //alquileres del dia

                break;
            case 5:
                    //devolucion del dia
                break;
            case 6:
                    //consulta ultimos titulos cada cliente
                break;

            case 7:

                break;

            case 8:


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
