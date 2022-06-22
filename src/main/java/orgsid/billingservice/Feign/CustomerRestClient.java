package orgsid.billingservice.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import orgsid.billingservice.Model.Customer;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping(path = "/customers/{id}")
    Customer getCustomerById(@PathVariable(name = "id") Long id);

    @GetMapping(path = "/customers")
    Customer getCustomer();

    @GetMapping(path = "/customers/del/{id}")
    void deleteCustomerById(@PathVariable Long id);
}
