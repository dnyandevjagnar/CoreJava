package constructor;

public class ParametariseConstructor {

    ParametariseConstructor(String countryname){
             System.out.println("***** Cricket player history *****");
             System.out.println("Country Name :"+countryname);
    }
    ParametariseConstructor(String playerfirstname,String playerlasrname){
        System.out.println(" Player Name : "+playerfirstname+","+playerlasrname);
    }
    ParametariseConstructor(int  jerseyno){
        System.out.println(" Jersey NO  : "+jerseyno);

    }

    ParametariseConstructor( int odi_runs,int twotwenty_runs,int test_runs){
        System.out.println(" ODI Run : "+odi_runs+", 20-20 Run : "+twotwenty_runs+", Test Run : "+test_runs);
    }
    ParametariseConstructor( float odi_avg,float twotwenty_avg,float test_avg){
        System.out.println(" ODI Avg : "+odi_avg+", 20-20 Avg : "+twotwenty_avg+", Test Avg : "+test_avg);
    }

    public static void main(String[] args) {
        ParametariseConstructor ParametariseConstructor=new ParametariseConstructor("India");
        ParametariseConstructor ParametariseConstructor1=new ParametariseConstructor("Rohit","Sharma");
        ParametariseConstructor ParametariseConstructor2=new ParametariseConstructor(45);
        ParametariseConstructor ParametariseConstructor4=new ParametariseConstructor(10709,3974,4034);
        ParametariseConstructor ParametariseConstructor5=new ParametariseConstructor(49.12f,31.79f,44.82f);

    }
}
