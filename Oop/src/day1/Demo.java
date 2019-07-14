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
		  Books b1 = new Books();
		  Radio r1 = new Radio();
		  Radio r2 = new Radio();
		  Dogs d1 = new Dogs();
		  Dogs d2 = new Dogs();
		  
		  b1.read("online");
		  r1.play("music");
		  r2.volume(45);
		  d1.bark("loud");
		  d2.fetch("ball");
		 
		  
	  }
 } 