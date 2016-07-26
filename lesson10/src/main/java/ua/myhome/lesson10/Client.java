package ua.myhome.lesson10;

class Client{
    private String name;
    private Pet pet;
    Client(String name, Pet pet){
        this.name=name;
        this.pet=pet;
    }
    public  void  addClient(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    public String getPet(){
        return pet.getName();
    }
    public String getName(){
        return name;
    }

}