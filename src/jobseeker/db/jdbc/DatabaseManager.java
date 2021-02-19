package jobseeker.db.jdbc;

import java.util.ArrayList;
import java.util.List;

import jobseeker.db.Job;
import jobseeker.db.Person;

public class DatabaseManager {
	public static void main(String[] args) {
		// New job
		Job garbageCollector = new Job();
		//New person
		List<Job> jobs = new ArrayList<Job>();
		Person manolo = new Person("Manolo", jobs);
		//Add person to the job
		jobs.add(garbageCollector);
		manolo.setJobs(jobs);
		//Add the person to the job
		System.out.println(manolo);
	}
}
