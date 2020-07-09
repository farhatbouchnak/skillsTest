import java.util.ArrayList;
import java.util.List;

public class Partitionner {

	/**
	 * Cette méthode sert à decouper une liste composée de pluseiurs listes selon
	 * une longueur passé en paramétre.
	 * 
	 * @param inputList
	 * @param size
	 * @return List<List<Integer>>
	 */
	public static List<List<Integer>> partitionIntegerListBasedOnSize(List<Integer> inputList, int size) {

		/**
		 * La liste qui contiens toutes les listes.
		 */
		List<List<Integer>> partitions = new ArrayList<>();

		for (int i = 0; i < inputList.size(); i += size) {
			/**
			 * l'astuce qui va nous permettre de decouper la liste en respectant la longueur
			 * passée en paramétre
			 */
			partitions.add(inputList.subList(i, Math.min(i + size, inputList.size())));
		}

		return partitions;
	}
}
