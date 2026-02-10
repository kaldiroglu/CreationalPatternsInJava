package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.fm1;

public class ManagerFactory implements Factory {

	@Override
	public Manager create() {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
