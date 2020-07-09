import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Classe de test pour tester la méthode de partitionnement.
 * 
 * @author Farhat Bouchnak 09/07/2020
 */
public class PartitionnetTest extends TestCase {

	/**
	 * Partitionner une list de lists avec size = 2
	 * 
	 * @author Farhat Bouchnak
	 */
	@Test
	public void testDivisionPar2() {
		List<Integer> test = Arrays.asList(new Integer[] { 1, 8, 2, 6, 7, 12, 54, 954, 4, 67, 75, 64 });
		List<List<Integer>> partitions = Partitionner.partitionIntegerListBasedOnSize(test, 2);
		assertTrue(partitions.get(0).size() <= 2);
	}

	/**
	 * Partitionner une list de lists avec size = 3
	 * 
	 * @author Farhat Bouchnak
	 */
	@Test
	public void testDivisionPar3() {
		List<Integer> test = Arrays.asList(new Integer[] { 1, 8, 2, 6, 7, 12, 54, 954, 4, 67, 75, 64 });
		List<List<Integer>> partitions = Partitionner.partitionIntegerListBasedOnSize(test, 3);
		assertTrue(partitions.get(0).size() <= 3);
	}

	/**
	 * Partitionner une list de lists avec size = 4
	 * 
	 * @author Farhat Bouchnak
	 */
	@Test
	public void testDivisionPar4() {
		List<Integer> test = Arrays.asList(new Integer[] { 1, 8, 2, 6, 7, 12, 54, 954, 4, 67, 75, 64 });
		List<List<Integer>> partitions = Partitionner.partitionIntegerListBasedOnSize(test, 4);
		assertTrue(partitions.get(1).size() <= 4);
	}

	/**
	 * Partitionner une list de lists avec size = 5
	 * 
	 * @author Farhat Bouchnak
	 */
	@Test
	public void testDivisionPar5() {
		List<Integer> test = Arrays.asList(new Integer[] { 1, 8, 2, 6, 7, 12, 54, 954, 4, 67, 75, 64 });
		List<List<Integer>> partitions = Partitionner.partitionIntegerListBasedOnSize(test, 5);
		assertTrue(partitions.get(2).size() <= 5);
	}
}
