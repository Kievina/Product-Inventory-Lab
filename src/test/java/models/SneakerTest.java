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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void constructorTest() {

        // When
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);

        // Then
        Assert.assertEquals(expectedId, testSneaker.getId());
        Assert.assertEquals(expectedName, testSneaker.getName());
        Assert.assertEquals(expectedBrand, testSneaker.getBrand());
        Assert.assertEquals(expectedSport, testSneaker.getSport());
        Assert.assertEquals(expectedSize, testSneaker.getSize(), 0.0);
        Assert.assertEquals(expectedQty, testSneaker.getQty());
        Assert.assertEquals(expectedPrice, testSneaker.getPrice(), 0.00);
    }

    @Test
    public void getIdTest() {

        // When
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        int actualId = testSneaker.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setIdTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        int newIdExpected = 10;
        testSneaker.setId(newIdExpected);
        int actualId = testSneaker.getId();

        Assert.assertEquals(newIdExpected, actualId);
    }

    @Test
    public void getNameTest() {
        // When
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        String actualName = testSneaker.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // When
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        String newNameExpected = "John Smith";
        testSneaker.setName(newNameExpected);
        String actualName = testSneaker.getName();

        Assert.assertEquals(newNameExpected, actualName);
    }

    @Test
    public void getBrandTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        String actualBrand = testSneaker.getBrand();

        Assert.assertEquals(expectedBrand, actualBrand);
    }

    @Test
    public void setBrandTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        String newBrandExpected = "Nike";
        testSneaker.setBrand(newBrandExpected);
        String actualBrand = testSneaker.getBrand();

        Assert.assertEquals(newBrandExpected, actualBrand);
    }

    @Test
    public void getSportTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        String actualSport = testSneaker.getSport();

        Assert.assertEquals(expectedSport, actualSport);
    }

    @Test
    public void setSportTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        String newSportExpected = "Basketball";
        testSneaker.setSport(newSportExpected);
        String actualSport = testSneaker.getSport();

        Assert.assertEquals(newSportExpected, actualSport);
    }

    @Test
    public void getSizeTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        float actualSize = testSneaker.getSize();

        Assert.assertEquals(expectedSize, actualSize, 0.0);
    }

    @Test
    public void setSizeTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        float newSizeExpected = 6.5f;
        testSneaker.setSize(newSizeExpected);
        float actualSize = testSneaker.getSize();

        Assert.assertEquals(newSizeExpected, actualSize, 0.0);
    }

    @Test
    public void getQtyTest() {
        // When
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        int actualQty = testSneaker.getQty();

        Assert.assertEquals(expectedQty, actualQty);
    }

    @Test
    public void setQtyTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        int newQtyExpected = 10;
        testSneaker.setId(newQtyExpected);
        int actualQty = testSneaker.getQty();

        Assert.assertEquals(newQtyExpected, actualQty);
    }

    @Test
    public void getPriceTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        float actualPrice = testSneaker.getPrice();

        Assert.assertEquals(expectedPrice, actualPrice, 0.00);
    }

    @Test
    public void setPriceTest() {
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        float newPriceExpected = 100.00f;
        testSneaker.setPrice(newPriceExpected);
        float actualPrice = testSneaker.getPrice();

        Assert.assertEquals(newPriceExpected, actualPrice, 0.00);
    }
}