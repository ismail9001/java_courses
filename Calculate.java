public class Calculate {
	public static void main (String[] arg) {
		System.out.println("Calculate");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		short firstS = Short.valueOf(arg[0]);
		short secondS = Short.valueOf(arg[1]);
		short minus = (short)(firstS - secondS);
		long firstL = Long.valueOf(arg[0]);
		long secondL = Long.valueOf(arg[1]);
		long raznica = (long)(firstL - secondL);
		float firstF = Float.valueOf(arg[0]);
		float secondF = Float.valueOf(arg[1]);
		float proizved = (float)(firstF * secondF);
		double firstD = Double.valueOf(arg[0]);
		double secondD = Double.valueOf(arg[1]);
		double delenie = firstD / secondD;
		double stepen = Math.pow(firstD,secondD);
		System.out.println("sum " + summ);
		System.out.println("raznica " + minus);
		System.out.println("proizvedenie " + proizved);
		System.out.println("delenie " + delenie);
		System.out.println("stepen " + stepen);
	}
}