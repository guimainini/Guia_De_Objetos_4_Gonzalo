import java.util.ArrayList;

public class Client {
    private String name;
    private String cell;
    private String address;

    public Client (String name,String cell,String address){
        this.name = name;
        this.cell = cell;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public String getCell() {
        return cell;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cell='" + cell + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    static public ArrayList<Client> listClient = new ArrayList<Client>();

    static public ArrayList<Client> createClient(){

        Client c1 = new Client("guillermo","154226951","Almafuerte 2204");
        Client c2 = new Client("renzo","11111111","Almafuerte 1111");
        Client c3 = new Client("pedro","22222222","Almafuerte 2222");

        listClient.add(c1);
        listClient.add(c2);
        listClient.add(c3);

        return listClient;
    }

    //buscar si existe un cliente
    static public int searchExistsClient (String name){
        int exist = -1;
        int i = 0;
        while(i < listClient.size() && exist == -1){
            if(listClient.get(i).getName().equals(name)){
                exist = i;
            }
            i++;

        }
        return exist;
    }








}
