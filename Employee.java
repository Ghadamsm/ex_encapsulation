public class Employee {

    private String nameEm ;
    private String idEm ;
    private double salary ;
    private double annualSalary ;

    Employee(String idEm , String nameEm , double salary ){
        this.nameEm = nameEm ;
        this.idEm = idEm ;
        this.salary = salary ;

    }




//    get


    public String getIdEm() {
        return idEm;
    }


    public String getNameEm() {
        return nameEm;
    }


    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {

        annualSalary = salary / 12 ;

        return annualSalary;
    }




    //    set


    public void setIdEm(String id) {
        this.idEm = id;
    }


    public void setNameEm(String name) {
        this.nameEm = name;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }





    public double raisedSalary (double percent){

       percent = (salary * 10) /100 ;

        return percent;
    }



}


