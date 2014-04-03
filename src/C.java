import java.rmi.*; 
import java.rmi.server.*;

public class C extends UnicastRemoteObject implements I {

	private double val; 
                int nr_ordine,k;

	public C(int i,int nr) throws RemoteException { 
		val = i; nr_ordine = nr;
	}

	public void adunare(double i) {
		val = val + i; nr_ordine++; System.out.println(nr_ordine + "\t(+): " + val);
	}
        public void scadere(double i) {
		val = val - i; nr_ordine++; System.out.println(nr_ordine + "\t(-): " + val);
	}
        public void inmultire(double i) {
                val = val * i; nr_ordine++; System.out.println(nr_ordine + "\t(*): " + val);
	}
        public void impartire(double i) {
            k=0;
           if(i==0){k=1; System.out.println("Nu se poate imparti la 0.");}
           else val = val / i; nr_ordine++; System.out.println(nr_ordine + "\t(/): " + val);
	}
        public void inversare() {
            val = val * (-1) ;nr_ordine++; System.out.println(nr_ordine + "\t(-1): " + val);
	}
        public void ridicare(double i) {
            if(i==0) val= 1; 
            else{double a=val; 
                if(i>0) for(int j=1;j<=i;j++) val=val*a;
                 else { for(int l=1;l<=i;l++) val=val*a;
                        val=1/val;
                      }
                }      
                               nr_ordine++; System.out.println(nr_ordine + "\t(^): " + val); 
	}
        public void factorial() {
            double x = val; k=0;
            if(val != Math.floor(val)){k=1; System.out.println("Nr. nu e int.");}
                else if(val<1) {k=1;System.out.println("Nr. e 0 sau negativ.");}
                       else{val=1;
                            for(int a=1;a<=x;a++)
                               val = val * a;
                               nr_ordine++; System.out.println(nr_ordine + "\t(!): " + val);
                             }
	}
        public void radacina() {
            if(val<1) {k=1;System.out.println("Nr. este 0 sau negativ.");}
            else val = Math.sqrt(val); 
                                nr_ordine++; System.out.println(nr_ordine + "\t(R): " + val); 
	}

    
        public double curent() { return val; }
        public int sem() { return k; }
   }
