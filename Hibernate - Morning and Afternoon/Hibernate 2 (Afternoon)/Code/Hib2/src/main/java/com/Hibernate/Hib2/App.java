package com.Hibernate.Hib2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Product ptemp=new Product();
    	ptemp.setPid(1);
    	ptemp.setPname("Product 1");
    	Product ptemp2=new Product();
    	ptemp2.setPid(2);
    	ptemp2.setPname("Product 2");
    	Product ptemp3=new Product();
    	ptemp3.setPid(3);
    	ptemp3.setPname("Product 3");
    	Product ptemp4=new Product();
    	ptemp4.setPid(4);
    	ptemp4.setPname("Product 4");
    	
    	
    	Categories ctemp=new Categories();
    	ctemp.setCid(1);
    	ctemp.setCname("Customer 1");
    	Categories ctemp2=new Categories();
    	ctemp2.setCid(2);
    	ctemp2.setCname("Customer 2");
    	Categories ctemp3=new Categories();
    	ctemp3.setCid(3);
    	ctemp3.setCname("Customer 3");
    	Categories ctemp4=new Categories();
    	ctemp4.setCid(4);
    	ctemp4.setCname("Customer 4");
    	
    	Supplier stemp= new Supplier();
    	stemp.setSid(1);
    	stemp.setSname("Supplier 1");
    	Supplier stemp2= new Supplier();
    	stemp2.setSid(2);
    	stemp2.setSname("Supplier 2");
    	Supplier stemp3= new Supplier();
    	stemp3.setSid(3);
    	stemp3.setSname("Supplier 3");
    	Supplier stemp4= new Supplier();
    	stemp4.setSid(4);
    	stemp4.setSname("Supplier 4");
    	
    	ptemp.getSups().add(stemp);
    	ptemp.getCats().add(ctemp);
    	ptemp2.getSups().add(stemp2);
    	ptemp2.getCats().add(ctemp2);
    	ptemp3.getSups().add(stemp3);
    	ptemp3.getCats().add(ctemp4);
    	ptemp4.getSups().add(stemp4);
    	ptemp4.getCats().add(ctemp4);
    	
    	
    	ctemp.getSups().add(stemp);
    	ctemp2.getSups().add(stemp2);
    	ctemp3.getSups().add(stemp3);
    	ctemp4.getSups().add(stemp4);
    	ctemp.setpObj(ptemp);
    	ctemp2.setpObj(ptemp2);
    	ctemp3.setpObj(ptemp3);
    	ctemp4.setpObj(ptemp4);
    	
    	stemp.getCats().add(ctemp);
    	stemp.getProds().add(ptemp);
    	stemp2.getCats().add(ctemp2);
    	stemp2.getProds().add(ptemp2);
    	stemp3.getCats().add(ctemp3);
    	stemp3.getProds().add(ptemp3);
    	stemp4.getCats().add(ctemp4);
    	stemp4.getProds().add(ptemp4);
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Categories.class).addAnnotatedClass(Supplier.class);
    	ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    	SessionFactory sf=config.buildSessionFactory(registry);
    	Session session=sf.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(ptemp);
    	session.save(stemp);
    	session.save(ctemp);
    	
    	session.save(ptemp2);
    	session.save(stemp2);
    	session.save(ctemp2);
    	
    	session.save(ptemp3);
    	session.save(stemp3);
    	session.save(ctemp3);
    	
    	session.save(ptemp4);
    	session.save(stemp4);
    	session.save(ctemp4);
    	
    	session.getTransaction().commit();
    }
}
