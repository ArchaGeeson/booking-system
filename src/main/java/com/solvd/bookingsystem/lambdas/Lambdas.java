package com.solvd.bookingsystem.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.bookingsystem.bean.Address;
import com.solvd.bookingsystem.bean.profiles.Admin;
import com.solvd.bookingsystem.bean.profiles.Member;
import com.solvd.bookingsystem.bean.profiles.User;
import com.solvd.bookingsystem.bean.theatre.Concert;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.exceptions.AddressNotFoundException;
import com.solvd.bookingsystem.util.DataCollection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambdas {
	private static Logger log = LogManager.getLogger(Lambdas.class.getName());
	static Lambdas message = new Lambdas();

	public static Supplier<String> welcomeMessage = () -> {
		return "Welcome to Lambdas...";
	};

	public static List<User> filterMembers(List<User> memberList, Predicate<? super User> predicate) {
		return memberList.stream().filter(predicate).collect(Collectors.toList());
	}

	public static void printList(List<Admin> adminList, Consumer<Admin> consumer) {
		adminList.stream().forEach((admin) -> consumer.accept(admin));
	}

	private static void findMovie(List<Movie> movies) {
		Optional<Movie> result = movies.stream().filter(movie -> movie.getRatings() >= 7.0).findFirst();
		log.info(result);

		if (result.isPresent()) {
			log.info("result: " + result.get());
		} else {
			log.info("Not found!");
		}
	}

	public static void main(String[] args) {

		// creating member list
		Member member1 = new Member();
		member1.setFirstName("Madison");
		member1.setLastName("George");
		member1.setId(100);

		Member member2 = new Member();
		member2.setFirstName("Pearly");
		member2.setLastName("Thomas");
		member2.setId(101);

		Member member3 = new Member();
		member3.setFirstName("Tommy");
		member3.setLastName("Hilfiger");
		member3.setId(102);

		Member member4 = new Member();
		member4.setFirstName("Calvin");
		member4.setLastName("Klein");
		member4.setId(103);

		Member member5 = new Member();
		member5.setFirstName("Tom");
		member5.setLastName("Hans");
		member5.setId(77);

		/*
		 * //List<Member> memberList = new LinkedList<User>(); memberList.add(member1);
		 * memberList.add(member2); memberList.add(member3); memberList.add(member4);
		 */

		// Supplier get() method
		log.info(message.welcomeMessage.get());

		List<User> memberList = Arrays.asList(new Member[] { member1, member2, member3, member4, member5 });

		// Predicate functional interface
		Predicate<User> predicateForName = (name) -> name.getFirstName().startsWith("T") && name.getId() > 100;

		for (User memberUser : memberList) {
			if (predicateForName.test(memberUser)) {
				log.info(memberUser.getFirstName() + " first name starts with T" + "id is greater than "
						+ memberUser.getId());
			}
		}

		List<User> resultFirstNameC = Lambdas.filterMembers(memberList, (name) -> name.getFirstName().startsWith("C"));
		log.info("resultFirstNameC : " + resultFirstNameC);

		List<User> nameStartsWithC = memberList.stream().filter((name) -> name.getFirstName().startsWith("C"))
				.collect(Collectors.toList());
		log.info("nameStartsWithC: " + nameStartsWithC);

		/*------------------------------------------------------------------------------------------------------------*/

		// Function interface

		Function<User, String> nameUppercase = (name) -> name.getFirstName().toUpperCase();
		log.info("Name in upper case: " + nameUppercase.apply(member5));

		/*-----------------------------------------------------------------------------------------------------------*/

		Admin admin1 = new Admin();
		admin1.setName("Rose");
		// admin1.setDesignation("Admin");
		Admin admin2 = new Admin();
		admin2.setName("Jude");
		admin2.setDesignation("Admin");

		// Consumer interface
		List<Admin> adminList = Arrays.asList(new Admin[] { admin1, admin2 });
		printList(adminList, admin -> log.info(" " + admin.getName()));

		/*-----------------------------------------------------------------------------------------------------*/
		List<String> countryList = Arrays.asList("USA", "Argentina", "Canada", "Spain", "Russia", "Japan");
		List<String> countrySorted = countryList.stream().sorted().collect(Collectors.toList());
		log.info("countrySorted" + countrySorted);
		/*-----------------------------------------------------------------------------------------------------*/

		List<Movie> movieList = new ArrayList<>();
		movieList.addAll(DataCollection.getMovies("Action"));
		// log.info(movieList);
		findMovie(movieList);

		List<Concert> taylorSwift = new ArrayList<>();
		taylorSwift.addAll(DataCollection.getConcerts("Taylor Swift"));

		Optional<List<Concert>> concertExists = Optional.of(taylorSwift);
		if (concertExists.isPresent()) {
			log.info(concertExists.get());
		}

		Optional<String> designationOptional = Optional.ofNullable(admin1.getDesignation());
		log.info(designationOptional.orElse("Default: Admin"));

		Optional<Address> memberAdd = Optional.ofNullable(member1.getAddress());
		try {
			log.info(memberAdd.orElseThrow(() -> new AddressNotFoundException("Address not available")));
		} catch (AddressNotFoundException e) {
			log.error(e.getMessage());
		}

	}

}
