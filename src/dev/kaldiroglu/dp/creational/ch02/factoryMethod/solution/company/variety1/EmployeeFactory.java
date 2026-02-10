package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.variety1;

public class EmployeeFactory {

	public Employee create() {
        return new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
	}
}
