class Calculator{
    private double resSum,resMinus,resMnog,resDel;
    boolean firstPar=true;
    public void start(double ... param){
        for(Double par:param){
            resSum+=par;
            if(firstPar != true) {
                resMinus -= par;
            }else{
                resMinus = par;
            }
            if(resMnog>0) {
                resMnog *= par;
            }else{
                resMnog = par;
            }
            if(resDel>0) {
                resDel /= par;
            }else{
                resDel = par;
            }

            firstPar=false;
        }
    }
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