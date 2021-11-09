package gangoffour.structural.adapter.classAdapter;

/**
 * ADAPTER
 * A class adapter, works as Two-way adapter
 */
public class EmployeeClassAdapter extends Employee implements Customer {

    /*
    If you noticed, our adapter has same features with Employee by extending it.
    In the same time, our adapter implements Customer for providing Employee functionalities for it.
     */

    @Override
    public String getName() {
        // Just provide Employee full name for Customer name
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        // Just provide Employee job title for Customer designation
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        // Just provide Employee office location for Customer address
        return this.getOfficeLocation();
    }

}