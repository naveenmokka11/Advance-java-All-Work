package task;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen  implements Box{

	@Override
	public void color() {
		System.out.println("blue");
		
	}

}
