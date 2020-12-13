package BuscaminasProject;


import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JocTest {
	

	@Before
	public void setUpStreams() throws Exception {
	}

	@Test
	public void testjugarPartidaPerduda() {
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		MockJoc joc = new MockJoc();
		//PARTIDA PERDUDA
		joc.jugarPartida(".\\src\\test\\resources\\joc_jugarPartida.txt");
		String partidaPerduda = "Has perdut la partida perque has seleccionat una bomba. \n"; 
		assertEquals(partidaPerduda, outContent.toString());	
		System.setOut(originalOut);
		
	}

	@Test
	public void testjugarPartidaGuanyada() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		MockJoc joc = new MockJoc();
		//PARTIDA GUANYADA (al System.out s'acumulen les coses que s'han anat escribint abans, per tant posem el valor del test anterior abans del resultat esperat
		joc.jugarPartida(".\\src\\test\\resources\\joc_jugarPartida_victoria.txt");
		//joc.jugarPartida(".\\src\\test\\resources\\joc_jugarPartida_FalsaVictoria");
		String partidaGuanyada = "ENHORABONA MAQUINA! Has guanyat la partida.\n";
		assertEquals(partidaGuanyada, outContent.toString());
		System.setOut(originalOut);

	}


	//FER I ALEIX
	@Test
	public void Automated1() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		MockJoc joc = new MockJoc();
		//PARTIDA PERDUDA
		joc.jugarPartida(".\\src\\test\\resources\\AutomatedTest1.txt");
		String partidaPerduda = "Has perdut la partida perque has seleccionat una bomba. \n";
		assertEquals(partidaPerduda, outContent.toString());
		System.setOut(originalOut);

	}

	@Test
	public void Automated2() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		MockJoc joc = new MockJoc();
		//PARTIDA GUANYADA (al System.out s'acumulen les coses que s'han anat escribint abans, per tant posem el valor del test anterior abans del resultat esperat
		joc.jugarPartida(".\\src\\test\\resources\\AutomatedTest2.txt");
		String partidaGuanyada = "ENHORABONA MAQUINA! Has guanyat la partida.\n";
		assertEquals(partidaGuanyada, outContent.toString());
		System.setOut(originalOut);

	}

	@Test
	public void Automated3() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		MockJoc joc = new MockJoc();
		//PARTIDA PERDUDA
		joc.jugarPartida(".\\src\\test\\resources\\AutomatedTest3.txt");
		String partidaPerduda = "Has perdut la partida perque has seleccionat una bomba. \n";
		assertEquals(partidaPerduda, outContent.toString());
		System.setOut(originalOut);

	}

	@Test
	public void Automated4() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		MockJoc joc = new MockJoc();
		//PARTIDA GUANYADA (al System.out s'acumulen les coses que s'han anat escribint abans, per tant posem el valor del test anterior abans del resultat esperat
		joc.jugarPartida(".\\src\\test\\resources\\AutomatedTest4.txt");
		String partidaGuanyada = "ENHORABONA MAQUINA! Has guanyat la partida.\n";
		assertEquals(partidaGuanyada, outContent.toString());
		System.setOut(originalOut);

	}

	@Test
	public void testBucleJoc() {
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		MockJoc joc = new MockJoc();
		//ENTRAR A LA PARTIDA, FER UN MOVIMENT, SORTIR DE LA PARTIDA I SORTIR
		joc.bucleJoc(".\\src\\test\\resources\\joc_buclePartida_1.txt", ".\\src\\test\\resources\\joc_buclePartida_moviments.txt");
		assertEquals("Joc finalitzat. \n", outContent.toString());
		System.setOut(originalOut);
		
	}

}