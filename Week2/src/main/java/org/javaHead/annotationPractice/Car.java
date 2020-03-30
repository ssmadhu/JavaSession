package org.javaHead.annotationPractice;

public class Car {
        @JsonField("manufactuer")
        String make;
        @JsonField
        String model;
        @JsonField("yearOfManufurer")
        String year;



        String enginePower;

    public Car(String make, String model, String year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
