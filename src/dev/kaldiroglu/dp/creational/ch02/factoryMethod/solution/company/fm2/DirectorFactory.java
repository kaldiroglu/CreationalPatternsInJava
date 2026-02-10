package dev.kaldiroglu.dp.creational.ch02.factoryMethod.solution.company.fm2;

public class DirectorFactory implements Factory {

	@Override
	public Director create(String name) {
		Director director = new Director(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), "Management", "Management", 5000);
		return director;
	}

}
