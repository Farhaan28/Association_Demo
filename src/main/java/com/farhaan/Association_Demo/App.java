package com.farhaan.Association_Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.farhaan.Association_Demo.entity.manytomany.Course;
import com.farhaan.Association_Demo.entity.manytomany.StudentMM;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("stud_pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Course c1 = new Course(501,"JAVA",576);
//        Course c2 = new Course(502,"DS",478);
//       Course c3 = new Course(503,"C++",352);
//        Course c4 = new Course(504,"C",321);
//        StudentMM s1 = new StudentMM(101,"Ajay");
//        StudentMM s2 = new StudentMM(102,"Rahul");
//        s1.addCourse(c1);s1.addCourse(c2);s1.addCourse(c3);
//        s2.addCourse(c4);s2.addCourse(c2);s2.addCourse(c3);
//        c1.addStudent(s1);c1.addStudent(s2);
//        c2.addStudent(s1);
//        c3.addStudent(s2);
//        c4.addStudent(s1);c4.addStudent(s2);
//        
//        em.persist(s1);
//        em.persist(s2);
//        em.persist(c1);
//        em.persist(c2);em.persist(c3);em.persist(c4);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
