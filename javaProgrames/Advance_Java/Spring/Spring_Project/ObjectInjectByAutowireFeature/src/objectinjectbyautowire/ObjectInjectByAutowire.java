/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectinjectbyautowire;

import Details.Admin;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author LENOVO
 */
public class ObjectInjectByAutowire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource); 
        
        Admin admin = (Admin) beanFactory.getBean("admin");
        admin.displayInfo();
    }
    
}
