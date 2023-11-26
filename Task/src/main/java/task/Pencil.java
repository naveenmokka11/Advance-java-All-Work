package task;

import org.springframework.stereotype.Component;

@Component
public class Pencil  implements Box{

	@Override
	public void color() {
		System.out.println("balck");
		
	}

}
