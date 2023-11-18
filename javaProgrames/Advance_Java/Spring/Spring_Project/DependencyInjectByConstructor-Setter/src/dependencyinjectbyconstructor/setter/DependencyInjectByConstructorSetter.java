/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjectbyconstructor.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import teacher.Teacher;

/**
 *
 * @author LENOVO
 */
public class DependencyInjectByConstructorSetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Resource resource=new ClassPathResource("applicationContext.xml");  
          BeanFactory factory=new XmlBeanFactory(resource);
          
          Teacher teacher = (Teacher) factory.getBean("teacher");
          teacher.displayDetails();
    }
    
}
