/**
 * File Name: PetTest.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.jf.pet.vet;

import org.junit.*;

/**
 * PetTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class PetTest {

	@Test
	public void test() {
		// Object[] pets = new Object[] { new Pet[] { new Pet(), new Pet() },
		// new Pet(), new Mammal(), new Pet() };
		// System.out.println("My Pet:" + Arrays.toString((pets)));
		Pet[] pets = new Pet[] { new Pet() };
		for (int i = 0, j = 1; i <= pets.length; i++, j++) {
			System.out.println("My Pet " + (i + 1) + ": " + pets[i]);
			// Post and Pre Increment/ Decrement + Conditional Operator
			// System.out.println("J is " + j);
			// System.out.println("Pre Increment: " + ++j);
			// System.out.println("Post Increment: " + j++);
			// System.out.println("Post Decrement:" + j--);
			// System.out.println("Pre Increment:" + ++j);
			// int myLuckyNumber = (++j > 3) ? 5 : 1;
			// System.out.println(myLuckyNumber);
		}
	}
}
