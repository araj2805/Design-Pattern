/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.dependencyInjection;

public class CustomerInjectorService {

    CustomerBusinessLogic customerBusinessLogic;

    public CustomerInjectorService() {
        this.customerBusinessLogic = new CustomerBusinessLogic(new CustomerDataAccess());
    }
}
