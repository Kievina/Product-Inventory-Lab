package services;

import models.DogFood;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class DogFoodServiceTest {

    List<DogFood> dogFoodInventory;
    DogFoodService dogFoodService;

    @Before
    public void setUp() {
        this.dogFoodInventory = new ArrayList<>();
        this.dogFoodService = new DogFoodService();
        DogFood df1 = dogFoodService.createDogFood("Lamb & Rice", "Purina", 30f, 25, 49.99f);
        DogFood df2 = dogFoodService.createDogFood("Chicken & Rice", "Blue Buffalo", 25f, 25, 49.99f);
        dogFoodInventory.add(df1);
        dogFoodInventory.add(df2);
    }

    @After
    public void tearDown() {
//        dogFoodInventory.clear();
    }

    @Test
    public void createTest() {

        // Given
        String expectedName = "Lamb";
        String expectedBrand = "Nutrish";
        float expectedWeight = 10.5f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // When
        DogFoodService dogFoodService = new DogFoodService();
        DogFood testDogFood = dogFoodService.createDogFood(expectedName, expectedBrand, expectedWeight, expectedQty, expectedPrice);

        int actualId = testDogFood.getId();
        String actualName = testDogFood.getName();
        String actualBrand = testDogFood.getBrand();
        float actualWeight = testDogFood.getWeight();
        int actualQty = testDogFood.getQty();
        float actualPrice = testDogFood.getPrice();

        // Then
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedWeight, actualWeight, 0.0);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice, 0.00);
    }

    @Test
    public void findDogFoodTest() {
        DogFood expectedDogFood1 = dogFoodInventory.get(0);
        DogFood expectedDogFood2 = dogFoodInventory.get(1);

        DogFood actualDogFood1 = dogFoodService.findDogFood(1);
        DogFood actualDogFood2 = dogFoodService.findDogFood(2);


        Assert.assertEquals(expectedDogFood1, actualDogFood1);
        Assert.assertEquals(expectedDogFood2, actualDogFood2);


    }

    @Test
    public void findAllTest() {
        DogFood[] expected = dogFoodInventory.toArray(new DogFood[0]);
        DogFood[] actual = dogFoodService.findAll();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteTest() {
        boolean deleted = dogFoodService.delete(1);
        Assert.assertTrue(deleted);
    }
}