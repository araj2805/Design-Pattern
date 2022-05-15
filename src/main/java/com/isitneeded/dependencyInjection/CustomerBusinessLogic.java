/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.dependencyInjection;

public class CustomerBusinessLogic {

    ICustomerDataAccess customerDataAccess = null;

    /*
    *
    * Factory pattern to inject dependency
    * */

    /*public CustomerBusinessLogic() {
        this.customerDataAccess = DataAccessFactory.getCustomerDataAccessObject();
    }*/

    /*
    *
    * Constructor Dependency Injection
    *
    * */

    public CustomerBusinessLogic(ICustomerDataAccess customerDataAccess) {
        this.customerDataAccess = customerDataAccess;
    }


    public String getCustomerName (int id) {
        return customerDataAccess.GetCustomerName(id);
    }
}
