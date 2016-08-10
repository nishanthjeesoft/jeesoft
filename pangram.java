import java.io.*;
/**
 *
 * @author Nishanth
 */
public class Juspay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
     DataInputStream din=new DataInputStream(System.in);
     int i,flag=0;
     String str=din.readLine();
     String str1=str.toLowerCase();
     
    for(i=0;i<26;i++)
    {
         char c=(char)('a'+i);
         
         String c1=Character.toString(c);

       
         if(str1.contains(c1)==false)
         {
             flag=1;
         }
         
     }
    if(flag==0)
    {
        System.out.println("yes");
            }
    else
    {
        System.out.println("not");
    }
    }
    
}
