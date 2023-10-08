package msscbreweryclient.brewery.client;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest{

	@Autowired
	BreweryClient client;

	@Test
	void getBeerById(){
		assertThrows(HttpClientErrorException.NotFound.class, () -> client.getBeerById(UUID.randomUUID()));
	}
}