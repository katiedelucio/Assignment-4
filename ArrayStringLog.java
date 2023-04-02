
public class ArrayStringLog implements StringLogInterface {
	protected int lastIndex = -1;
	protected String name;
	protected String[] log;

//constructors
	/**
	 * @param lastIndex
	 * @param name
	 * @param log
	 */
	public ArrayStringLog(String name, int maxSize) {
//precondition:maxSize>0
		// returns a reference of an empty stringlog object
		// with name and room for max size of array
		this.name = name;
		log = new String[maxSize];
	}

	public ArrayStringLog(String name) {
		// returns reference to empty stringlog object
		// with name and room for 100 strings
		this.name = name;
		log = new String[100];
	}

	@Override
	public void insert(String element) {
		// stringlog is not full
		// places element in stringlog
		lastIndex++;
		log[lastIndex] = element;

	}

	@Override
	public boolean delete(String element) {
		boolean moreToSearch;
		int location = 0;
		boolean found = false;
		moreToSearch = (location <= lastIndex);

		while (moreToSearch && !found) {
			if (element.equalsIgnoreCase(log[location]))
				found = true;
			else {
				location++;
				moreToSearch = (location <= lastIndex);
			}
		}
		if (found == true) {
			log[location] = log[lastIndex];
			log[lastIndex] = null;
			lastIndex--;
		}
		return found;
	}
	// new stuff for assignment #4

	public int deleteAll(String element) { // delete all selected element and count how many
		int count = 0;
		int location = 0;
		while (location <= lastIndex) {
			if (element.equalsIgnoreCase(log[location]))// goes thru locations to search for element
				delete(element);
			location++;

			count++;
		}

		return count;
	}

	public boolean isEmpty() { // true or false if log is empty or not
		if (size() == 0)
			return true;
		else
			return false;

	}

	public int howMany(String element) { // count number of times element is in log
		int location = 0;
		int count = 0;
		while (location <= lastIndex) {

			if (element.equalsIgnoreCase(log[location])) {

				count++;
			}
			location++;
		}

		return count;

	}

	public boolean uniqInsert(String element) { // insert element only if element does not already exist(ignore case)
		if (contains(element) == true)
			return false;
		if (contains(element) == false)
			lastIndex++;
		log[lastIndex] = element;
		return true;

	}

	@Override
	public boolean isFull() {
		if (lastIndex == (log.length - 1))
			return true;
		else
			return false;
	}

	@Override
	public int size() {

		return (lastIndex + 1);
	}

	@Override
	public boolean contains(String element) {
		int location = 0;
		while (location <= lastIndex) {
			if (element.equalsIgnoreCase(log[location]))// goes thru locations to search for element
				return true;
			else
				location++;
		}
		return false;
	}

	@Override
	public void clear() {
		// makes stringlog empty

		for (int i = 0; i <= lastIndex; i++)
			log[i] = null;
		lastIndex = -1;

	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public String toString() {
		String logString = "Log: " + name + "\n\n";
		for (int i = 0; i <= lastIndex; i++)
			logString = logString + (i + 1) + ". " + log[i] + "\n";
		return logString;
	}

}
