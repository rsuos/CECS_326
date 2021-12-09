/**
 * Quote server listening to port 6017.
 *
 */
 
import java.net.*;
import java.io.*;

public class QuoteServer
{
  public static void main(String[] args)
  {
	  try
	  {
		  ServerSocket sock = new ServerSocket(6017);
		  
		  // Now listen for connections
		  
		  while (true)
		  {
			  Socket client = sock.accept();
			  
			  PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
			  
			  // Write the data to the socket
			  pout.println(new java.util.Date().toString());
			  
			  /*
			   * Close the socket and resume
			   * Listening for connections
			   */
			  
			  client.close();
		  }
	  }
	  catch (IOException ioe)
	  {
		  System.err.println(ioe);
	  }
  }
}