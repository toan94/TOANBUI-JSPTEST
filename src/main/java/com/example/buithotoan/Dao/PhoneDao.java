package com.example.buithotoan.Dao;

import com.example.buithotoan.models.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class PhoneDao {
    public Session getSession(){
        Session session = null;
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            session = sessionFactory.openSession();
        }catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
        }

        return session;
    }

    public List<Phone> getAllPhones(){
        Session session = getSession();

        String hql = "FROM Phone";
        Query query = session.createQuery(hql);
        List<Phone> results = query.list();


        session.close();
        return results;
    }

    public void createPhone(Phone p){
        Session session = getSession();
        session.beginTransaction();

        session.save(p);

        session.getTransaction().commit();
        session.close();
    }
}
