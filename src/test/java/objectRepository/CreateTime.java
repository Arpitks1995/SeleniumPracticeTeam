package objectRepository;

import java.time.LocalDateTime;

public class CreateTime {
	
	public void generateTimeStamp() {
		LocalDateTime dt=LocalDateTime.now();
		String timeStamp=dt.toString().replace("-", "_").replace(":", "_");
		System.out.println(timeStamp);
			
	}

}
