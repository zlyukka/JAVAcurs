package ua.myhome.lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Clinic {
    private static List<Client> clients = new ArrayList<Client>();
    private static Scanner scan = new Scanner(System.in);
    private static final int CAT = 1, DOG = 2;
    private static String exit = "n";

    /**
     * Add client and his pet
     *
     * @param clientName
     * @param petName
     * @param petVid
     */
    private static void addClient(String clientName, String petName, int petVid) {
        if (petVid == CAT) {
            clients.add(new Client(clientName, new Cat(petName)));
        } else {
            clients.add(new Client(clientName, new Dog(petName)));
        }
    }

    private static void ShowMenu() {
        System.out.println("");
        System.out.println("Add client 1");
        System.out.println("Search  pet 2");
        System.out.println("Delete client 3");
        System.out.println("Exit Q");
        menuChoice();
    }

    private static void showAllClient() {
        for (Client cli : clients) {
            System.out.println(clients.indexOf(cli)+") "+cli.getName() + "-" + cli.getPet());
        }
    }

    private static String serchPetByClient() {
        System.out.println("Enter client name");
        String result = "client is empty";
        String clientName = scan.next();
        for (Client cli : clients) {
            if (cli.getName().equals(clientName)) {
                result = cli.getPet();
            }
        }
        return result;
    }

    private static void deleteClient(){
        System.out.println("Enter client name");
        String clientName = scan.next();
        String result = clientName+"client is empty";
        Iterator<Client> itr=clients.iterator();
        while(itr.hasNext()){

            if(itr.next().getName().equals(clientName)){
                itr.remove();
                result="Element "+clientName+" was removed";
                break;
            }
        }
        System.out.println(result);
        showAllClient();
    }

    private static void addClient(){
        String clientName, petName;
        int petTyp = 0;
        System.out.println("Enter name:");
         clientName=scan.next();
        System.out.println("Cat = 1");
        System.out.println("Dog = 2");
        while(petTyp!=CAT && petTyp!=DOG) {
            petTyp = Integer.valueOf(scan.next());
        }
        System.out.println("Pet Nme");
        petName=scan.next();
        addClient(clientName,petName,petTyp);
        showAllClient();
    }
    private static void menuChoice(){
        switch(scan.next()){
            case "1": System.out.println("add");
                    addClient();
                break;
            case "2": System.out.println("Search");
                    System.out.println(serchPetByClient());
                break;
            case "3": System.out.println("Delete");
                    deleteClient();
                break;
            case "q": System.out.println("Exit");
                    exit="y";
                break;
            default: menuChoice(); break;
        }
    }
    public static void main(String arg[]) {

        System.out.println("Now in Clinic");
        addClient("Jhon_Sina","Tom",CAT);
        addClient("Sina","Balbes",DOG);
        addClient("Jhon","Berta",DOG);
        showAllClient();
        System.out.println("");
        while (!exit.equals("y")){
            ShowMenu();
        }
    }
}
