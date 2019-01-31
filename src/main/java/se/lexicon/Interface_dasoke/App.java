package se.lexicon.Interface_dasoke;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CompactDisk r1=new CompactDisk(300,"KONGA","JANE");
    	System.out.println(r1.getItemPrice());
    	Displayable d1=new CompactDisk();
       	System.out.print("storname:"+" "+d1.storename +"/"+"price:"+"  "+r1.getItemPrice()+"/"+"title:"
    +r1.getTitle()+r1.getArtist()); 
    	
    	d1.display();
    	
    }
}
