package com.xworkz.constructors;

public class TeaRunner {

	public static void main(String[] args) {
		
		 Tea favTea=new Tea();
		   
		 System.out.println("details of literal properties.....");
		 
		 System.out.println("name:"+favTea.shopName);
		 System.out.println("type:"+favTea.type);
		 System.out.println("healthy:"+favTea.healthy);
		 System.out.println("quantity:"+favTea.quantity);
         System.out.println("colour:"+favTea.colour);
         System.out.println("made:"+favTea.madeInIndia);
         System.out.println("cost:"+favTea.cost);
         System.out.println("streetname:"+favTea.streetName);
         System.out.println("aboutHealth:"+favTea.goodForHealth);
         
         System.out.println("shop details......");
         
         favTea.nameOfOwner="Myself";
         System.out.println("name:"+favTea.nameOfOwner);
         
         favTea.expiredDate="2020";
         System.out.println("date:"+favTea.expiredDate);
         
         favTea.growth="15%";
         System.out.println("growth:"+favTea.growth);
         
         favTea.shopWorkers="ME and my Friends";
         System.out.println("workers:"+favTea.shopWorkers);
        	
         favTea.shopLocation="chikkaballapur";
         System.out.println("location:"+favTea.shopLocation);
         
         favTea.price=45;
         System.out.println("price:"+favTea.price);
         
         favTea.good=true;
         System.out.println("good:"+favTea.good);
         
         favTea.nameOfWorker="Radhakrishnan";
         System.out.println("name:"+favTea.nameOfWorker);
         
         favTea.shopFeedBack="overall its Excellent";
         System.out.println("feedback:"+favTea.shopFeedBack);
	}

}
