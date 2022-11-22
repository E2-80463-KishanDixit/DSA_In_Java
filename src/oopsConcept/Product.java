package oopsConcept;


 class myProduct{
	 
		private static  int id;
		private   static  int mrp ;
		private  static int sellingPrice ;
		private static String name;
		
	 
	 myProduct(int id,int mrp,int sellingPrice,String name){
		 this.id = id;
		 this.mrp= mrp;
		 this.sellingPrice = sellingPrice;
		 this.name = name;
	 }

	 myProduct(myProduct x){
		 id= x.id;
		 mrp = x.mrp;
		 sellingPrice = x.sellingPrice;
		 name= x.name;
	 }
	 
	// SETTERS
	 public static void setId(int n) {
		 id=n;
	 }
	 
	 public static void setMrp(int n) {
		 mrp=n;
	 }
	 public static void setSellingPrice(int n) {
		 sellingPrice = n;
	 }
	 
	 public static void setName(String str) {
		 name = str;
	 }
	 
	 // GETTERS
	 public static int getId() {
		 return id;
	 }
	 
	 public static int getMrp() {
		 return mrp;
	 }
	 public static int getSellingPrice() {
		 return sellingPrice;
	 }
	 
	 public static String getName() {
		 return name;
	 }
}


public class Product {

	public static void main(String[] args) {
    
		myProduct car = new myProduct(2424,12000,130000,"Honda1");
		myProduct car2 = new myProduct(car);
		
		System.out.println(car.getMrp());
		System.out.println(car.getId());
		System.out.println(car.getSellingPrice());
		System.out.println(car.getName());
		
		System.out.println("<<<<<<<<<<-------------------->>>>>>>>>>");
		car2.setName("Honda2ProMax");
		System.out.println(car2.getMrp());
		System.out.println(car2.getId());
		System.out.println(car2.getSellingPrice());
		System.out.println(car2.getName());
		
		System.out.println("<<<<<<<<<<-------------------->>>>>>>>>>");

		System.out.println(car2.getName());
		
		
		
		
		
		
		
		
//		car.setMrp(1200);
////		myProduct.setMrp(100);
//		myProduct.setSellingPrice(500);
//    System.out.println("Mrp  "+ car.getMrp());
//    System.out.println("Selling Price   "+ car.getSellingPrice());
   
	}

}
