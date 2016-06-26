package co.edu.usbcali.scm;

public interface Prestamos {

	public double calcularAlicuota(int plazo, double tasa, double capital);

	public double[] calcularInteresesAPagarPorAlicuota(int plazo, double tasa, double capital);
	
	public double[] calcularInteresesAPagarPorCapitalFijo(int plazo, double tasa, double capital);
	
	public double[] calcularCuotasCapitalFijo(int plazo, double tasa, double capital);
	
	public double calcularTotalInteresAPagarAlicuota(int plazo, double tasa, double capital);

	public double calcularTotalInteresAPagarCapitalFijo(int plazo, double tasa, double capital);

}
