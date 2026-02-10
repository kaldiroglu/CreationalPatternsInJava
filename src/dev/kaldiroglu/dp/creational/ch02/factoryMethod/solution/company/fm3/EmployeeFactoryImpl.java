package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.fm3;

public class EmployeeFactoryImpl implements EmployeeFactory{

	@Override
	public Employee create(String name) {
		Employee employee = new Employee(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
