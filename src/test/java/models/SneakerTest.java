package models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SneakerTest {
    private int expectedId;
    private String expectedName;
    private String expectedBrand;
    private String expectedSport;
    private float expectedSize;
    private int expectedQty;
    private float expectedPrice;
    private Sneaker testSneaker;

    @Before
    public void setUp() {
        // Given
        this.expectedId = 6;
        this.expectedName = "Stan Smith";
        this.expectedBrand = "Adidas";
        this.expectedSport = "Tennnis";
        this.expectedSize = 8f;
        this.expectedQty = 10;
        this.expectedPrice = 80.00f;

        this.testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void constructorTest() {

        // When
        Sneaker testSneaker1 = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);

        // Then
        Assert.assertEquals(expectedId, testSneaker1.getId());
        Assert.assertEquals(expectedName, testSneaker1.getName());
        Assert.assertEquals(expectedBrand, testSneaker1.getBrand());
        Assert.assertEquals(expectedSport, testSneaker1.getSport());
        Assert.assertEquals(expectedSize, testSneaker1.getSize(), 0.0);
        Assert.assertEquals(expectedQty, testSneaker1.getQty());
        Assert.assertEquals(expectedPrice, testSneaker1.getPrice(), 0.00);
    }

    @Test
    public void getIdTest() {

        // When
        int actualId = testSneaker.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setIdTest() {
        int newIdExpected = 10;
        testSneaker.setId(newIdExpected);
        int actualId = testSneaker.getId();

        Assert.assertEquals(newIdExpected, actualId);
    }

    @Test
    public void getNameTest() {
        // When
        String actualName = testSneaker.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // When
        String newNameExpected = "John Smith";
        testSneaker.setName(newNameExpected);
        String actualName = testSneaker.getName();

        Assert.assertEquals(newNameExpected, actualName);
    }

    @Test
    public void getBrandTest() {
        String actualBrand = testSneaker.getBrand();

        Assert.assertEquals(expectedBrand, actualBrand);
    }

    @Test
    public void setBrandTest() {
        String newBrandExpected = "Nike";
        testSneaker.setBrand(newBrandExpected);
        String actualBrand = testSneaker.getBrand();

        Assert.assertEquals(newBrandExpected, actualBrand);
    }

    @Test
    public void getSportTest() {
        String actualSport = testSneaker.getSport();

        Assert.assertEquals(expectedSport, actualSport);
    }

    @Test
    public void setSportTest() {
        String newSportExpected = "Basketball";
        testSneaker.setSport(newSportExpected);
        String actualSport = testSneaker.getSport();

        Assert.assertEquals(newSportExpected, actualSport);
    }

    @Test
    public void getSizeTest() {
        float actualSize = testSneaker.getSize();

        Assert.assertEquals(expectedSize, actualSize, 0.0);
    }

    @Test
    public void setSizeTest() {
        float newSizeExpected = 6.5f;
        testSneaker.setSize(newSizeExpected);
        float actualSize = testSneaker.getSize();

        Assert.assertEquals(newSizeExpected, actualSize, 0.0);
    }

    @Test
    public void getQtyTest() {
        // When
        int actualQty = testSneaker.getQty();

        Assert.assertEquals(expectedQty, actualQty);
    }

    @Test
    public void setQtyTest() {
        int newQtyExpected = 10;
        testSneaker.setId(newQtyExpected);
        int actualQty = testSneaker.getQty();

        Assert.assertEquals(newQtyExpected, actualQty);
    }

    @Test
    public void getPriceTest() {
        float actualPrice = testSneaker.getPrice();

        Assert.assertEquals(expectedPrice, actualPrice, 0.00);
    }

    @Test
    public void setPriceTest() {
        float newPriceExpected = 100.00f;
        testSneaker.setPrice(newPriceExpected);
        float actualPrice = testSneaker.getPrice();

        Assert.assertEquals(newPriceExpected, actualPrice, 0.00);
    }
}