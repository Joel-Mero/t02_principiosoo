package deber.tablero.ajedrez;

public class TableroAjedrez extends Pieza{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Peon peonNegro1 = new Peon();
		peonNegro1.setColor("Peon Negro 1");

		Peon peonNegro2 = new Peon();
		peonNegro2.setColor("Peon Negro 2");

		Peon peonNegro3 = new Peon();
		peonNegro3.setColor("Peon Negro 3");

		Peon peonNegro4 = new Peon();
		peonNegro4.setColor("Peon Negro 4");

		Peon peonNegro5 = new Peon();
		peonNegro5.setColor("Peon Negro 5");

		Peon peonNegro6 = new Peon();
		peonNegro6.setColor("Peon Negro 6");
		
		Peon peonNegro7 = new Peon();
		peonNegro7.setColor("Peon Negro 7");
		
		Peon peonNegro8 = new Peon();
		peonNegro8.setColor("Peon Negro 8");
		
		Peon peonBlanco1 = new Peon();
		peonBlanco1.setColor("Peon Blanco 1");

		Peon peonBlanco2 = new Peon();
		peonBlanco2.setColor("Peon Blanco 2");
		
		Peon peonBlanco3 = new Peon();
		peonBlanco3.setColor("Peon Blanco 3");
		
		Peon peonBlanco4 = new Peon();
		peonBlanco4.setColor("Peon Blanco 4");
		
		Peon peonBlanco5 = new Peon();
		peonBlanco5.setColor("Peon Blanco 5");
		
		Peon peonBlanco6 = new Peon();
		peonBlanco6.setColor("Peon Blanco 6");
		
		Peon peonBlanco7 = new Peon();
		peonBlanco7.setColor("Peon Blanco 7");
		
		Peon peonBlanco8 = new Peon();
		peonBlanco8.setColor("Peon Blanco 8");
		
		Torre torreNegra1 = new Torre();
		torreNegra1.setColor("Torre Negra 1");
		
		Torre torreNegra2 = new Torre();
		torreNegra2.setColor("Torre Negra 2");
		
		Torre torreBlanca1 = new Torre();
		torreBlanca1.setColor("Torre Blanca 1");
		
		Torre torreBlanca2 = new Torre();
		torreBlanca2.setColor("Torre Blanca 2");
		
		Caballo caballoNegro1 = new Caballo();
		caballoNegro1.setColor("Caballo Negro 1");
		
		Caballo caballoNegro2 = new Caballo();
		caballoNegro2.setColor("Caballo Negro 2");
		
		Caballo caballoBlanco1 = new Caballo();
		caballoBlanco1.setColor("Caballo Blanco 1");
		
		Caballo caballoBlanco2 = new Caballo();
		caballoBlanco2.setColor("Caballo Blanco 2");
		
		Alfil alfilNegro1 = new Alfil();
		alfilNegro1.setColor("Alfil Negro 1");
		
		Alfil alfilNegro2 = new Alfil();
		alfilNegro2.setColor("Alfil Negro 2");
		
		Alfil alfilBlanco1 = new Alfil();
		alfilBlanco1.setColor("Alfil Blanco 1");
		
		Alfil alfilBlanco2 = new Alfil();
		alfilBlanco2.setColor("Alfil Blanco 2");
		
		Rey reyNegro = new Rey();
		reyNegro.setColor("Rey Negro");
		
		Rey reyBlanco = new Rey();
		reyBlanco.setColor("Rey Blanco");
		
		Reina reinaNegra = new Reina();
		reinaNegra.setColor("Reina Negra");
		
		Reina reinaBlanca = new Reina();
		reinaBlanca.setColor("Reina Blanxa");
		
