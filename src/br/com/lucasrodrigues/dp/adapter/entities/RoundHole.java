package br.com.lucasrodrigues.dp.adapter.entities;

/**
 * @author Lucas Rodrigues
 * @since 2022/03/02
 */
public class RoundHole {

	private int radius;

	public RoundHole(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public boolean fits(RoundPeg peg) {
		return this.getRadius() >= peg.getRadius();
	}
	
}
