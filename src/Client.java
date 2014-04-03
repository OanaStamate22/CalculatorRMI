
import java.rmi.*; 
import java.util.*;

public class Client {
  public static void main(String[] args) 
                     throws RemoteException {
    int x = 0;double val; Scanner sc = new Scanner(System.in);
    System.out.print("Adresa server : ");
    String url = "rmi://" + sc.next() + "/Ob";
    I_Generator Ob = null; I serv = null;
    try { 
      Ob = (I_Generator) Naming.lookup(url);
    }
    catch(Exception e) {
      System.out.println("Conectare esuata");
      System.exit(0);
    }
    try { 
     serv = Ob.server_propriu(); 
    }
    catch(Exception e) { }
    System.out.print("Valoare : ");
      val = sc.nextInt();serv.adunare(val);
    for( ; ; ) {
      System.out.println("Valoarea curenta este: "+ serv.curent() ); 
      System.out.println("Ce doresti sa faci : ");
      System.out.println("1.Adunare 2.Scadere 3.Inmultire 4.Impartire 5.Inversul 6.Ridicare la putere 7.Factorial 8. Radacina patrata 0.Exit");
      x = sc.nextInt();
      switch (x) {
               case 1: System.out.print("Valoare : ");val = sc.nextInt();serv.adunare(val);break;
               case 2: System.out.print("Valoare : ");val = sc.nextInt();serv.scadere(val);break;
               case 3: System.out.print("Valoare : ");val = sc.nextInt();serv.inmultire(val);break;
               case 4: System.out.print("Valoare : ");val = sc.nextInt();serv.impartire(val);if(serv.sem()!=0)System.out.println("Eroare.");break;
               case 5: serv.inversare();break;
               case 6: System.out.print("Valoare : ");val = sc.nextInt();serv.ridicare(val);break;
               case 7: serv.factorial();if(serv.sem()!=0)System.out.println("Eroare.");break;
               case 8: serv.radacina();if(serv.sem()!=0)System.out.println("Eroare.");break;
               case 0: System.exit(0);System.out.println("Val. curenta este: " + serv.curent());sc.close();break;
               default: System.out.println("Nu exista aceasta operatie.Rezultatul nu este afectat.");break;
      }
    } 
  }
}
