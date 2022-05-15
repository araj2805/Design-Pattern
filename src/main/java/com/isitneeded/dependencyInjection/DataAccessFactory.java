/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.dependencyInjection;

public class DataAccessFactory {

    public static ICustomerDataAccess getCustomerDataAccessObject() {
        return new CustomerDataAccess();
    }

    public static ICustomerDataAccess getCustomerDataAccessGlobalObject() {
        return new CustomerDataAccessGlobal();
    }
}
