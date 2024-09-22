import com.generation.employee.Employee;
import com.generation.salesmanager.SalesManager;
import com.generation.salesrep.SalesRep;

public class Main {
    public static void main(String[] args) {
        // Datos de empleado
        Employee employee = new Employee("Roberto", "Diaz", 1010, 30, 900, 3, 20000, 10);
        System.out.println("Para el empleado: " + employee.getFirstName());
        System.out.println("Años para retirarse: " + employee.timeToRetirement());
        System.out.println("Días de vacaciones restantes: " + employee.vacationTimeLeft());
        System.out.println("Bono: " + employee.calculateBonus());
        System.out.println(employee.toString());

        // Datos de representante de ventas
        System.out.println("----------------------------------");
        SalesRep salesRep = new SalesRep("Jorge", "Pérez", 1020, 30, 500, 5, 40000, 15, 50000);
        System.out.println("Para el representante de ventas: " + salesRep.getFirstName());
        System.out.println("Comisión del representante de ventas: " + salesRep.calculateComission());
        System.out.println(salesRep.toString());

        // Datos del manager de ventas
        System.out.println("----------------------------------");
        SalesManager salesManager = new SalesManager("Mariana", "Paz", 1030, 50, 1200, 15, 60000, 25, 200000);
        salesManager.addSalesRep(1, salesRep); // Agregar al equipo
        System.out.println("Para el Manager de ventas: " + salesManager.getFirstName());
        System.out.println("Comisión del manager de ventas: " + salesManager.calculateComission());
        System.out.println(salesManager.toString());
    }// main
}// class Main
