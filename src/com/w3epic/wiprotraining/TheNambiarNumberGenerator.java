package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class TheNambiarNumberGenerator {

	public int nnGenerator(String input1){
		// Read only region end
		String mobileNo = input1;
		StringBuilder numbiarNo = new StringBuilder();

		for (int i = 0; i < mobileNo.length(); i++) {
			int firstDigit = Integer.parseInt(String.valueOf(mobileNo.charAt(i)));
			int firstDigitEvenOrOdd = firstDigit % 2 == 0 ? 0 : 1; // even=0; odd=1
			int sum = firstDigit;
			int j = i + 1;

			if (j == mobileNo.length()) {
				numbiarNo.append(firstDigit);
				break;
			}

			while (true) {
				sum += Integer.parseInt(String.valueOf(mobileNo.charAt(j++)));

				if (sum % 2 != firstDigitEvenOrOdd || j >= mobileNo.length()) {
					numbiarNo.append(sum);
					i = j - 1;
					break;
				}
			}
		}
		
		return Integer.parseInt(numbiarNo.toString());
	}
}