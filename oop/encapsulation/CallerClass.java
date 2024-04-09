package oop.encapsulation;

public class CallerClass extends WrapperClass{
    public static void main(String[] args) {
        CallerClass CallerClass=new CallerClass();
        CallerClass.setId(101);
        CallerClass.setName("Dnyandev");
        CallerClass.setmNumber("12345678");
        CallerClass.setCity("pune");
        System.out.println("ID : "+CallerClass.getId());
        System.out.println("Name : "+CallerClass.getName());
        System.out.println("Mobile Number : "+CallerClass.getmNumber());
        System.out.println("City : "+CallerClass.getCity());
    }
}
