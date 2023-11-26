package task;

import org.springframework.stereotype.Component;

@Component
public class Eraser  implements Box{

	@Override
	public void color() {
		System.out.println("white");	
		}

}
