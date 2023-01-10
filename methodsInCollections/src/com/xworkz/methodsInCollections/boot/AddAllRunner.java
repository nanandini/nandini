package com.xworkz.methodsInCollections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AddAllRunner {

	public static void main(String[] args) {

		Collection<String> damsInKarnataka = new ArrayList<String>();
		damsInKarnataka.add("Almatti Dam");
		damsInKarnataka.add("KRS Dam");
		damsInKarnataka.add("Vani Villasa Sagara Dam");
		damsInKarnataka.add("Tungabhadra Dam");
		damsInKarnataka.add("Linganamakki Dam");
		damsInKarnataka.add("Bhadra Dam");
		damsInKarnataka.add("Supa Dam");
		damsInKarnataka.add("Kadra Dam");
		damsInKarnataka.add("Kabini Dam");
		damsInKarnataka.add("Manchanabele Dam");
		damsInKarnataka.add("Markonahalli Dam");
		damsInKarnataka.add("Gorur Dam");
		damsInKarnataka.add("Dandiganahalli Dam");
		damsInKarnataka.add("Linganamakki Dam");
		damsInKarnataka.add("Chandrampalli Dam");
		damsInKarnataka.add("Harangi Dam");
		damsInKarnataka.add("Gajanur Dam");
		damsInKarnataka.add("Yagachi Dam");
		damsInKarnataka.add("Hidakal Dam");
		damsInKarnataka.add("Lakya Dam");
		damsInKarnataka.add("Neerasagar Dam");
		damsInKarnataka.add("Kanva Dam");
		damsInKarnataka.add("Suvarnavathi Dam");
		damsInKarnataka.add("Tunga Anicut Dam");
		damsInKarnataka.add("Kodasalli Dam");
		damsInKarnataka.add("BRP Dam");
		damsInKarnataka.add("Beechanahalli Dam");
		damsInKarnataka.add("Narayanpur Dam");
		damsInKarnataka.add("Nugu Dam");
		damsInKarnataka.add("Gundal Dam");
		damsInKarnataka.add("Lggalur Dam");
		damsInKarnataka.add("Hemavathi Dam");
		damsInKarnataka.add("Kodasalli Dam");

		System.out.println("Size of Dams in Karnataka :" + damsInKarnataka.size());

		Collection<String> damsInKerala = new ArrayList<String>();
		damsInKerala.add("Malampuzha Dam");
		damsInKerala.add("Mangalam Dam");
		damsInKerala.add("Meenkara Dam");
		damsInKerala.add("Chulliar Dam");
		damsInKerala.add("Mattupetty Dam");
		damsInKerala.add("Idukki Dam");
		damsInKerala.add("Neyyar Dam");
		damsInKerala.add("Mullaperiyur Dam");
		damsInKerala.add("Neyyar Dam");
		damsInKerala.add("kakkayam Dam");
		damsInKerala.add("Banasura Sagar Dam");
		damsInKerala.add("Thenmala Dam");
		damsInKerala.add("cheuthoni Dam");
		damsInKerala.add("Pothundi Dam");
		damsInKerala.add("Walayar Dam");
		damsInKerala.add("Siruvani Dam");
		damsInKerala.add("KanjiraPuzha Dam");
		damsInKerala.add("Parambikulam Dam");
		damsInKerala.add("Thunakkadavu Dam");
		damsInKerala.add("Peruvaaripallam Dam");
		damsInKerala.add("Sholayur Dam");
		damsInKerala.add("Peringalkuthu Dam");
		damsInKerala.add("Thenmala Dam");
		damsInKerala.add("Aruvikkara Dam");
		damsInKerala.add("Peechi Dam");
		damsInKerala.add("Vazhani Dam");
		damsInKerala.add("Kuttiady Dam");
		damsInKerala.add("Neyyar Dam");
		damsInKerala.add("Pamba Dam");
		damsInKerala.add("kakki Dam");
		damsInKerala.add("Ponmudi Dam");
		damsInKerala.add("Anayirankal Dam");
		damsInKerala.add("Kundala Dam");
		damsInKerala.add("Mattupatti Dam");
		damsInKerala.add("Sengulam Dam");
		damsInKerala.add("Peppara Dam");
		damsInKerala.add("Chimmony Dam");
		damsInKerala.add("Kulamavu Dam");
		damsInKerala.add("Maniyar Dam");
		damsInKerala.add("Pambla Dam");
		damsInKerala.add("Peruvaripallam Dam");
		damsInKerala.add("Thunakkadavu Dam");
		damsInKerala.add("KallarKutty Dam");

		System.out.println("Size of Dams in Kerala :" + damsInKerala.size());

		Collection<String> damsInOdisha = new ArrayList<String>();

		damsInOdisha.add("Hirakud Dam");
		damsInOdisha.add("Jalaput Dam");
		damsInOdisha.add("Mandira Dam");
		damsInOdisha.add("Patora Dam");
		damsInOdisha.add("Rengali Dam");
		damsInOdisha.add("Balimela Dam");
		damsInOdisha.add("Indravati Dam");
		damsInOdisha.add("pilasalunki Dam");
		damsInOdisha.add("Deras Dam");
		damsInOdisha.add("Hadagarh Dam");

		System.out.println("Size of Dams in Odisha :" + damsInOdisha.size());

		Collection<String> damsInTamilnadu = new ArrayList<String>();

		damsInTamilnadu.add("Sholayar Dam");
		damsInTamilnadu.add("Aliyar Dam");
		damsInTamilnadu.add("Kallanai Dam");
		damsInTamilnadu.add("Manimuthar and Papanasam Dam");
		damsInTamilnadu.add("Mettur Dam");
		damsInTamilnadu.add("Aliyar Dam");
		damsInTamilnadu.add("Kodiveri Dam");
		damsInTamilnadu.add("Rallia Dam");
		damsInTamilnadu.add("Vaigai Dam");
		damsInTamilnadu.add("Thirumoorthi Dam");
		damsInTamilnadu.add("Nirar Dam");
		damsInTamilnadu.add("Krishnagiri Dam");
		damsInTamilnadu.add("Sathanur Dam");
		damsInTamilnadu.add("Maravakandy Dam");
		damsInTamilnadu.add("Bhavani Sagar Dam");
		damsInTamilnadu.add("Kelevarapalli Dam");
		damsInTamilnadu.add("Karaiyar Dam");
		damsInTamilnadu.add("KRP Dam");
		damsInTamilnadu.add("Thitumoorthy Dam");
		damsInTamilnadu.add("Panchapalli Dam");
		damsInTamilnadu.add("Sazhaiyaar Dam");
		damsInTamilnadu.add("Sattanur Dam");
		damsInTamilnadu.add("Mukurthi Dam");
		damsInTamilnadu.add("Mekkara Dam");
		damsInTamilnadu.add("Amaravathi Dam");
		damsInTamilnadu.add("Pilavakkal Dam");
		damsInTamilnadu.add("Varathamanathi Dam");
		damsInTamilnadu.add("KamarajSagar Dam");
		damsInTamilnadu.add("Visvakudi Dam");
		damsInTamilnadu.add("Kottarai Dam");

		System.out.println("Size of Dams in TamilNadu  :" + damsInTamilnadu.size());

		Collection<String> damsInAndhraPradesh = new ArrayList<String>();
		damsInAndhraPradesh.add("Somasila Dam");
		damsInAndhraPradesh.add("Nagarjuna Sagar Dam");
		damsInAndhraPradesh.add("Jalaput Dam");
		damsInAndhraPradesh.add("Mylavaram Dam");
		damsInAndhraPradesh.add("Srisailam Dam");
		damsInAndhraPradesh.add("Koyna Dam");
		damsInAndhraPradesh.add("Penna Dam");
		damsInAndhraPradesh.add("Akkapalem Dam");
		damsInAndhraPradesh.add("Alaganoor Dam");
		damsInAndhraPradesh.add("Ananthasagar Dam");
		damsInAndhraPradesh.add("Andhra Dam");
		damsInAndhraPradesh.add("Arniar Dam");
		damsInAndhraPradesh.add("bahuda Dam");
		damsInAndhraPradesh.add("Bhairavanithipa Dam");
		damsInAndhraPradesh.add("Bhupathipalem Dam");
		damsInAndhraPradesh.add("Buggaavagu Dam");
		damsInAndhraPradesh.add("Buggavanka Dam");
		damsInAndhraPradesh.add("Bukkapatnam Dam");
		damsInAndhraPradesh.add("chagullaBarrage Dam");
		damsInAndhraPradesh.add("cheyyaru Dam");
		damsInAndhraPradesh.add("Chennayara Dam");
		damsInAndhraPradesh.add("Chintakuntava Dam");
		damsInAndhraPradesh.add("chitravathi Dam");
		damsInAndhraPradesh.add("Cumbum Dam");
		damsInAndhraPradesh.add("dharmaram dam");
		damsInAndhraPradesh.add("Cheruvu Dam");
		damsInAndhraPradesh.add("Gajuladinne Dam");
		damsInAndhraPradesh.add("gandicheruvu Dam");
		damsInAndhraPradesh.add(" gorakallu dam");
		damsInAndhraPradesh.add("Gundlamotu Dam");
		damsInAndhraPradesh.add("Haresamudram big Dam");
		damsInAndhraPradesh.add("Jajigedda Dam");
		damsInAndhraPradesh.add("Jalakanur Dam");
		damsInAndhraPradesh.add("Jalleru Dam");
		damsInAndhraPradesh.add("Kakarla Dam");
		damsInAndhraPradesh.add("Kalangi Dam");
		damsInAndhraPradesh.add("Kalyani Dam");
		damsInAndhraPradesh.add("Kanigiri Dam");
		damsInAndhraPradesh.add("Konam Dam");
		damsInAndhraPradesh.add("Kumili Dam");
		damsInAndhraPradesh.add("Marala Dam");
		damsInAndhraPradesh.add("Mapadu Dam");
		damsInAndhraPradesh.add("Nagurur Dam");
		damsInAndhraPradesh.add("nellore Dam");
		damsInAndhraPradesh.add("pampa Dam");
		damsInAndhraPradesh.add("pedaballi Dam");
		damsInAndhraPradesh.add("peddagedda Dam");
		damsInAndhraPradesh.add("pendlur Dam");
		damsInAndhraPradesh.add("peruru Dam");
		damsInAndhraPradesh.add("pincha Dam");
		damsInAndhraPradesh.add("Rallapadu Dam");
		damsInAndhraPradesh.add("sadasivakona Dam");
		damsInAndhraPradesh.add("sancherla Dam");
		damsInAndhraPradesh.add("Savisettipalli Dam");
		damsInAndhraPradesh.add("somasilla Dam");
		damsInAndhraPradesh.add("Surampalem Dam");
		damsInAndhraPradesh.add("Thadukuvaga Dam");
		damsInAndhraPradesh.add("Thammileru Dam");
		damsInAndhraPradesh.add("Thatipudi Dam");
		damsInAndhraPradesh.add("Thippayapalem Dam");
		damsInAndhraPradesh.add("upper pennar Dam");
		damsInAndhraPradesh.add("varsha Dam");
		damsInAndhraPradesh.add("varikunta Dam");
		damsInAndhraPradesh.add("veligallu Dam");
		damsInAndhraPradesh.add("veligonda Dam");
		damsInAndhraPradesh.add("vottigadda Dam");
		damsInAndhraPradesh.add("yeleru Dam");
		damsInAndhraPradesh.add("yogivemana Dam");
		damsInAndhraPradesh.add("zerreru Dam");

		System.out.println("Size of Dams in AndhraPradesh :" + damsInAndhraPradesh.size());

		Collection<String> damsInMaharashtra = new ArrayList<String>();
		damsInMaharashtra.add("Mulshi Dam");
		damsInMaharashtra.add("panshet Dam");
		damsInMaharashtra.add("khadakwasla Dam");
		damsInMaharashtra.add("vaitarna Dam");
		damsInMaharashtra.add("dhom Dam");
		damsInMaharashtra.add("osho teerth Dam");
		damsInMaharashtra.add("gangapur Dam");
		damsInMaharashtra.add("bhavali Dam");
		damsInMaharashtra.add("bhushi Dam");
		damsInMaharashtra.add("koyna Dam");
		damsInMaharashtra.add("bhadradhara Dam");
		damsInMaharashtra.add("kasarsai Dam");
		damsInMaharashtra.add("jayakwadi Dam");
		damsInMaharashtra.add("gadeshwar Dam");
		damsInMaharashtra.add("bhatghar Dam");
		damsInMaharashtra.add("surabardi Dam");
		damsInMaharashtra.add("radhanagari Dam");
		damsInMaharashtra.add("aswali Dam");
		damsInMaharashtra.add("morbe Dam");
		damsInMaharashtra.add("valvan Dam");
		damsInMaharashtra.add("waghur Dam");
		damsInMaharashtra.add("hatnur Dam");
		damsInMaharashtra.add("upper wardha Dam");
		damsInMaharashtra.add("ghatghar Dam");
		damsInMaharashtra.add("pimpalgan joga Dam");
		damsInMaharashtra.add("temghar Dam");
		damsInMaharashtra.add("varasgaon Dam");
		damsInMaharashtra.add("itiadoh Dam");
		damsInMaharashtra.add("koyananagar Dam");
		damsInMaharashtra.add("totladoh Dam");

		System.out.println("Size of Dams in Maharashtra :" + damsInMaharashtra.size());

		Collection<String> damsInBihar = new ArrayList<String>();
		damsInBihar.add("Mahatma gandhi setu dam");
		damsInBihar.add("Imcredible kaimur dam");
		System.out.println("Size of Dams in Bihar :" + damsInBihar.size());

		Collection<String> collection = new ArrayList<String>();
		collection.addAll(damsInKarnataka);

		for (String string : collection) {
			System.out.println("element :" + string);
		}
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			String element = itr1.next();
			if (element.startsWith("R")) {
				System.out.println(" charecter ends with ra:" + element);
			}
		}
		Iterator<String> itr2 = collection.iterator();

		while (itr2.hasNext()) {
			String element = itr2.next();
			if (element.endsWith("ra")) {
				System.out.println("chracter ends with ra:" + element);
			}
		}
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			String element = itr3.next();
			if (element.length() > 15) {
				System.out.println("elements with more than 15 characters ");
			}
		}
		Iterator<String> itr4 = collection.iterator();
		while (itr4.hasNext()) {
			String element = itr4.next();
			System.out.println(element.toUpperCase());
		}
		Iterator<String> itr5 = collection.iterator();
		while (itr5.hasNext()) {
			String element = itr5.next();
			System.out.println(element.toLowerCase());

			if (element.contains("P")) {
				System.out.println("character wchich contain p is removes:" + element);
			}

		}

		Iterator<String> itr6 = collection.iterator();
		while (itr6.hasNext()) {
			String string = itr6.next();
			int index = 0;

			StringBuffer buffering = new StringBuffer(string);
			buffering.reverse();

			String palindrom = buffering.toString();
			if (string.equals(palindrom)) {
				index++;
				System.out.println("if there palindom found:" + buffering);

			}

		}
	}

}
