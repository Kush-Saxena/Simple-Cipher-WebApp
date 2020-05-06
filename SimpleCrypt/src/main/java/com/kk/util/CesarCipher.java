package com.kk.util;

import org.springframework.stereotype.Component;

@Component
public class CesarCipher implements ICrypterService {

	// private char spaceMarker = '[';
	// private char endlineMarker = ']';

	public String getCryptMessage(String message, int displace) {

		char[] messageArray = message.toCharArray(); // convert to char array for processing
		StringBuilder convertedString = new StringBuilder(); // preparing result list

		for (char c : messageArray) {
			char smallCaseMessage = Character.toLowerCase(c); // convert to unified lowerCase char
			char tempChar = c;
			if (validAlphabet(smallCaseMessage)) {

				tempChar = cryptCharacter(smallCaseMessage, displace);

			}
			convertedString.append(tempChar);

		}

		String result = convertedString.toString();
		return result;

	}

	public String getDecryptMessage(String message, int displace) {

		char[] messageArray = message.toCharArray(); // convert to char array for processing
		StringBuilder convertedString = new StringBuilder(); // preparing result list

		for (char c : messageArray) {
			char smallCaseMessage = Character.toLowerCase(c); // convert to unified lowerCase char
			char tempChar = c;
			if (validAlphabet(smallCaseMessage)) {

				tempChar = deCryptCharacter(smallCaseMessage, displace);

			}
			convertedString.append(tempChar);

		}

		String result = convertedString.toString();

		return result;

	}

	private boolean validAlphabet(char c) {

		boolean status = false;

		if (c >= 'a' && c <= 'z') {
			status = true;
		}

		return status;
	}

	private char cryptCharacter(char c, int displace) {

		char res;

		res = (char) (((c - 97 + displace) % 26) + 97);

		return res;

	}

	private char deCryptCharacter(char c, int displace) {
		char res;
		res = (char) (((c - 97 - displace) % 26) + 97);

		return res;

	}

}
