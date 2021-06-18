package temperatura;

public class Temperatura {
	
		public static double celsiusParaFarenheit(double celsius) {
			double farenheit = (celsius * 1.8) + 32;
			return farenheit;
		}
		public static double celsiusParaKelvin(double celsius) {
			double kelvin = celsius + 273.15;
			return kelvin;
		}	
		public static String classificaTemperatura(double celsius) {
			String classifica="";
			if (celsius<0)
				classifica = "NEGATIVA";
			if (celsius==0)
				classifica = "ZERO";
			if (celsius>0)
				classifica = "POSITIVA";
			return classifica;
		}	
		public static boolean validaConversaoCelsiusFarenheit(double c, double f) {		
			double farenheit = (c * 1.8) + 32;
			if (farenheit == f)
				return true;
			else
				return false;
		}	
}
