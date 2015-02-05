import PersonDetails.Caract;
 public class Persona {
   private Caract caract;
   	 
	
   public static void main (String[] args ){

	   Persona Details = new Persona();
	   Details.setValues();
	   Details.showValues();	
	}
   
   private void setValues(){
	caract = new Caract();
	caract.setName("Genaros");
	caract.setJob("QA");
	
	   
   }
   private void showValues(){
	   System.out.printf("The Person name is %s\n", caract.getName());
	   System.out.printf("The Person Job title is %s\n", caract.getJob());
   }
   
	
}
 
