package vikas.RatanRaman.Booking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookingDao {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction trans;
public BookingDao()
{
	cfg=new Configuration().configure("hibernate.cfg.xml");
	factory=cfg.buildSessionFactory();
	session=factory.openSession();
	trans=session.beginTransaction();
}
public void insert(BookingDetails details)
{
	session.save(details);
	trans.commit();
}
}
