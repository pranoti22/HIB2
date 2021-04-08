import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory  = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		Transaction txn=session.beginTransaction();
		
		Car c=new Car();
		c.setCompanyName("bajaj");
		c.setCost(4500);
		c.setModel("abc");
		c.setSteeringPower("high");
		
		Scooter sc=new Scooter();
		sc.setCompanyName("bajaj");
		sc.setCost(5500);
		sc.setModel("aty");
	    sc.setMaxSpeed(250);
	    
	    session.save(c);
	    session.save(sc);
	    
	    txn.commit();
	}

}
