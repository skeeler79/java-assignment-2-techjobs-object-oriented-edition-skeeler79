package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

//    @Before
//    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    @Test
    public void testSettingJobId (){
        Job job1 = new Job ();
        Job job2 = new Job ();
        assertNotEquals (job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields (){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
        assertEquals("Product tester", testJob.getName());
    }

    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1 == testJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob.toString().charAt(0), '\n');
        assertEquals(testJob.toString().lastIndexOf('\n'), testJob.toString().length() -1);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.toString().contains("ID: "));
        assertTrue(testJob.toString().contains("Name: "));
        assertTrue(testJob.toString().contains("Employer: "));
        assertTrue(testJob.toString().contains("Location: "));
        assertTrue(testJob.toString().contains("Position Type: "));
        assertTrue(testJob.toString().contains("Core Competency: "));
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertTrue(testJob.toString().contains("Data not available"));


    }


}
