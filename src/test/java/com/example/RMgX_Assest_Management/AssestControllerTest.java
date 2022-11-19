package com.example.RMgX_Assest_Management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.RMgX_Assest_Management.controller.AssestController;
import com.example.RMgX_Assest_Management.model.Assest;
import com.example.RMgX_Assest_Management.service.AssestService;

public class AssestControllerTest {
	
	 @InjectMocks                        //Injecting Mocks in assetController class
	    AssestController assetController;

	    @Mock                           //Mocking the assetService class
	    AssestService assetService;

	   
	    Assest asset = new Assest();

	    //Setup function to run before each mock test
	    @BeforeEach
	    void setup() throws Exception {
	        MockitoAnnotations.initMocks(this);

	        Assest assest = new Assest();
	        assest.setAssignedEmployeeId(12);
	        assest.setName("John Doe");
	        assest.setPurchaseDate(new Date("31/12/1998"));
	        assest.setConditionNotes("Used but in good condition");
	        assest.setCategory("Laptop");
	        assest.setAssignmentStatus("assigned");
	    }

	    //Test function to test getAsset

	    @Test
	    final void testGetAsset() {
	        when(assetService.getAssestById(anyInt())).thenReturn(asset);

	        Assest assetNew = assetController.getAsset(12);

	      //  assertNotNull(assetNew);
	        assertEquals(asset.getAssignedEmployeeId(), assetNew.getAssignedEmployeeId());
	        assertEquals(asset.getName(), assetNew.getName());
	        assertEquals(asset.getAssignmentStatus(), assetNew.getAssignmentStatus());
	        assertEquals(asset.getPurchaseDate(), assetNew.getPurchaseDate());
	       assertEquals(asset.getConditionNotes(), assetNew.getConditionNotes());
	       assertEquals(asset.getCategory(), assetNew.getConditionNotes());
	    }

}
