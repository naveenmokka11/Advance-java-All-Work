package task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bag {
	@Autowired
	@Qualifier("pen")
	Box box;

}
