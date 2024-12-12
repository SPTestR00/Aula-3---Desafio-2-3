package acc.br.bean.life.cycle.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Item implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean  {
    private String name;
    private String beanName;
    private ApplicationContext applicationContext;
    
    private BeanFactory beanFactory;

    public Item(String name) {
    	System.out.println("1. Instantiation: A new Item has been created: " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public void setBeanName(String name) {
        System.out.println("2. BeanNameAware: Setting bean name: " + name);
        this.beanName = name;
    }
    
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("3. BeanFactoryAware: Setting bean factory for " + getName());
    }
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4. ApplicationContextAware: Setting application context.");
        this.applicationContext = applicationContext;
    }
    
    @PostConstruct
    public void init() {
        System.out.println("6. @PostConstruct: " + getName() + " is preparing in the cauldron.");
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. Initialization: " + getName() + " is under testing.");
    }
    
    public void customInitI() {
        System.out.println("8. Custom Initialization: Executing custom init for " + getName());
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("10. @PreDestroy: " + getName() + " is empty and preparing to discard.");
    }
    
    @Override
    public void destroy() throws Exception {
        System.out.println("11. DisposableBean: " + getName() + " is empty and discarding");
        restAndRecover();
    }

    private void restAndRecover() {
        System.out.println("12. DisposableBean: " + getName() + " is discarding and cracking.");
    }
    
    public void customDestroyI() {
        System.out.println("13. Custom Destruction: " + getName() + " is bidding farewell.");

    }

}
