public class shadow {
   static int c= 10;// it should shadowed at line 7

    public static void main(String[] args) {
        System.out.println(c );//10
        int c ;// it will shadow the line 2 and it is the declaration the line 2 will be shadower afer the declararion 
        c=30;//initialization then the scope will being
        System.out.println(c);//79
        
        
    }
}
