package com.example.demo;

///import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

private void logToFile(String message) {
        try (FileWriter writer = new FileWriter("test-results.txt", true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



	@Test
	void testCase1_evenNumberFilter() {

	 System.out.println("Running Test Case 1: Filter Even Numbers");

      DemoApplication call=new DemoApplication();

	  List<Integer> data= new ArrayList<>();
	  data.add(1);
	  data.add(34);
	  data.add(23);
	  data.add(22);
	  data.add(11);
	  data.add(10);
      List<Integer> result = call.GetEvennumers(data);
	  List<Integer> expected = new ArrayList<>();
	  expected.add(34);
	  expected.add(22);
	  expected.add(10);
       try {
            assertEquals(expected, result);
            logToFile("✅ Test Case 1 Passed");
        } catch (AssertionError e) {
            logToFile("❌ Test Case 1 Failed: " + e.getMessage());
            throw e;
        }


	}

}
