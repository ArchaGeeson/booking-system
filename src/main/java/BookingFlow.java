
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.Login;
import com.solvd.bookingsystem.bean.Payment;
import com.solvd.bookingsystem.bean.Search;
import com.solvd.bookingsystem.bean.Ticket;
import com.solvd.bookingsystem.bean.profiles.User;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.bean.theatre.Screen;
import com.solvd.bookingsystem.bean.theatre.Show;
import com.solvd.bookingsystem.exceptions.PaymentFailedException;
import com.solvd.bookingsystem.exceptions.SeatsAlreadyOccupiedException;
import com.solvd.bookingsystem.exceptions.ShowNotFoundException;
import com.solvd.bookingsystem.exceptions.ValidationException;
import com.solvd.bookingsystem.functionalInterfaces.IBooking;
import com.solvd.bookingsystem.functionalInterfaces.IPayment;
import com.solvd.bookingsystem.functionalInterfaces.ISignup;
import com.solvd.bookingsystem.services.BookingService;
import com.solvd.bookingsystem.services.LoginService;
import com.solvd.bookingsystem.services.MovieService;
import com.solvd.bookingsystem.services.PaymentService;
import com.solvd.bookingsystem.services.SearchService;
import com.solvd.bookingsystem.services.ShowService;

public class BookingFlow {
	private static Logger log = LogManager.getLogger(BookingFlow.class.getName());

	static BookingFlow bookingflow = new BookingFlow();

	// lambda

	public static Supplier<String> welcomeMessage = () -> {
		return "Welcome to Booking system...";
	};

	public void booking(IBooking ibook) {
		User userId = null;
		Show showId = null;
		ibook.book(userId, showId);
	}

	public void printPayment(IPayment ipay) {
		ipay.payment();
	}

	public void signupWithEmail(ISignup email) {
		email.signup("abc@mail.com");
	}

	public static void main(String[] args) {

		log.info(bookingflow.welcomeMessage.get());

		bookingflow.signupWithEmail((email) -> log.info("email signup" + email));
		bookingflow.booking((userId, showId) -> log.info("Booking by" + userId + "for" + showId));

		// Login data...
		Login login = new Login();
		login.setLoginType("google");
		login.setUsername("Tom");
		login.setPassword("12345");

		// Creating data for movie....
		List<String> cast = new LinkedList<String>();
		cast.add("Timothée Chalamet");
		cast.add("Zendaya");

		Movie movie1 = new Movie();
		movie1.setTitle("Dune");
		movie1.setGenre("Sci-Fi/Action");
		movie1.setId(1001);
		movie1.setReleaseDate(new Date());
		movie1.setDirector("Denis Villeneuve");

		List<String> writers = new LinkedList<String>();
		writers.add("Villeneuve");
		writers.add("Jon Spaihts");
		writers.add("Eric Roth");

		movie1.setCast(cast);
		movie1.setWriters(writers);

		Screen screen = new Screen();
		screen.setId(1);
		screen.setName("Screen No.1");

		List<Show> shows = new LinkedList<Show>();
		screen.setShows(null);

		Show showMovie1 = new Show();
		showMovie1.setEntertainment(movie1);
		showMovie1.setShowPlayedAt(screen);// get screen info
		showMovie1.setShowStartTime(new Date());
		showMovie1.setTicketNumber(new Ticket());
		showMovie1.setShowId(10001);

		shows.add(showMovie1);

		Ticket ticket = new Ticket();
		ticket.setPrice(10);
		ticket.setTicketId(1000002);

		LoginService loginService = new LoginService();

		MovieService movieService = new MovieService();
		movieService.getMovie(movie1);

		Search search = new Search();
		search.setSearchFilterType("Title");

		SearchService searchService = new SearchService();
		searchService.search(search);

		ShowService showService = new ShowService();
		showService.getShow(showMovie1);
		
		BookingService bookingService = new BookingService();

		Payment payment = new Payment();
		payment.setPaymentMethod("cash");
		PaymentService paymentService = new PaymentService();
		

		try {
			loginService.login(login);
			bookingService.bookingShow(showMovie1);
			paymentService.makePayment(payment);
		} catch (ValidationException e) {

			log.error("Invalid login details..");
		} catch (SeatsAlreadyOccupiedException e) {
			// e.printStackTrace();
			log.error("Seats are already occupied...");
		} catch (PaymentFailedException e) {
			log.error(e.getMessage());
		}
		ticket.getAvailableTickets();
		ticket.getPrice();

		// printing payment info
		bookingflow.printPayment(() -> log.info("Payment using Lambda Expression"));
	}

}
