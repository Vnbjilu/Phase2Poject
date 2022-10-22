package vikas.RatanRaman.User;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class UserDao {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction trans;
	
	public UserDao()
	{
		cfg=new Configuration().configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		session=factory.openSession();
		trans=session.beginTransaction();
		
		
	}
public int Insert(User e)
{
	int id=(int)session.save(e);
	trans.commit();
	return id;
}
public List<User> display()
{
	
	List<User> user=session.createQuery("from User").list();
	
	return user;
}
public User getSpecficRecordById(int id)
{
	User user=(User)session.get(User.class, id);
	return user;
		
	
}
public String getUpate(User e)
{
	session.update(e);
	trans.commit();
	return "User id => "+e.getUserId()+" is updated Succesfully";
	
}
public List<User> login(String userName,String userPassword)
{
	String d="from User e where e.userName=:i and e.userPassword=:j";
	Query query=session.createQuery(d);
	query.setParameter("i", userName);
	query.setParameter("j", userPassword);
	List<User> user=query.list();
	return user;
	
}
}
