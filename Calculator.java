class Calculator{
    private double resSum,resMinus,resMnog,resDel;
    private final static int RESET_ZNCH = 0;
    boolean firstPar=true;
    /*
        Сбрасываем все значения
     **/
    public void resetZnch(){
        resSum=RESET_ZNCH;
        resMinus=RESET_ZNCH;
        resMnog=RESET_ZNCH;
        resDel=RESET_ZNCH;
        firstPar = true;
    }
    /*
        Основной метод принимающий параметры и выполняющий с ними все возможные операции + - * /
     **/
    public  void startCalculation(double ... param){
        for(Double par:param){
            sumPer(par);
            minusPer(par);
            mnogPer(par);
            delPer(par);
            firstPar=false;
        }
    }
    /*
        Метод реализующий сложение
    **/
    private void sumPer(double num){
        resSum+=num;
    }
    /*
        Метод реализующий вычитание
    **/
    private void minusPer(double num){
        if(firstPar != true) {
            resMinus -= num;
        }else{
            resMinus = num;
        }
    }
    /*
        Метод реализующий Умножение
    **/
    private void mnogPer(double num){
        if(resMnog>0) {
            resMnog *= num;
        }else{
            resMnog = num;
        }
    }
    /*
        Метод реализующий деление
    **/
    private void delPer(double num){
        if(resDel>0) {
            resDel /= num;
        }else{
            resDel = num;
        }
    }
    /*
        Методы реализирующие возврат значений из класса
    **/
    public double getResultSun(){
        return resSum;
    }
    public double getResultMin(){
        return resMinus;
    }
    public double getResultMnog(){
        return resMnog;
    }
    public double getResultDel(){
        return resDel;
    }
}