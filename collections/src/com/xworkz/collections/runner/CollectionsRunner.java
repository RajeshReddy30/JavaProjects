package com.xworkz.collections.runner;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionsRunner {

	public static void main(String[] args) {

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

		System.out.println(stream.get(3));

		LinkedList<String> bikes = new LinkedList<String>();

		bikes.add("Yamaha");
		bikes.add("Honda");
		bikes.add("Suzuki");
		bikes.add("Kawasaki");
		bikes.add("Ducati");
		bikes.add("Royal Enfield");
		bikes.add("TVS");
		System.out.println("Bike Brands :" + bikes);

		bikes.add(3, "Harley Davidson");
		System.out.println("After add by index 3 :" + bikes);

		LinkedList<String> newBikes = new LinkedList<String>();

		newBikes.add("BMW");
		newBikes.add("KTM");
		newBikes.add("Benelli");

		bikes.addAll(newBikes);
		System.out.println("After add all :" + bikes);

		bikes.addFirst("Bajaj");
		System.out.println("After add First :" + bikes);

		bikes.addLast("Aprilia");
		System.out.println("After add Last :" + bikes);

		boolean isContainSuzuki = bikes.contains("Suzuki");
		System.out.println("isContain Suzuki :" + isContainSuzuki);

		boolean isContainAll = bikes.containsAll(newBikes);
		System.out.println("isContain All new Bikes :" + isContainAll);

		System.out.println("Element :" + bikes.element());

		boolean isEqual = bikes.equals(newBikes);
		System.out.println("Bikes is equals to newBikes :" + isEqual);

		System.out.println("get index 4 :" + bikes.get(4));

		System.out.println("get Class :" + bikes.getClass());

		System.out.println("get First :" + bikes.getFirst());

		System.out.println("get Last :" + bikes.getLast());

		System.out.println("index of Honda :" + bikes.indexOf("Honda"));

		System.out.println("is Empty :" + bikes.isEmpty());

		System.out.println("last index of Ducati :" + bikes.lastIndexOf("Ducati"));

		bikes.offer("MV Agusta");
		System.out.println("After Offer :" + bikes);

		bikes.offerFirst("Triumph");
		System.out.println("After Offer First :" + bikes);

		bikes.offerLast("Indian");
		System.out.println("After Offer Last :" + bikes);

		System.out.println("peek :" + bikes.peek());

		System.out.println("peek First :" + bikes.peekFirst());

		System.out.println("peek Last :" + bikes.peekLast());

		bikes.poll();
		System.out.println("after poll :" + bikes);

		bikes.pollFirst();
		System.out.println("after poll First :" + bikes);

		bikes.pollLast();
		System.out.println("after poll Last :" + bikes);

		bikes.pop();
		System.out.println("after pop :" + bikes);

		bikes.push("Hero");
		System.out.println("after push :" + bikes);

		bikes.remove();
		System.out.println("after remove :" + bikes);

		bikes.remove(6);
		System.out.println("after removed index 6 :" + bikes);

		bikes.remove("Kawasaki");
		System.out.println("after remove Kawasaki :" + bikes);

		bikes.removeFirst();
		System.out.println("after remove First :" + bikes);

		bikes.removeLast();
		System.out.println("after remove Last :" + bikes);

		bikes.removeFirstOccurrence("BMW");
		System.out.println("after remove first occurance :" + bikes);

		bikes.removeLastOccurrence("Harley Davidson");
		System.out.println("after remove last occurance :" + bikes);

		bikes.removeAll(newBikes);
		System.out.println("after remove all newBikes :" + bikes);

		bikes.sort(null);
		System.out.println("after sort :" + bikes);

		System.out.println("size :" + bikes.size());

		System.out.println("sublist :" + bikes.subList(0, 2));

		bikes.set(2, "Thunderbird");
		System.out.println("after set :" + bikes);

		System.out.println("to Array :");
		Object[] array = bikes.toArray();
		for (Object b : array) {
			System.out.println(b);
		}

		bikes.retainAll(newBikes);
		System.out.println("after retain all :" + bikes);

	}
}
