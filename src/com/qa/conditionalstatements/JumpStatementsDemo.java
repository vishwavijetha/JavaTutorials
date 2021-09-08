package com.qa.conditionalstatements;

public class JumpStatementsDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Break
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		// Break label (Go To)
		boolean flag = true;
		first:
		{
			second:
			{
				third:
				{
					if (flag) {
						break second;
					}
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			// First block
            System.out.println("This is after second block.");
		}
		
		// Continuec(Skip)
		for (int i = 0; i < 10; i++) {
			if (i%2 == 0)
				continue;
			System.out.println(i);
			
		}
		
		// Return
		flag = false;
		System.out.println("Before return");
		if (flag == false) {
			return;
		}
		System.out.println("This won't execute");

	}

}
