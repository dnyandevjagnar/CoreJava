package basicjava;

public class thisKeyWordWithConstructore {
    thisKeyWordWithConstructore(){
        this("xyz@gmail.com");
    }
    thisKeyWordWithConstructore(String gmail){
        this(30000.50f);
        System.out.println("Gmail : "+gmail);
    }
    thisKeyWordWithConstructore(float salary){
        this("TCS",2);
        System.out.println("Basic salary : "+salary);
    }
    thisKeyWordWithConstructore(String companyname,int divisionno){
        this("dnayndev","jagnar");
        System.out.println("Company Name : "+companyname+" , "+"Division No : "+divisionno);
    }
    thisKeyWordWithConstructore(String firstname,String lastname ){
        this(45);
        System.out.println("Full Name : "+firstname +" "+lastname);
    }
    thisKeyWordWithConstructore(int id){
        System.out.println("ID NO : "+id);
    }

    public static void main(String[] args) {
        thisKeyWordWithConstructore thisKeyWordWithConstructore =new thisKeyWordWithConstructore ();

    }
}
