package se.lexicon.Interface_dasoke;

public class CompactDisk implements RetailItem,Displayable  {
    
	public double getItemPrice() {
	      return price;
     }
  
     double price;
     String title;
     String artist;
    
  
    public CompactDisk() {
	
    }
    
         
      public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle() {
		this.title=title;
	}

	public CompactDisk (double price,String title,String artist) {
	  this.price=price;
	  this.title=title;
	  this.artist=artist;
	 }
    
      public void setTitle(String title) {
	 this.title=title;
     }
     public void display() {
	 System.out.println("jula");
     }
    
}