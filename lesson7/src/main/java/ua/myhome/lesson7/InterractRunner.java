package ua.myhome.lesson7;

import java.util.Scanner;
class InterractRunner{
    public static void main(String[] arg){
			Scanner scan=new Scanner(System.in);
			System.out.println("Start calc model 2");
			try{
				final Calculator calc=new Calculator();
				String exit="no";
				while(!exit.equals("yes")){
					System.out.println("Enter par 1");
					String first=scan.next();
					System.out.println("Enter par 2");
					String second=scan.next();
					try {
						calc.startCalculation(Double.valueOf(first), Double.valueOf(second));

					} catch (UserException e) {
						System.out.println(e);
						//e.printStackTrace();
					}



					System.out.println("result sum="+calc.getResultSun());
					System.out.println("result minus="+calc.getResultMin());
					System.out.println("result mnog="+calc.getResultMnog());
					System.out.println("result del="+calc.getResultDel());
					System.out.println("EXIT yes/no");
					exit=scan.next();
					calc.resetZnch();
				}
			}finally {
				scan.close();
			}

	}
}