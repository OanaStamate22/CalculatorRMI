import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
  public static void main(String[] args) throws Exception {
    Generator Ob = new Generator();  
    //Naming.rebind("rmi:///Ob",Ob);
    Registry reg = LocateRegistry.createRegistry(1099);
    reg.rebind("Ob", Ob);
    System.out.println("Serverul s-a legat la" +
                       " registrul RMI");
  }
}