package edu.luc.cs.cs271.laufer.orgchart;

class Person implements Node {
	private String name;

	public Person(final String name) {
		this.name = name;
	}

	public int size() {
		return 1;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "P(" + name + ")";
	}
}
