package ch.bwzrappi.m226.u14;

/**
 * Beschreibt einen Musiker, der ein Instrument spielt und auf diesem Töne
 * erzeugt.
 */
public class Musiker {

	private String name;
	private Instrument refToInstrument;

	public Musiker(String name, Instrument instrument) {
		this.name = name;
		refToInstrument = instrument;
	}

	public String getName() {
		return name;
	}

	/*
	 * Musiker spielt einen Ton
	 */
	public void spielNote(char note) {
		System.out.print(this.name + " spielt mit ");
		refToInstrument.spielNote(note);
	}

}