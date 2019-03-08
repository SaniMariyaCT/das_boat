package com.boat.dasboat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boat.dasboat.controller.ShipwreckController;
import com.boat.dasboat.model.Shipwreck;
import com.boat.dasboat.repository.ShipwreckRepository;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test 
	public void testShipwreckGet(){
		Shipwreck sw = new Shipwreck();
		sw.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(sw);
		
		Shipwreck wreck = sc.get(1l);
		
		verify(shipwreckRepository).findOne(1l);
		
		//assertEquals(1l, wreck.getId().longValue());
		assertThat(wreck.getId(), is(1l));
	}
}
