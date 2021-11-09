package gangoffour.structural.adapter.objectAdapter;

/**
 * For object adapter, we are only going to implement target interface and accept adaptee as
 * constructor argument in adapter.
 */
public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);

        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    public static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("New York");
    }

}