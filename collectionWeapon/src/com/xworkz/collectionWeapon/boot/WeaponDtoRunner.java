package com.xworkz.collectionWeapon.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.util.Types;

import com.xworkz.collectionWeapon.Dto.WeaponDto;
import com.xworkz.collectionWeapon.type.types;

public class WeaponDtoRunner {

	public static void main(String[] args) {

		WeaponDto dto = new WeaponDto("AirGun", "Kiran", LocalDate.of(2022, 01, 20), 25000D, types.FIRAMS);
		// WeaponDto dto = new WeaponDto("AirGun", "Chitra", LocalDate.of(2022, 01, 20),
		// 25000D,types.FIRAMS);
		WeaponDto dto1 = new WeaponDto("adamsite", "Omkar", LocalDate.now(), 5620D, types.CHEMICAL_WEAPONS);
		WeaponDto dto2 = new WeaponDto("ak46", "Raviteja", LocalDate.now(), 7852D, types.AK47);
		WeaponDto dto3 = new WeaponDto("plague", "Shubam", LocalDate.now(), 15210D, types.BIOLOGICAL_WEPONS);
		WeaponDto dto4 = new WeaponDto("bola", "Dharshan", LocalDate.now(), 98524D, types.COMBAT_WEPONS);
		WeaponDto dto5 = new WeaponDto("cabine", "sangeetha", LocalDate.now(), 478547D, types.FIRAMS);
		WeaponDto dto6 = new WeaponDto("club", "Kartik", LocalDate.now(), 795485D, types.lONG_RANGE_WEAPONS);
		WeaponDto dto7 = new WeaponDto("iron", "Akshay", LocalDate.now(), 985620D, types.Long);
		WeaponDto dto8 = new WeaponDto("thonawk", "Manu", LocalDate.now(), 875482D, types.MISSILAS);
		WeaponDto dto9 = new WeaponDto("Automic bomb", "Govind", LocalDate.now(), 879458D, types.NUCLEAR_WEPONS);
		WeaponDto dto10 = new WeaponDto("bazooka", "Jems", LocalDate.now(), 8490D, types.ROCKET);
		WeaponDto dto11 = new WeaponDto("handgun", "Goslin", LocalDate.now(), 789200D, types.SEMI_AUTOMIC);
		WeaponDto dto12 = new WeaponDto("cannon", "anusha", LocalDate.now(), 40000D, types.SIGE_WEPONS);
		WeaponDto dto13 = new WeaponDto("long", "Nayana", LocalDate.now(), 558200D, types.SHORT_RANGE_WEAPONS);
		WeaponDto dto14 = new WeaponDto("narve gas", "Nataraj", LocalDate.now(), 15022D, types.CHEMICAL_WEAPONS);
		WeaponDto dto15 = new WeaponDto("grenad", "Navya", LocalDate.now(), 12000D, types.EXPLOSSIVE);
		WeaponDto dto16 = new WeaponDto("catpult", "Airpitha", LocalDate.now(), 362000D, types.SIGE_WEPONS);
		WeaponDto dto17 = new WeaponDto("blowgun", "Balu", LocalDate.now(), 28000D, types.FIRAMS);
		WeaponDto dto18 = new WeaponDto("ICBM", "Naveen", LocalDate.now(), 98201D, types.MISSILAS);
		WeaponDto dto19 = new WeaponDto("Yellow", "Shalini", LocalDate.now(), 599999D, types.BIOLOGICAL_WEPONS);

		WeaponDto a3 = new WeaponDto();
		Collection<WeaponDto> wepons = Stream.of(dto, dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10,
				dto11, dto12, dto13, dto14, dto15, dto16, dto17, dto18, dto19).collect(Collectors.toList());
		wepons.stream().forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());

		System.out.println("Printing all weapon price gratherthan 100");
		wepons.stream().filter(e -> e.getPrice() > 1000).collect(Collectors.toList())
				.forEach(p -> System.out.println(p));

		System.out.println(System.lineSeparator());

		System.out.println("Print all weapons madeby and made on");
		wepons.stream().collect(Collectors.toList())
				.forEach(r -> System.out.println("Made By    : " + r.getMadeBy() + "    Made On  : " + r.getMadeOn()));

		System.out.println(System.lineSeparator());

		System.out.println("Print all the weapons by name sorted in desc order");

		wepons.stream().sorted((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by madeBy  :");
		wepons.stream().sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn())).collect(Collectors.toList())
				.forEach(r -> System.out.println(r));

		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice())).collect(Collectors.toList())
				.forEach(p -> System.out.println(p));

		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1, a2) -> Double.compare(a2.getPrice(), a1.getPrice())).collect(Collectors.toList())
				.forEach(p -> System.out.println(p));

		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");

	}

}
