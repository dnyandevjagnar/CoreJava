package oop.inheritance;

public class Grandparent {
    Grandparent(){
        System.out.println("Grand parent money");
    }
    private void clothes(){
        System.out.println("Grand parent clothes ");
    }
    private void bankAccount1(){
        System.out.println("Grand parent bank account  ");
    }
    void  home(){
        System.out.println("Grand  parent home");
    }
    public static void main(String[] args) {
        Grandparent Grandparent=new Grandparent();
        Grandparent.clothes();
        Grandparent.home();
        Grandparent.bankAccount1();
    }
}
