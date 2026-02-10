package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.fm2;

public class ManagerFactory implements Factory {

	@Override
	public Manager create(String name) {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
