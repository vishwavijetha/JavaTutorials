package com.qa.utils;

public class EnumClassDemo {
	/**
	 * An enum is a special "class" that represents a group of constants
	 * (unchangeable variables, like final variables).
	 */
	enum Level {
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args) {
		Level level = Level.HIGH;
		System.out.println(level);
		
		for (Level level1: Level.values()) {
			System.out.println(level1);
		}
	}

}
