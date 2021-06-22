package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasun on 5/24/17.
 */
public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.DarkChocolate)){
            brands.add("Lindt Excellence");
            brands.add("Amul");
            brands.add("Cadbury Bournville");

        }else if(type.equals(LiquorType.MilkChocolate)){
            brands.add("Hershey's");
            brands.add("Cadbury Dairy Milk");
            brands.add("Dove Silky Promises");

        }else if(type.equals(LiquorType.WhiteChocolate)){
            brands.add("Nestle");
            brands.add("Mars");

        }else {
            brands.add("No Brand Available");
        }
    return brands;
    }
}
