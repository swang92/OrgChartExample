package edu.luc.cs.cs271.laufer.orgchart;

import static junit.framework.Assert.*;

import org.junit.Test;


public class TestOrgChart {

	@Test
	public void testPerson() {
		final Person p = new Person("Laufer");
		assertEquals(1, p.size());
		assertEquals("Laufer", p.getName());
		assertEquals("P(Laufer)", p.toString());
	}

	@Test
	public void testUnit() {
		final Unit u = new Unit("CAS");
		u.setManager(new Person("Fennell"));
		assertEquals("CAS", u.getName());
		assertEquals("U(CAS)", u.toString());
		assertEquals(1, u.size());
		assertEquals("Fennell", u.getManager().getName());
	}

	@Test
	public void testComplex() {
		/*
		 * TODO Use the classes Person and Unit to write Java code
		 * to represent the following organization:
		 * + The college of arts and science (CAS)
		 *   - Dean Fennell
		 *   - Ms. Sporlein (office manager)
		 *   - Assistant Dean Happ
		 *   - CS department (CSD)
		 *     * A. Harrington
		 *     * G. Thiruvathukal
		 *   - Math department (Math)
		 *     * S. Doty
		 */
		final Unit u = new Unit("CAS");
		u.addChild(new Person("Sporlein"));
		// etc.
		assertEquals(6, u.size());
	}
}
