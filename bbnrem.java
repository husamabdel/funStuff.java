import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
	
	public class bbnrem{
		public static void main(String []args) throws FileNotFoundException{
		
		String username;
		JOptionPane.showMessageDialog(null, "VPN automatic repair program");
		JOptionPane.showMessageDialog(null, "Please change the server if you haven't already done\nby heading to thr big ip edge client and clicking \"change server\"");
		JOptionPane.showMessageDialog(null, "");
		username = JOptionPane.showInputDialog("Pease enter your user name: ");
		
		PrintWriter outputFile = new PrintWriter("c:/Packages/VP_PKG_SAM/VPN_FIX.cmd");
		
		outputFile.println("ipconfig /flushdns");	
		outputFile.println("pause");
		outputFile.close();
		
		PrintWriter vbsFile = new PrintWriter("c:/Packages/VP_PKG_SAM/VPN_otherFixes.vbs");
		
		vbsFile.println("Set FS = CreateObject(\"Scripting.FileSystemObject\")");
		vbsFile.println("FS.MoveFolder \"C:\\users\\"+username+"\\AppData\\Roaming\\F5 Networks\", \"C:\\users\\"+username+"\\AppData\\Roaming\\F5 Networks.old\"");
		vbsFile.println("x=MsgBox(\"All Done!\")");
		vbsFile.close();
		
		JOptionPane.showMessageDialog(null, "A file named \"VPN_otherFixes\" was created in c:\\Packages,\n The file will run automatically and change the name of a directoy in AppData\\Roaming\n please restart you machine after 10 seconds from now! ");
		
		System.exit(0);
		}
	}