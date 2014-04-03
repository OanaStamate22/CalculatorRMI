
import java.rmi.*;

public interface I extends Remote {
  void adunare(double i) throws RemoteException;
  void scadere(double i) throws RemoteException;
  void inmultire(double i) throws RemoteException;
  void impartire(double i) throws RemoteException;
  void inversare() throws RemoteException;
  void ridicare(double i) throws RemoteException;
  void factorial() throws RemoteException;
  void radacina() throws RemoteException;

  int sem() throws RemoteException;
  double curent() throws RemoteException;
}
