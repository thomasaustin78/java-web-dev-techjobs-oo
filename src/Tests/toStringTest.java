package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class toStringTest {
    @Test
    public void blankLineAfterJobInformationAndEachFieldHasOwnLine() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\r\n" + "Id: 1" + "\r\n" + "Name: Product tester" + "\r\n" + "Employer: ACME" + "\r\n" + "Location: Desert" + "\r\n" + "Position type: Quality control" + "\r\n" + "Core competency: Persistence" + "\r\n", test_job.toString());
    }

    @Test
    public void dataNotAvailableAfterLabel() {
        Job testJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            assertEquals("\r\n" + "Id: " + testJob.getId() + "\r\n" + "Name: data not available" + "\r\n" + "Employer: data not available" + "\r\n" + "Location: data not available" + "\r\n" + "Position type: data not available" + "\r\n" + "Core competency: data not available" + "\r\n", testJob.toString());
    }
}
