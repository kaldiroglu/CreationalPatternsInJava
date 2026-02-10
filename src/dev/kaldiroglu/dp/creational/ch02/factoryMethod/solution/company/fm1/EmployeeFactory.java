package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.fm1;

public class EmployeeFactory implements Factory {

	@Override
	public Employee create() {
        return new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
	}
}
