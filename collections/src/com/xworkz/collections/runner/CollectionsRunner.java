package com.xworkz.collections.runner;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionsRunner {

	public static void main(String[] args) {
//		Collection<String> collectionOfStateNames = new ArrayList<String>();
//		collectionOfStateNames.add("Karnataka");
//		collectionOfStateNames.add("Maharashtra");
//		collectionOfStateNames.add("Tamil Nadu");
//		collectionOfStateNames.add("Kerala");
//		collectionOfStateNames.add("Andhra Pradesh");
//		collectionOfStateNames.add("Telangana");
//		collectionOfStateNames.add("Gujarat");
//		collectionOfStateNames.add("Rajasthan");
//		collectionOfStateNames.add("Uttar Pradesh");
//		collectionOfStateNames.add("Madhya Pradesh");
//		collectionOfStateNames.add("West Bengal");
//		collectionOfStateNames.add("Punjab");
//		collectionOfStateNames.add("Bihar");
//		collectionOfStateNames.add("Odisha");
//		collectionOfStateNames.add("Assam");
//		System.out.println("state names:"+collectionOfStateNames);
//		Collection<Integer> collectionOfNumbers = new ArrayList<Integer>();
//		collectionOfNumbers.add(5);
//		collectionOfNumbers.add(12);
//		collectionOfNumbers.add(23);
//		collectionOfNumbers.add(34);
//		collectionOfNumbers.add(45);
//		collectionOfNumbers.add(56);
//		collectionOfNumbers.add(67);
//		collectionOfNumbers.add(78);
//		collectionOfNumbers.add(89);
//		collectionOfNumbers.add(90);
//		collectionOfNumbers.add(101);
//		collectionOfNumbers.add(112);
//		collectionOfNumbers.add(123);
//		collectionOfNumbers.add(134);
//		collectionOfNumbers.add(145);
//		System.out.println("numbers:"+collectionOfNumbers);
//		Collection<Float> collectionOfFloatNumbers = new ArrayList<Float>();
//
//		collectionOfFloatNumbers.add(5.1f);
//		collectionOfFloatNumbers.add(12.2f);
//		collectionOfFloatNumbers.add(23.3f);
//		collectionOfFloatNumbers.add(34.4f);
//		collectionOfFloatNumbers.add(45.5f);
//		collectionOfFloatNumbers.add(56.6f);
//		collectionOfFloatNumbers.add(67.7f);
//		collectionOfFloatNumbers.add(78.8f);
//		collectionOfFloatNumbers.add(89.9f);
//		collectionOfFloatNumbers.add(90.0f);
//		collectionOfFloatNumbers.add(101.1f);
//		collectionOfFloatNumbers.add(112.2f);
//		collectionOfFloatNumbers.add(123.3f);
//		collectionOfFloatNumbers.add(134.4f);
//		collectionOfFloatNumbers.add(145.5f);
//		System.out.println("float number:"+collectionOfFloatNumbers);
//		Collection<Long> collectionOfLongNumbers = new ArrayList<>();
//
//		collectionOfLongNumbers.add(123456789012345L);
//		collectionOfLongNumbers.add(234567890123456L);
//		collectionOfLongNumbers.add(345678901234567L);
//		collectionOfLongNumbers.add(456789012345678L);
//		collectionOfLongNumbers.add(567890123456789L);
//		collectionOfLongNumbers.add(678901234567890L);
//		collectionOfLongNumbers.add(789012345678901L);
//		collectionOfLongNumbers.add(890123456789012L);
//		collectionOfLongNumbers.add(901234567890123L);
//		collectionOfLongNumbers.add(112345678901234L);
//		collectionOfLongNumbers.add(223456789012345L);
//		collectionOfLongNumbers.add(334567890123456L);
//		collectionOfLongNumbers.add(445678901234567L);
//		collectionOfLongNumbers.add(556789012345678L);
//		collectionOfLongNumbers.add(667890123456789L);
//		System.out.println("long numbers:"+collectionOfLongNumbers);
//		Collection<Double> collectionOfRates = new ArrayList<>();
//
//		collectionOfRates.add(110.05);
//		collectionOfRates.add(4340.03);
//		collectionOfRates.add(430.07);
//		collectionOfRates.add(66770.02);
//		collectionOfRates.add(0.0876984);
//		collectionOfRates.add(0.0796);
//		collectionOfRates.add(8780.08);
//		collectionOfRates.add(0.09);
//		collectionOfRates.add(08989.08098);
//		collectionOfRates.add(0.1);
//
//		System.out.println(collectionOfRates);
//		Collection<Character> collectionOfChars = new ArrayList<>();
//
//		collectionOfChars.add('A');
//		collectionOfChars.add('B');
//		collectionOfChars.add('C');
//		collectionOfChars.add('D');
//		collectionOfChars.add('E');
//		collectionOfChars.add('F');
//		collectionOfChars.add('G');
//		collectionOfChars.add('H');
//		collectionOfChars.add('I');
//		collectionOfChars.add('J');
//
//		System.out.println(collectionOfChars);
//		List<String> actors=new ArrayList();
//		actors.add("NTR");
//		actors.add("Allu Arjun");
//		actors.add("Mahesh babu");
//		List<String>  movieListOfNTR =new ArrayList<String>();
//		movieListOfNTR.add("RRR");
//		movieListOfNTR.add("Devera");
//		movieListOfNTR.add("yamadhonga");
//		List<String>  movieListOfAlluArjun =new ArrayList<String>();
//		movieListOfAlluArjun.add("Pushpa");
//		movieListOfAlluArjun.add("Arya");
//		movieListOfAlluArjun.add("RaceGuram");
//		List<String>  movieListOfMaheshBabu =new ArrayList<String>();
//		movieListOfMaheshBabu.add("Pokiri");
//		movieListOfMaheshBabu.add("Dukudu");
//		movieListOfMaheshBabu.add("Maharshi");
//		actors.forEach(s->System.out.println(s));
//		movieListOfNTR.forEach(s->System.out.println(s));
//		movieListOfAlluArjun.forEach(s->System.out.println(s));
//		movieListOfMaheshBabu.forEach(s->System.out.println(s));
		List<String> streams = new ArrayList<String>();
		streams.add("cs");
		streams.add("IS");
		streams.add("ECE");
		streams.add("CIVIL");
		streams.add("ME");
		streams.add("EEE");
		streams.forEach(s -> System.out.println(s));
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Tesla");
		cars.add("TATA");
		cars.add("Ford");
		cars.add("suziki");
		cars.forEach(s -> System.out.println(s));
		streams.addAll(cars);
		System.out.println(streams);
		System.out.println(streams.contains("EEE"));
		System.out.println(streams.containsAll(cars));
		System.out.println(streams.indexOf("Ford"));
		streams.remove("Ford");
		System.out.println(streams);
		streams.removeAll(cars);
		System.out.println(streams);
		streams.set(0, "AIDS");
		System.out.println(streams);
		System.out.println(streams.size());
		streams.retainAll(cars);
		System.out.println(streams);
		ArrayList<String> stream = new ArrayList<String>();
		stream.add("cs");
		stream.add("IS");
		stream.add("ECE");
		stream.add("CIVIL");
		stream.add("ME");
		stream.add("EEE");
		System.out.println("streams of BE:" + stream);
		// stream.clone();
		System.out.println(stream);

		System.out.println(stream.get(3));

		LinkedList<String> subjects = new LinkedList<>();

		subjects.add("Mathematics");
		subjects.add("Physics");
		subjects.add("Chemistry");
		subjects.add("Biology");
		System.out.println("Initial subject list:" + subjects);

		subjects.add(0, "Computer Science");
		System.out.println("After adding 'Computer Science' at index 0:" + subjects);

		subjects.add("English");
		System.out.println("After adding English: " + subjects);

		System.out.println("First subject peek: " + subjects.peek());
		System.out.println("Last subject peek: " + subjects.peekLast());

		String firstSubject = subjects.poll();
		System.out.println("Polled first subject: " + firstSubject);
		System.out.println("Subjects after polling:" + subjects);

		System.out.println("Subject at index 2: " + subjects.get(2));

		System.out.println("Contains Mathematics:" + subjects.contains("Mathematics"));

		subjects.remove("Biology");
		System.out.println("After removing Biology: " + subjects);

		subjects.remove(1);
		System.out.println("After removing subject at index 1:" + subjects);

		List<String> newSubjects = new LinkedList<>();
		newSubjects.add("History");
		newSubjects.add("Geography");

		subjects.addAll(newSubjects);
		System.out.println("After adding new subjects:" + subjects);

		System.out.println("Index of English: " + subjects.indexOf("English"));

		subjects.set(0, "Computer Science data scince");
		System.out.println("After replacing first subject: " + subjects);

		subjects.retainAll(newSubjects);
		System.out.println("After retaining new subjects: " + subjects);

		System.out.println("Number of subjects: " + subjects.size());

		subjects.addFirst("Philosophy");
		subjects.addLast("Political Science");
		System.out.println("After adding first and last subjects: " + subjects);

		String removedFirst = subjects.removeFirst();
		String removedLast = subjects.removeLast();
		System.out.println("Removed first subject: " + removedFirst);
		System.out.println("Removed last subject: " + removedLast);
		System.out.println("Subjects after removals: " + subjects);
	}

}
