package Teclado;



public class KeyboardLayoutNeutro extends KeyboardLayout {



	private static final double DEFAULT_RETURN_VALUE = 1.0;



	public String getModel() {

		return "NEUTRO";

	}



	public double getInsertDeleteDistance() {

		return DEFAULT_RETURN_VALUE;

	}



	public double getNominalDistance(char firstChar, char secondChar) {

		return DEFAULT_RETURN_VALUE;

	}



	public double getRelativeDistance(char c1, char c2) {

		return DEFAULT_RETURN_VALUE;

	}

}
