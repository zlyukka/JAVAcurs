class Dog implements Pet{
    private String song="gav",name;
    Dog(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name+"-"+song;
    }
}