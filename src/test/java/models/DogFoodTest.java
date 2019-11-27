package models;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogFoodTest {
    private int expectedId;
    private String expectedName;
    private String expectedBrand;
    private float expectedWeight;
    private int expectedQty;
    private float expectedPrice;
    private DogFood testDogFood;

    @BeforeEach
    public void setUp() {
        this.expectedId = 7;
        this.expectedName = "Lamb & Rice";
        this.expectedBrand = "Purina";
        this.expectedWeight = 30f;
        this.expectedQty = 25;
        this.expectedPrice = 49.99f;

        this.testDogFood = new DogFood(expectedId, expectedName, expectedBrand, expectedWeight, expectedQty, expectedPrice);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void dogFoodConstructorTest() {
        // When
        DogFood testDogFood1 = new DogFood(expectedId, expectedName, expectedBrand, expectedWeight, expectedQty, expectedPrice);

        // Then
        Assert.assertEquals(expectedId, testDogFood1.getId());
        Assert.assertEquals(expectedName, testDogFood1.getName());
        Assert.assertEquals(expectedBrand, testDogFood1.getBrand());
        Assert.assertEquals(expectedWeight, testDogFood1.getWeight(), 0.00);
        Assert.assertEquals(expectedQty, testDogFood1.getQty());
        Assert.assertEquals(expectedPrice, testDogFood1.getPrice(), 0.00);
    }

    @Test
    void getId() {
        int actualId = testDogFood.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    void setId() {
        int newIdExpected = 10;
        testDogFood.setId(newIdExpected);
        int actualId = testDogFood.getId();

        Assert.assertEquals(newIdExpected, actualId);
    }

    @Test
    void getName() {
        String actualName = testDogFood.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    void setName() {
        String newNameExpected = "Fish Mix";
        testDogFood.setName(newNameExpected);
        String actualName = testDogFood.getName();

        Assert.assertEquals(newNameExpected, actualName);
    }

    @Test
    void getBrand() {
        String actualBrand = testDogFood.getBrand();

        Assert.assertEquals(expectedBrand, actualBrand);
    }

    @Test
    void setBrand() {
        String newBrandExpected = "Blue Buffalo";
        testDogFood.setBrand(newBrandExpected);
        String actualBrand = testDogFood.getBrand();

        Assert.assertEquals(newBrandExpected, actualBrand);
    }

    @Test
    void getWeight() {
        float actualWeight = testDogFood.getWeight();

        Assert.assertEquals(expectedWeight, actualWeight, 0.00);
    }

    @Test
    void setWeight() {
        float newWeightExpected = 15f;
        testDogFood.setWeight(newWeightExpected);
        float actualWeight = testDogFood.getWeight();

        Assert.assertEquals(newWeightExpected, actualWeight, 0.00);
    }

    @Test
    public void getQtyTest() {
        // When
        int actualQty = testDogFood.getQty();

        Assert.assertEquals(expectedQty, actualQty);
    }

    @Test
    public void setQtyTest() {
        int newQtyExpected = 10;
        testDogFood.setQty(newQtyExpected);
        int actualQty = testDogFood.getQty();

        Assert.assertEquals(newQtyExpected, actualQty);
    }

    @Test
    public void getPriceTest() {
        float actualPrice = testDogFood.getPrice();

        Assert.assertEquals(expectedPrice, actualPrice, 0.00);
    }

    @Test
    public void setPriceTest() {
        float newPriceExpected = 25.99f;
        testDogFood.setPrice(newPriceExpected);
        float actualPrice = testDogFood.getPrice();

        Assert.assertEquals(newPriceExpected, actualPrice, 0.00);
    }
}