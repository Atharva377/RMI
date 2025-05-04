import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
			super();
		}

		public void sendsent(String sen1,String sen2) throws RemoteException{
			
			System.out.println("Received sen1 = " + sen1);
			System.out.println("Received sen2 = " + sen2);
		}

		public int lengthsen(String sen) throws RemoteException
		{
			System.out.println("The length of the txt string is: "+sen +"  "+ (sen.length()));
			return sen.length();
		}

		public String constring(String sen1,String sen2) throws RemoteException{
			System.out.println("concatenation of the txt string is: "+(sen1+sen2));
			return sen1+sen2;
		}

		public boolean palindrome(String a) throws RemoteException{
			StringBuilder sb = new StringBuilder(a);
        	sb.reverse();

        	if (a.equals(sb.toString()))
			{
            	System.out.println("String is Palindrome!");
				return true;
			}
        	else
			{
				System.out.println("String is Not Palindrome!");
				return false;
			}
            	
		}
		public String Reversestr(String a) throws RemoteException{
			StringBuilder sb = new StringBuilder(a);
        	sb.reverse();
			System.out.println("Reverse of the txt string is: "+(sb.toString()));
			return sb.toString();	
		}
		public boolean isequalstring(String str1, String str2) throws RemoteException {
			if (str1.equals(str2))
			{
				System.out.println("String is equal!");
				return true;
			}
			else
			{
				System.out.println("String is not equal!");
				return false;
			}
		}
	}
	
