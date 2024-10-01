package org.example;

public   class operation extends mathimatic_operation {

    private int Firstnumber;
    private int Secondnumber;
    private int Thirdnumber;

    private double Firstnumber_dble;
    private double Secondnumber_dble;
    private double Thirdnumber_dble;


    public int getThirdnumber() {
        return Thirdnumber;
    }

    public void setThirdnumber(int thirdnumber) {
        Thirdnumber = thirdnumber;
    }

    public double getThirdnumber_dble() {
        return Thirdnumber_dble;
    }

    public void setThirdnumber_dble(double thirdnumber_dble) {
        Thirdnumber_dble = thirdnumber_dble;
    }


    public double getFirstnumber_dble()
    {
        return Firstnumber_dble;
    }

    public void setFirstnumber_dble(double firstnumberDble)
    {
        Firstnumber_dble=firstnumberDble;
    }

    public double getSecondnumber_dble()
    {
        return Secondnumber_dble;
    }

    public void setSecondnumber_dble(double secondnumberDble)
    {
        Secondnumber_dble=secondnumberDble;
    }

    public int getSecondnumber() {
        return Secondnumber;
    }

    public void setSecondnumber(int secondnumber) {
        Secondnumber = secondnumber;
    }

    public int getFirstnumber() {
        return Firstnumber;
    }

    public void setFirstnumber(int firstnumber) {
        Firstnumber = firstnumber;
    }
    @Override
    public int add_operation(int num1 , int num2)
    {
        int result=num1+num2;
        return result;
    }
    public int add_operation(int num1, int num2, int num3)
    {
        int result= num1+ num2+ num3;
        return result;
    }
    @Override
    public double add_operation(double num1 , double num2)
    {
        double result=num1+num2;
        return result;
    }
    public double add_operation(double num1, double num2, double num3)
    {
    double result=num1+num2+num3;
    return result;
    }

}
