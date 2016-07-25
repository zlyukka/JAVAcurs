class ClientTest {
    public static void main(String[] arg) {
        Client client = new Client("Vasya", new Cat("Tom"));
        System.out.println("client-"+client.getName()+" pet-"+client.getPet());
        Client client1 = new Client("Petya", new Dog("Dick"));
        System.out.println("client-"+client1.getName()+" pet-"+client1.getPet());
    }
}