		Pieza pieza[][] = new Pieza[8][8];
		pieza[1][0] = peonNegro1;
		pieza[1][1] = peonNegro2;
		pieza[1][2] = peonNegro3;
		pieza[1][3] = peonNegro4;
		pieza[1][4] = peonNegro5;
		pieza[1][5] = peonNegro6;
		pieza[1][6] = peonNegro7;
		pieza[1][7] = peonNegro8;
		pieza[6][0] = peonBlanco1;
		pieza[6][1] = peonBlanco2;
		pieza[6][2] = peonBlanco3;
		pieza[6][3] = peonBlanco4;
		pieza[6][4] = peonBlanco5;
		pieza[6][5] = peonBlanco6;
		pieza[6][6] = peonBlanco7;
		pieza[6][7] = peonBlanco8;
		
		pieza[0][0] = torreNegra1;
		pieza[0][7] = torreNegra2;
		pieza[7][0] = torreBlanca1;
		pieza[7][7] = torreBlanca2;
		
		pieza[0][1] = caballoNegro1;
		pieza[0][6] = caballoNegro2;
		pieza[7][1] = caballoBlanco1;
		pieza[7][6] = caballoBlanco2;
		
		pieza[0][2] = alfilNegro1;
		pieza[0][5] = alfilNegro2;
		pieza[7][2] = alfilBlanco1;
		pieza[7][5] = alfilBlanco2;
		
		pieza[0][3] = reyNegro;
		pieza[7][3] = reyBlanco;
		
		pieza[0][4] = reinaNegra;
		pieza[7][4] = reinaBlanca;
		
		
		System.out.println("-----Tablero-----");
		
		System.out.print(pieza[0][0] + "Torre Negra 1  ");
		System.out.print(pieza[0][1] + "Caballo Negro 1  ");
		System.out.print(pieza[0][2] + "Alfil Negro 1  ");
		System.out.print(pieza[0][3] + "Rey Negro  ");
		System.out.print(pieza[0][4] + "Reina Negra  ");
		System.out.print(pieza[0][5] + "Alfil Negro 2  ");
		System.out.print(pieza[0][6] + "Caballo Negro 2  ");
		System.out.print(pieza[0][7] + "Torre Negra 2  ");
		
		System.out.println();	
		System.out.print(pieza[1][0] + "Peon Negro 1   ");
		System.out.print(pieza[1][1] + "Peon Negro 2   ");
		System.out.print(pieza[1][2] + "Peon Negro 3   ");
		System.out.print(pieza[1][3] + "Peon Negro 4   ");
		System.out.print(pieza[1][4] + "Peon Negro 5   ");
		System.out.print(pieza[1][5] + "Peon Negro 6   ");
		System.out.print(pieza[1][6] + "Peon Negro 7   ");
		System.out.print(pieza[1][7] + "Peon Negro 8   ");

		System.out.println();
		System.out.print(pieza[2][0] + "");
		System.out.println();
		System.out.print(pieza[3][0] + "");
		System.out.println();
		System.out.print(pieza[4][0] + "");
		System.out.println();
		System.out.print(pieza[5][0] + "");
		
		System.out.println();
		System.out.print(pieza[6][0] + "Peon Blanco 1   ");
		System.out.print(pieza[6][1] + "Peon Blanco 2   ");
		System.out.print(pieza[6][2] + "Peon Blanco 3   ");
		System.out.print(pieza[6][3] + "Peon Blanco 4   ");
		System.out.print(pieza[6][4] + "Peon Blanco 5   ");
		System.out.print(pieza[6][5] + "Peon Blanco 6   ");
		System.out.print(pieza[6][6] + "Peon Blanco 7   ");
		System.out.print(pieza[6][7] + "Peon Blanco 8   ");
		
		System.out.println();
		System.out.print(pieza[7][0] + "Torre Blanca 1  ");
		System.out.print(pieza[7][1] + "Caballo Blanco 1  ");
		System.out.print(pieza[7][2] + "Alfil Blanco 1  ");
		System.out.print(pieza[7][3] + "Rey Blanco  ");
		System.out.print(pieza[7][4] + "Reina Blanca  ");
		System.out.print(pieza[7][5] + "Alfil Blanco 2  ");
		System.out.print(pieza[7][6] + "Caballo Blanco 2  ");
		System.out.print(pieza[7][7] + "Torre Blanca 2  ");
		
	}

}
