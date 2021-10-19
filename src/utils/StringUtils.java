package utils;

public class StringUtils {

	public static char[] cpf(final String cpf) {

		char[] eval = new char[11];

		for (int i = 0, j = 0; i < cpf.length(); i++) {
			if (cpf.substring(i, i + 1).matches("[0-9]")) {
				eval[j] = cpf.charAt(i);
				j++;
			}
		}

		return eval;

	}

}
