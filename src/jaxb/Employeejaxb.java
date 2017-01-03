package jaxb;

import javax.xml.bind.*;


import java.io.*;

public class Employeejaxb {
	public void marshal() {
		try {
			Employee emp = new Employee("a1", "Pranita", "Pune", 10000);
			JAXBContext jc = JAXBContext.newInstance(Employee.class);
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(emp, System.out);
			m.marshal(emp, new File("src\\data\\Employee.xml"));

		} catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
	}

	public void unmarshal() {
		try {
			JAXBContext jc = JAXBContext.newInstance(Employee.class);
			Unmarshaller um = jc.createUnmarshaller();
			Employee emp = (Employee) um.unmarshal(new File("src\\data\\Employee.xml"));
			System.out.println("Employee details");
			System.out.println("id:" + emp.getId());
			System.out.println("Name:" + emp.getName());
			System.out.println("Address:" + emp.getAddress());
			System.out.println("Salary:" + emp.getSalary());

		} catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
	}

}
