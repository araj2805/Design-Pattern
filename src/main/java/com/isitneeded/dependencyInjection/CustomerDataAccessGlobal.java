/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.dependencyInjection;

public class CustomerDataAccessGlobal implements ICustomerDataAccess{
    @Override
    public String GetCustomerName(int id) {
        return "Dummy Customer Data from Global Customer Data Access";
    }
}
