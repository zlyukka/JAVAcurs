class Calc{
    public static void main(String[] arg){
        System.out.println("Start calc....");
	double perem1=Double.valueOf(arg[0]);
	double perem2=Double.valueOf(arg[1]);
	System.out.println("Результат сложения  = "+(perem1+perem2));
	System.out.println("Результат вычитаничя  = "+(perem1-perem2));
	System.out.println("Результат умножения  = "+(perem1*perem2));
	System.out.println("Результат Деления  = "+(perem1/perem2));
    }
}