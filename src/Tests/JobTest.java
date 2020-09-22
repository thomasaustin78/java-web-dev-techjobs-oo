package Tests;


import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class JobTest {
    @Test
    public void testSettingJobId() {
        Job jobClass1 = new Job();
        Job jobClass2 = new Job();
        assertTrue(jobClass1.getId() != jobClass2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            String jobName = test_job.getName();
            Employer jobEmployer = test_job.getEmployer();
            Location jobLocation = test_job.getLocation();
            PositionType jobPositionType = test_job.getPositionType();
            CoreCompetency jobCoreCompetency = test_job.getCoreCompetency();
                assertEquals("Product tester", jobName );
                assertTrue(jobEmployer instanceof Employer);
                assertTrue(jobLocation instanceof Location);
                assertTrue(jobPositionType instanceof PositionType);
                assertTrue(jobCoreCompetency instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertTrue(test_job1 != test_job2);
    }
}




