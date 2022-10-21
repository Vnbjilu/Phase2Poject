package vikas.RatanRaman.Booking;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PaymentDao {
	Configuration cfg;
	SessionFactory factory;
	Session session ;
	Transaction trans;
	
	public PaymentDao()
	{
		cfg=new Configuration().configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		session=factory.openSession();
		trans=session.beginTransaction();
		
	}
	public int insert(Payment pay)
	{
		int id=(Integer)session.save(pay);
		trans.commit();
		return id;
	}
	public Payment getTicket(int id)
	{
		Payment p=(Payment)session.get(Payment.class,id);
		return p;
		
		
	}
}
