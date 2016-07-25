class Cat implements Pet{
    private String song="mav",name;
    Cat(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name+"-"+song;
    }
}