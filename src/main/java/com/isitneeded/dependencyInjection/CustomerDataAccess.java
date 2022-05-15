/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.dependencyInjection;

public class CustomerDataAccess implements ICustomerDataAccess{
    @Override
    public String GetCustomerName(int id) {
        return "Dummy Customer details from Customer Data Access ";
    }
}
