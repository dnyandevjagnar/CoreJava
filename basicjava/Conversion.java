package basicjava;

class   Conversion{
    Conversion(){

          char x='a';
        int y=x;
        System.out.println(y);
    }

    public static void main(String[] args) {
        Conversion co=new Conversion();
        // conversion octal literal to decimal literal
        int a= 02077;
        System.out.println(a);

        // conversion hexadecimal literal  to decimal literal
        int b= 0x4035;
        System.out.println(b);

        //conversion binary literal to decimal literal
        int c= 0b1010;
        System.out.println(c);

        //print the ascii value
        int d= 'a';
        int e= 'A';
        int f= '0';
        int g= '9';
        System.out.println("ascii value of a is "+d);
        System.out.println("ascii value of A is "+e);
        System.out.println("ascii value of Z is "+(e+25));
        System.out.println("ascii value of 0 is "+f);
        System.out.println("ascii value of 9 is "+g);



    }
}
