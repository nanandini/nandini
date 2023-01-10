package com.xworkz.streamTask.boot;

import java.util.ArrayList;
import java.util.Collection;

public class CompanyDtoRunner {

	public static void main(String[] args) {
						Collection<PalaceDto> palaceDTOs = new ArrayList<PalaceDto>();
				palaceDTOs.add(new PalaceDto("Banglore palace", "Banglore", "Dharshan", true, 10));
				palaceDTOs.add(new PalaceDto("Mysore Palace", "Mysore", "Teja", false, 550));
				palaceDTOs.add(new PalaceDto("Tippu Sulthan palace", "Sriranga pattana", "Omkar", true, 200));
				palaceDTOs.add(new PalaceDto("Fort palace", "Chitadurga", "Vinoda", false, 101));
				palaceDTOs.add(new PalaceDto("Lalitha Mahal", "Mysore", "Akshara", true, 5021));

				Collection<ApplicationDTO> applicationDTOs = new LinkedList<ApplicationDTO>();
				applicationDTOs.add(new ApplicationDTO("Hospital ", 5.6, true, "google", 2500));
				applicationDTOs.add(new ApplicationDTO("Hotel ", 5.6, true, "facebook", 1500));
				applicationDTOs.add(new ApplicationDTO("Insurence ", 5.6, false, "yahoo", 150));
				applicationDTOs.add(new ApplicationDTO("Enterprice Applications ", 5.6, false, "amezon", 36254));
				applicationDTOs.add(new ApplicationDTO("Web Applications ", 5.6, true, "twitter", 98546));
				applicationDTOs.add(new ApplicationDTO("Mobile Applications ", 5.6, false, "Meta", 2510));

				Collection<DataBaseVenderDTO> dataBaseVenderDTOs = new LinkedList<DataBaseVenderDTO>();
				dataBaseVenderDTOs.add(new DataBaseVenderDTO("Enterprice", "Nikil", Type.HIRARCHICAL_DATABASES, 2.5, 150));
				dataBaseVenderDTOs.add(new DataBaseVenderDTO("Home", "Guru", Type.NETWORK_DATABASES, 3.1, 95));
				dataBaseVenderDTOs.add(new DataBaseVenderDTO("Hospital", "Jeevika", Type.NOSQL_DATABASES, 1.2, 56));
				dataBaseVenderDTOs.add(new DataBaseVenderDTO("State", "Omkar", Type.OBJECT_ORIENTED_DATABASES, 5.5, 280));
				dataBaseVenderDTOs.add(new DataBaseVenderDTO("Country", "Hareesha", Type.SQL, 6.1, 75));

				Collection<CompanyCEODTO> companyCEODTOs = new LinkedList<CompanyCEODTO>();
				companyCEODTOs.add(new CompanyCEODTO("Omkar", "Xworkz", 20, "india", "BE/Btech", true,new DaugtherDTO("Shilpa", 9900775088L, 21, false, true)));
				companyCEODTOs.add(new CompanyCEODTO("Hareesha", "TechRef", 14, "india", "BE/Btech/Bcom/Bse", false,new DaugtherDTO("Vinutha", 7022537779L, 25, true, true)));
				companyCEODTOs.add(new CompanyCEODTO("Ravi", "First America", 35, "india", "MBA/Mse/Mcom", true,new DaugtherDTO("Bhavana ", 9244537206L, 38, false, false)));
				companyCEODTOs.add(new CompanyCEODTO("Madhu", "Signiwins", 7, "india", "BE/Msc/Btech/MBA", false,new DaugtherDTO("Gouri", 7464578945L, 0, true, false)));
				companyCEODTOs.add(new CompanyCEODTO("Vinoda", "BNV", 38, "india", "BE/Btech/MCA", true,new DaugtherDTO("amulya", 6352145144L, 35, true, false)));
				

				Collection<DaugtherDTO> daugtherDTOs = new LinkedList<DaugtherDTO>();
//				daugtherDTOs.add();
//				daugtherDTOs.add);
//				daugtherDTOs.add();
//				daugtherDTOs.add();
//				daugtherDTOs.add();

//			find all the properties Palace DTO which is Not Destroyed	

				palaceDTOs.stream().filter(ele -> !ele.getDestroyed()).collect(Collectors.toList())
						.forEach(ele -> System.out.println(ele));

				System.out.println(System.lineSeparator());
				System.out.println("Find All ApplicationDTO which is free and Developed By Google");
//			Find All ApplicationDTO which is free and Developed By Google	
				applicationDTOs.stream().filter(ele -> ele.isFree() && "google".contains(ele.getDevelopedBy()))
						.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

				// Find all ApplicaionDTo where version greter than 5 and collect only name
				System.out.println(System.lineSeparator());
				System.out.println(" Find all ApplicaionDTo where version greter than 5 and collect only name");
				applicationDTOs.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toList())
						.forEach(ele -> System.out.println(ele.getName()));
//			find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto

				System.out.println(System.lineSeparator());
				System.out.println("find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto");

//			Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl
				System.out.println(System.lineSeparator());
				System.out.println("Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl");
				dataBaseVenderDTOs.stream().filter(ele -> ele.getLicenceCost() < 100 && ele.getType().equals("SQL"))
						.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

		// print all DatabaseVendor Dto Types
				System.out.println(System.lineSeparator());
				System.out.println(" print all DatabaseVendor Dto Types");
				dataBaseVenderDTOs.stream().map(ele -> ele.getType()).collect(Collectors.toList())
						.forEach(ele -> System.out.println(ele));
		// print detiles of companyCEO Dtos Daathoughter Dto
				System.out.println(System.lineSeparator());
				System.out.println("print detiles of companyCEO Dtos Daathoughter Dto");
				companyCEODTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
				System.out.println(System.lineSeparator());
				System.out.println("Dauthor dtos");
				daugtherDTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

//			print all Daughtor Dto names Of Company Ceos

				System.out.println(System.lineSeparator());
				System.out.println("print all Daughtor Dto names Of Company Ceos");
				daugtherDTOs.stream().map(ele -> ele.getName()).collect(Collectors.toList())
						.forEach(ele -> System.out.println(ele));

//			Get toatal CompanyDtos where age is Gretherthan 30
				System.out.println(System.lineSeparator());
				System.out.println("Get toatal CompanyDtos where age is Gretherthan 30");
				companyCEODTOs.stream().filter(ele -> ele.getAges() > 30).collect(Collectors.toList())
						.forEach(ele -> System.out.println(ele));

//			print Below formate from CompanyCEOdto  father age 7 daughter age 0

				System.out.println(System.lineSeparator());
				System.out.println("print Below formate from CompanyCetdto  father age 7 doughter age 0");
				companyCEODTOs.stream().filter(ele->ele.getDaugtherDTO().getAge()==0).collect(Collectors.toList()).forEach(ele->System.out.println("Father Age is :  "+ele.getAges() +"   dauther age is :" +ele.getDaugtherDTO().getAge()));
			}

		}
	}

}
