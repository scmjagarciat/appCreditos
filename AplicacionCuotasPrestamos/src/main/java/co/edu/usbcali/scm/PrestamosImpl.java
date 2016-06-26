package co.edu.usbcali.scm;

public class PrestamosImpl implements Prestamos {

	public double calcularAlicuota(int plazo, double tasa, double capital) {
		double tasaMesNominal = tasa / 12;
		double alicuota = ((tasaMesNominal / 100) * capital)
				/ (1 - Math.pow(1 + (tasaMesNominal / 100), -1 * plazo));
		return alicuota;
	}

	public double[] calcularInteresesAPagarPorAlicuota(int plazo, double tasa, double capital) {
		double alicuota = this.calcularAlicuota(plazo, tasa, capital);
		double saldoCapital = capital;
		double interes;
		double[] interesesAPagarArray = new double[plazo];
		for (int i = 0; i < plazo; i++) {
			interes = ((tasa / 12) / 100) * saldoCapital;
			interesesAPagarArray[i] = interes;
			saldoCapital = saldoCapital - alicuota + interes;
		}
		return interesesAPagarArray;
	}

	public double[] calcularCuotasCapitalFijo(int plazo, double tasa, double capital) {
		double cuota;
		double capitalFijo = capital / plazo;
		double saldoCapital = capital;
		double[] cuotasAPagarArray = new double[plazo];
		for (int i = 0; i < plazo; i++) {
			cuota = capitalFijo + ((tasa / 12) / 100) * saldoCapital;
			cuotasAPagarArray[i] = cuota;
			saldoCapital = saldoCapital - capitalFijo;
		}
		return cuotasAPagarArray;
	}

	public double calcularTotalInteresAPagarAlicuota(int plazo, double tasa,
			double capital) {
	double[] interesesAPagarArray = this.calcularInteresesAPagarPorAlicuota(plazo, tasa, capital);
	double totalInteresesAPagar = 0.0;
	for(int i =0 ; i<plazo; i++)
		totalInteresesAPagar =totalInteresesAPagar + interesesAPagarArray[i];

	return totalInteresesAPagar;
	}

	public double calcularTotalInteresAPagarCapitalFijo(int plazo, double tasa,
			double capital) {
		double[] interesesAPagarArray = this.calcularInteresesAPagarPorCapitalFijo(plazo, tasa, capital);
		double totalInteresesAPagar = 0.0;
		for(int i =0 ; i<plazo; i++)
			totalInteresesAPagar =totalInteresesAPagar + interesesAPagarArray[i];

		return totalInteresesAPagar;
			}

	public double[] calcularInteresesAPagarPorCapitalFijo(int plazo,
			double tasa, double capital) {
		double capitalFijo = capital / plazo;
		double saldoCapital = capital;
		double[] interesesAPagarArray = new double[plazo];
		for (int i = 0; i < plazo; i++) {
			interesesAPagarArray[i] = saldoCapital*((tasa/12)/100);
			saldoCapital = saldoCapital - capitalFijo;
		}
		return interesesAPagarArray;
	}

}
