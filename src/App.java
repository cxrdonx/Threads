
public class App {

   public static boolean cancelar;
   public static int turno;
    public static void main(String[] args) throws Exception {
          cancelar = false;
          turno = Math.random()%100+1<=50?1:2;
          Thread p = new Thread( new proceso(),"proceso1" );
        Thread p2 = new Thread( new proceso(),"proceso2" );
            p.start();
            p2.start();
            try {
                Thread.currentThread().sleep( 2000 );
            }catch( InterruptedException e ){}
            System.out.println( Thread.currentThread() );        
                p.stop();
                p2.stop();
            
            }
}

