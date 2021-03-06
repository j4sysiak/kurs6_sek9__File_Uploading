package pl.carWasher.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJobs {

	//@Scheduled(cron="0 21 22 * * ?")
	@Scheduled(fixedRate = 1000, initialDelay = 4000)
	public void scheduledJob() {
		System.out.println("Job running at: "+new Date());
	}
}
