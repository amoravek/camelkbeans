package cz.trask.camelk;

import java.util.Random;

public class RandomStringsBean {

	private final String generateRandomString(final int length) {

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'

		Random random = new Random();
		StringBuilder buffer = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();

		return generatedString;
	}

	public String getRandomString(int lenght) {
		return this.generateRandomString(lenght);
	}

}
