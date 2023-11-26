package task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BagMain {

	public static void main(String[] args) {
		ApplicationContext context=new  AnnotationConfigApplicationContext(Config.class);
		Bag bag = context.getBean(Bag.class);
		bag.box.color();
		}

}
