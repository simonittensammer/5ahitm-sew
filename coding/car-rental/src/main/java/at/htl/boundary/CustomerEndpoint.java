package at.htl.boundary;


import at.htl.entity.Customer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Path("customer")
public class CustomerEndpoint {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Customer getCustomer() {
        Customer customer = new Customer("Simon", LocalDate.of(2001, 12, 28));
        return customer;
    }

    @GET
    @Path("getAll")
    @Produces({MediaType.APPLICATION_JSON})
    public Map<String, Customer> getAll() {

        Map<String, Customer> customers = new HashMap();
        customers.put("Simon", new Customer("Simon", LocalDate.of(2001, 12, 28)));
        customers.put("Lornezo", new Customer("Lornezo", LocalDate.of(2001, 07, 01)));

        return customers;
    }
}


