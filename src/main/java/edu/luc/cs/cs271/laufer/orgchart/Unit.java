package edu.luc.cs.cs271.laufer.orgchart;

import java.util.List;

class Unit implements Node {
	private String name;

	// TODO add instance variable for children
	public Unit(final String name) {
		this.name = name;
	}

	public void setManager(Person p) {
		/* TODO implement this method */
	}

	public Person getManager() {
		/* TODO implement this method */
		return null;
	}

	public List<Node> getChildren() {
		/* TODO implement this method */
		return null;
	}

	public void addChild(Node node) {
		/* TODO implement this method */
	}

	/**
	 * Counts each person in the unit and any subunits.
	 */
	public int size() {
		/* TODO implement this method */
		return 0;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "U(" + getName() + ")";
	}
}