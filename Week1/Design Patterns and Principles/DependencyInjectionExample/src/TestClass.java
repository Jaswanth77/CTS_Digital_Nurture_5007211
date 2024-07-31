public class TestClass {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImplement();

        CustomerService customerService = new CustomerService(customerRepository);

        String customerDetails = customerService.getCustomerDetails(1);
        System.out.println(customerDetails);
    }
}
