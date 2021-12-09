
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.bookingsystem.bean.Booking;
import com.solvd.bookingsystem.bean.profiles.Member;
import com.solvd.bookingsystem.bean.profiles.User;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.bean.theatre.Screen;
import com.solvd.bookingsystem.bean.theatre.Seat;
import com.solvd.bookingsystem.bean.theatre.Show;
import com.solvd.bookingsystem.bean.theatre.Theatre;


public class MyCollectionDemo {

	private static Logger log = LogManager.getLogger(MyCollectionDemo.class.getName());

	public static void main(String[] args) {

		// creating member list
		Member member1 = new Member();
		Member member2 = new Member();
		member1.setFirstName("Tom");
		member1.setLastName("George");
		member1.setId(100);

		member2.setFirstName("Pearly");
		member2.setLastName("Thomas");
		member2.setId(100);

		List<User> memberList = new LinkedList<User>();
		memberList.add(member1);
		memberList.add(member2);

		// Creating data for movie...
		List<String> cast = new LinkedList<String>();
		cast.add("Timothée Chalamet");
		cast.add("Zendaya");

		Movie movie1 = new Movie();
		movie1.setTitle("Dune");
		movie1.setGenre("Sci-Fi/Action");
		movie1.setId(1001);
		movie1.setReleaseDate(new Date());
		movie1.setDirector("Denis Villeneuve");

		List<String> writers = new ArrayList<String>();
		writers.add("Villeneuve");
		writers.add("Jon Spaihts");
		writers.add("Eric Roth");

		movie1.setCast(cast);
		movie1.setWriters(writers);

		log.info("Movie No.1: " + movie1);

		// -------------------------------------------------------------------------------------//
		Movie movie2 = new Movie("Ironman", "Action");
		Movie movie3 = new Movie("Spiderman", "Action/Fantasy");
		Movie movie4 = new Movie("Harry Potter and the Sorcerer's Stone", "Fantasy");
		Movie movie5 = new Movie("Spiderman", "Action/Fantasy");

		List<Movie> movies = new LinkedList<Movie>();
		movies.add(movie1);

		//---------------------------------------------------------------//
		List<Screen> screenList = new ArrayList<Screen>();
		List<Show> showList = new LinkedList<Show>();

		Screen screen1 = new Screen("Screen 1 ", 1, showList);
		Screen screen2 = new Screen("Screen 2 ", 2, showList);

		Show movie1show = new Show();
		Show movie2show = new Show();
		Show movie3show = new Show();
		Show movie4show = new Show();

		showList.add(movie1show);
		showList.add(movie2show);
		showList.add(movie3show);
		showList.add(movie4show);

		screenList.add(screen1);
		screenList.add(screen2);

		// ----------------------------------//

		Map<Integer, String> theaterMap = new HashMap<Integer, String>();
		Theatre theatre = new Theatre();
		theatre.setId(1001);
		theatre.setName("AMC");
		
		theaterMap.put(theatre.getId(), theatre.getName());
		//TheaterService theaterService = new TheaterService();
		//theaterService.createTheater(theater);

		// ----------------------------------------------//

		Map<String, Seat> seatMap =new HashMap<String, Seat>();
		Seat seat = new Seat();
		seat.setSeatNumber("A1");
		seat.setSeatType("Mezzanine");
		seatMap.put(seat.getSeatNumber(), seat);
		
		//------------------------------------------------
		Set<Integer> bookingID = new HashSet<Integer>();
		Booking booking = new Booking();
		booking.setBookingId(40001);
		booking.setBookingId(40002);
		bookingID.add(booking.getBookingId());
		

	}

}
