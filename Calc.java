class Calc{
    public static void main(String[] arg){
        System.out.println("Start calc....");
	double perem1=Double.valueOf(arg[0]);
	double perem2=Double.valueOf(arg[1]);
	System.out.println("��������� ��������  = "+(perem1+perem2));
	System.out.println("��������� ����������  = "+(perem1-perem2));
	System.out.println("��������� ���������  = "+(perem1*perem2));
	System.out.println("��������� �������  = "+(perem1/perem2));
    }
}