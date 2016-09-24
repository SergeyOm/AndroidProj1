package mich.a09_22_testtwofragment.model;

/**
 * Created by michigan on 09/24/2016.
 */
public class ToolsTest {
        public ToolsTest() {}

        private int id;
        private String brand;
        private String model;
        private String imageUrl;
        private String type;
        private double price;
        private int quantity;

        public ToolsTest(int id, String brand, String model, String imageUrl, String type, double price, int quantity) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.imageUrl = imageUrl;
            this.type = type;
            this.price = price;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public ToolsTest setId(int id) {
            this.id = id;
            return this;
        }

        public String getBrand() {
            return brand;
        }

        public ToolsTest setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public String getModel() {
            return model;
        }

        public ToolsTest setModel(String model) {
            this.model = model;
            return this;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public ToolsTest setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public String getType() {
            return type;
        }

        public ToolsTest setType(String type) {
            this.type = type;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public ToolsTest setPrice(double price) {
            this.price = price;
            return this;
        }

        public int getQuantity() {
            return quantity;
        }

        public ToolsTest setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
}
