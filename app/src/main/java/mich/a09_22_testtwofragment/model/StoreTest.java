package mich.a09_22_testtwofragment.model;

/**
 * Created by michigan on 09/24/2016.
 */
public class StoreTest {
    public StoreTest(){}

    private int id;
    private String name;
    private String address;
    private String phone;

    public StoreTest(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public StoreTest setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StoreTest setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public StoreTest setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public StoreTest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
