package ASM1.Interface;

import ASM1.Model.Book.Book;
import ASM1.Model.Customer.Customer;

import java.util.ArrayList;

public interface InterfaceCustomer {

    public void hireBook(String idNameCustomer, int quantity, String idNameBook, ArrayList<Book> bookArrayList, int daysQuantity);

    public  void addCustomer(Customer customers);

    public void showCustomersDisplay();

    public void updateCustomer(Customer customer);

    public Customer findCustomerByIdName(String idName);

}