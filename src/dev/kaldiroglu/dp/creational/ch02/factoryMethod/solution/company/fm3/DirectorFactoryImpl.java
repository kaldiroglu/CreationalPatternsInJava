package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.fm3;

public class DirectorFactoryImpl implements DirectorFactory{

	@Override
	public Director create(String name, String workingDepartment, int bonus) {
		Director director = new Director(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment, bonus);
		return director;
	}
}
