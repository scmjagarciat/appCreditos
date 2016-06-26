package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrestamosTest {

	@Test
	public void alicuotaTest() {
		Prestamos prestamo = new PrestamosImpl();
		double resultado = prestamo.calcularAlicuota(12, 24, 1000000);
		assertEquals(94559.60, resultado, 0.1);
	}
	@Test
	public void calcularInteresesAPagarPorCuotasTest() {
		Prestamos prestamo = new PrestamosImpl();
		double[] interesesAPagar = prestamo.calcularInteresesAPagarPorAlicuota(12, 24, 1000000);
		double[] interesesEsperados = new double[12];
		interesesEsperados[0]	=20000.00;
		interesesEsperados[1]	=18508.81;
		interesesEsperados[2]	=16987.79;
		interesesEsperados[3]	=15436.36;
		interesesEsperados[4]	=13853.89;
		interesesEsperados[5]	=12239.78;
		interesesEsperados[6]	=10593.38;
		interesesEsperados[7]	=8914.06;
		interesesEsperados[8]	=7201.15;
		interesesEsperados[9]	=5453.98;
		interesesEsperados[10]	=3671.86;
		interesesEsperados[11]	=1854.11;
		assertArrayEquals(interesesEsperados, interesesAPagar, 0.01);
	}

	@Test
	public void calcularCuotasCapitalFijo()
	{
		Prestamos prestamo = new PrestamosImpl();
		double[] cuotaAPagar = prestamo.calcularCuotasCapitalFijo(12, 24, 1000000);
		double[] cuotasEsperadas = new double[12];
		cuotasEsperadas[	0	]	=	103333.33	;
		cuotasEsperadas[	1	]	=	101666.67	;
		cuotasEsperadas[	2	]	=	100000.00	;
		cuotasEsperadas[	3	]	=	98333.33	;
		cuotasEsperadas[	4	]	=	96666.67	;
		cuotasEsperadas[	5	]	=	95000.00	;
		cuotasEsperadas[	6	]	=	93333.33	;
		cuotasEsperadas[	7	]	=	91666.67	;
		cuotasEsperadas[	8	]	=	90000.00	;
		cuotasEsperadas[	9	]	=	88333.33	;
		cuotasEsperadas[	10	]	=	86666.67	;
		cuotasEsperadas[	11	]	=	85000.00	;

		assertArrayEquals(cuotasEsperadas, cuotaAPagar, 0.01);
		
	}
	@Test
	public void calcularTotalInteresAPagarAlicuotaTest() {
		Prestamos prestamo = new PrestamosImpl();
		double totalInteresAPagar = prestamo.calcularTotalInteresAPagarAlicuota(12, 24, 1000000);
		assertEquals(134715.16, totalInteresAPagar, 0.01);
	}
	
	@Test
	public void calcularTotalInteresAPagarCapitalFijoTest() {
		Prestamos prestamo = new PrestamosImpl();
		double totalInteresAPagar = prestamo.calcularTotalInteresAPagarCapitalFijo(12, 24, 1000000);
		assertEquals(130000.00, totalInteresAPagar, 0.01);
	}
	
	
	@Test
	public void calcularInteresesAPagarPorCapitalFijoTest() {
		Prestamos prestamo = new PrestamosImpl();
		double[] interesesAPagar = prestamo.calcularInteresesAPagarPorCapitalFijo(12, 24, 1000000);
		double[] interesesEsperados = new double[12];
		interesesEsperados[	0	]	=	20000.00	;
		interesesEsperados[	1	]	=	18333.33	;
		interesesEsperados[	2	]	=	16666.67	;
		interesesEsperados[	3	]	=	15000.00	;
		interesesEsperados[	4	]	=	13333.33	;
		interesesEsperados[	5	]	=	11666.67	;
		interesesEsperados[	6	]	=	10000.00	;
		interesesEsperados[	7	]	=	8333.33	;
		interesesEsperados[	8	]	=	6666.67	;
		interesesEsperados[	9	]	=	5000.00	;
		interesesEsperados[	10	]	=	3333.33	;
		interesesEsperados[	11	]	=	1666.67	;

		assertArrayEquals(interesesEsperados, interesesAPagar, 0.01);
	}

}
