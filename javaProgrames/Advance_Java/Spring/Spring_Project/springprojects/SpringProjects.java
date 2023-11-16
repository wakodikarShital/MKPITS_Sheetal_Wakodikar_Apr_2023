/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springprojects;

import question.Questions;
import StudentDetails.Student;
import employee.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author LENOVO
 */
public class SpringProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);  
        
        Employee employee = (Employee) beanFactory.getBean("emp");
        employee.display();
        
        Student student = (Student) beanFactory.getBean("student");
        student.displayInfo();

        Questions questions = (Questions) beanFactory.getBean("que");
        questions.showAnswer();
        
        

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
//        Employee employee = (Employee) context.getBean("emp");
//        employee.display();
//        
//        Student student = (Student) context.getBean("student");
//        student.displayInfo();
        
    }
    
}
