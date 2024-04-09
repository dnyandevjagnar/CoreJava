package oop.inheritance;

public class Daughter extends Child {

    private void bankAccount4(){
        System.out.println(" Daughter bank account  ");
    }
    public static void main(String[] args) {

        Daughter Daughter = new Daughter();
        Daughter.home();
        Daughter.school();
        Daughter.schoolbag();
        Daughter.bankAccount4();
        Daughter.bicycle();

       // Daughter.bankAccount1();
       // Daughter.bankAccount2();



    }
}
