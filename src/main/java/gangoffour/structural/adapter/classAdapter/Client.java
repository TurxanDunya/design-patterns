package gangoffour.structural.adapter.classAdapter;

/**
 * In the class adapter, implementation we're simply going to forward the method to another method
 * inherited from adaptee.
 */
public class Client {
    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);

        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);

        System.out.println(card);
    }

    // Just filling Employee's states
    public static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Anderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("New York");
    }

}