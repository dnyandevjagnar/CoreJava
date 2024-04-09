package oop.inheritance;

public class Parent extends Grandparent {
    Parent(){
        System.out.println("parent money");
    }
    private void bankAccount2(){
        System.out.println("parent bank account  ");
    }
    public static void main(String[] args) {
        Parent Parent=new Parent();
        Parent.home();
        Parent.bankAccount2();
    }
}
