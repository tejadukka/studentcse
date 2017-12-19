import java.io.*; 
import java.net.*;
import java.util.*;
public class hdlcclient{  
public static void main(String args[])
{
try
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
Socket clsct=new Socket("127.0.0.1",1339); 
DataInputStream din=new DataInputStream(clsct.getInputStream()); 
DataOutputStream dout=new DataOutputStream(clsct.getOutputStream()); 
System.out.println("Enter the data:");
 String str1=in.readLine(); 
System.out.println("Enter the start delimiter:");
String st=in.readLine();
System.out.println("Enter the stop delimiter:");
String s=in.readLine();
int l1=st.length();
int l2=s.length();
dout.writeInt((l1*10)+l2);
dout.writeBytes(st+str1+s+'\n'); 
String str=din.readLine(); 
System.out.println("The data sent is: "+st+str1+s);
clsct.close(); 
} 
catch(Exception e) 
{
 System.out.println(e); 
}
 }
}


