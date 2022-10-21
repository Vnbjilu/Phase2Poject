package vikas.RatanRaman.Flight;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import vikas.RatanRaman.User.User;

public class FlightDao {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction trans;
	
	public FlightDao()
	{
		cfg=new Configuration().configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		session=factory.openSession();
		trans=session.beginTransaction();
		
	}
	public void Insert(Flights flight)
	{		session.save(flight);
		trans.commit();
		
		
	}
	public Flights getSpecficRecordById(String flightNumber)
	{
		
		Flights flight=(Flights)session.get(Flights.class, flightNumber);
		return flight;
		
	
				
		
	}
	public List<Flights> displayAll()
	{
		List<Flights> flight=session.createQuery("from Flights").list();
		return flight;
	}
	public void update(Flights flight)
	{
	session.update(flight);
	trans.commit();
	}
	public List<String> getFromLocation()
	{
		String q="select distinct e.fromLocation from Flights e";
		Query query=session.createQuery(q);	
		List<String> data=query.list();
		return data;
		
		
	}
	public List<String> gettoLocation()
	{
		String q="select distinct e.toLocation from Flights e";
		Query query=session.createQuery(q);	
		List<String> data=query.list();
		return data;
		
		
	}
	public List<Flights> displayFlights(String from,String to)
	{
		String q="from Flights e where e.fromLocation=:i and e.toLocation=:j";
		Query query=session.createQuery(q);	
		query.setParameter("i", from);
		query.setParameter("j",to);
		List<Flights> flight=query.list();
		return flight;
	}
}
