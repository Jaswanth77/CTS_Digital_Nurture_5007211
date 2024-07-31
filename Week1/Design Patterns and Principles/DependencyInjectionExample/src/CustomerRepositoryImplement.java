public class CustomerRepositoryImplement implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        return "Customer with ID: " + id;
    }
}
