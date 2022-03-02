package br.com.lucasrodrigues.dp.adapter.adapter;

import br.com.lucasrodrigues.dp.adapter.entities.RoundPeg;
import br.com.lucasrodrigues.dp.adapter.entities.SquarePeg;

/**
 * @author Lucas Rodrigues
 * @since 2022/03/02
 */
public class SquarePegAdapter extends RoundPeg {

	private SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg) {
		this.peg = peg;
	}

	public int getRadius() {
		return (int) (peg.getWidth() * Math.sqrt(2) / 2);
	}

}
