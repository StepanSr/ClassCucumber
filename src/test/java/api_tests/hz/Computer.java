package api_tests.hz;

import lombok.Data;

@Data
public class Computer {
    String model;
    int year;

    public static void main(String[] args) {
        Computer c = new Computer();
        c.setModel("mac");
        c.setYear(1982);


    }
}
