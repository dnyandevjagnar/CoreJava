package oop.inheritance;

import basicjava.ProtectedAccessSpecifierDifferentPackage;

public class ProtectedAccessSpecifierTest  extends ProtectedAccessSpecifierDifferentPackage {

    public static void main(String[] args) {
           ProtectedAccessSpecifierTest Testclass=new ProtectedAccessSpecifierTest();

           Testclass.displayMethodDifferentPackage();
          // Testclass.showMethodDifferentPackage();//private does not call



    }
}
