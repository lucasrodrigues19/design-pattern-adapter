package br.com.lucasrodrigues.dp.adapter;

import br.com.lucasrodrigues.dp.adapter.adapter.SquarePegAdapter;
import br.com.lucasrodrigues.dp.adapter.entities.RoundHole;
import br.com.lucasrodrigues.dp.adapter.entities.RoundPeg;
import br.com.lucasrodrigues.dp.adapter.entities.SquarePeg;

/**
 * @author Lucas Rodrigues
 * @since 2022/03/02
 */
public class Application {

	public static void main(String[] args) {
		
		RoundHole rhole = new RoundHole(5);
		
		RoundPeg rpeg = new RoundPeg(5);
		
		System.out.println("O radius do buraco redondo é igual ao radius pino redondo? "+rhole.fits(rpeg));
		
		SquarePeg smallSPeg = new SquarePeg(5);
		SquarePeg largeSPeg = new SquarePeg(15);
		
		SquarePegAdapter smallSPegAdapter = new SquarePegAdapter(smallSPeg);
		SquarePegAdapter largeSPegAdapter = new SquarePegAdapter(largeSPeg);
		
		System.out.println("O radius do buraco redondo é igual ao radius do pino quadrado pequeno adaptado? "+rhole.fits(smallSPegAdapter));
		System.out.println("O radius do buraco redondo é igual ao radius do pino quadrado grande adaptado? "+rhole.fits(largeSPegAdapter));

		
	}
}
