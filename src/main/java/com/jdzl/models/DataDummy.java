package com.jdzl.models;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DataDummy {

    public static List<Product>  getListProducts() {
        return Arrays.asList(
                new Product(UUID.randomUUID(), "1234", "8733400912", "12/11/2018", 8600000),
                new Product(UUID.randomUUID(), "2234", "8733400910", "12/05/2018", 600000),
                new Product(UUID.randomUUID(), "3234", "8733400911", "12/04/2018", 9600000),
                new Product(UUID.randomUUID(), "4234", "8733400913", "11/05/2018", 5600000),
                new Product(UUID.randomUUID(), "5234", "8733400915", "08/03/2018", 99600000)
        );
    }

}
