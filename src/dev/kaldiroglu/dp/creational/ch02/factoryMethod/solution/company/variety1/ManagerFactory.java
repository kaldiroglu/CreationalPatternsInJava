package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.variety1;

public class ManagerFactory extends EmployeeFactory  {

	@Override
	public Manager create() {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
