
public class Account {




    private String name ;
    private String id ;
    private int balance = 0 ;

    int amount ;







    Account (String id , String name) {

    }


    Account (String id , String name , int balance){

    this.name = name ;
    this.id = id ;
    this.balance = balance ;


    }




//    get

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }





    //    set

    public void setId(String id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setBalance(int balance) {
        this.balance = balance;

    }








    public void credit (int amount ){

    balance += amount ;

    }



    public void debit (int amount ){

       if (balance >= amount){
           balance -= amount ;
       }else {
           System.out.println("amount exceeded");
       }
    }



    public void transferTo ( Account another , int amount){

        if (balance >= amount){
            balance -= amount ;
            another.balance += amount ;

        }else {
            System.out.println("amount exceeded");
        }
    }




}
