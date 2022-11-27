package com.example.esd.DAO.Implement;

import com.example.esd.Bean.Employee;
import com.example.esd.DAO.EmployeeDAO;
import com.example.esd.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public boolean addEmployee(Employee empObj) {
        try(Session session= HibernateSessionUtil.getSession()) {
            Transaction transaction=session.beginTransaction();
            session.persist(empObj);
            transaction.commit();
            return true;
        }
        catch (HibernateException exception){
            System.out.println("Hibernate Exception");
            System.out.println(exception.getLocalizedMessage());
            return false;
        }
    }
}
