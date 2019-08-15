package day1;

class Books {
	String name;
	String author;
	public void read(String medium) {
		
	}
	
}


 class Radio {
	 String company;
	 String color;
	 void play(String audio) {
		 
	 }
	 void volume(int vol) {
		 
	 }
	 
}
 
 class Dogs {
	  String breed;
	  int age;
	  void bark(String intensity) {
		  
	  }
	  void fetch(String toy) {
		  
	  }
 }
 
 
public class Demo {
	  
	  public static void main(String[] args) {
		  Books book1 = new Books();
		  Radio radio1 = new Radio();
		  Radio radio2 = new Radio();
		  Dogs dog1 = new Dogs();
		  Dogs dog2 = new Dogs();
		  
		  book1.read("online");
		  radio1.play("music");
		  radio2.volume(45);
		  dog1.bark("loud");
		  dog2.fetch("ball");
		 
		  
	  }
 } 