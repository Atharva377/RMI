import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server{
	
	public static void main(String[] args){
	
		try{
			ServerImpl serverImpl = new ServerImpl();
			Naming.rebind("Server", serverImpl);
			
			System.out.println("Server Started....");
			/*LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/Server", serverImpl);

            System.out.println("Server Started and Ready...");*/
		
		}catch(Exception e){
			System.out.println("Exception Occurred At Server!" + e.getMessage());
		}
	}
	
	
}
