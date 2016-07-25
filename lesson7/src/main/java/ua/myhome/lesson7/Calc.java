package ua.myhome.lesson7;

class Calc{
    public static void main(String[] arg){
        System.out.println("Start calc....");
	double perem1=Double.valueOf(arg[0]);
	double perem2=Double.valueOf(arg[1]);
	System.out.println("sum  = "+(perem1+perem2));
	System.out.println("minus  = "+(perem1-perem2));
	System.out.println("mnog  = "+(perem1*perem2));
	System.out.println("del  = "+(perem1/perem2));
    }
}