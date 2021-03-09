package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	List<String> words;
		
	public Parole() {
		
		//this.words = new LinkedList<>();
		this.words = new ArrayList<>();
	}
	
	public void addParola(String p) {
		
		if((p.matches(".*[a-zA-Z].*")) && (!p.matches(".*[0-9].*"))) {
			words.add(p);
		}
	}
	
	public List<String> getElenco() {
		
		//List<String> el  = new LinkedList<>(words);
		List<String> el  = new ArrayList<>(words);
		Collections.sort(el);
		return el;
		
	}
	
	public void reset() {
		
		words.clear();
	}

	@Override
	public String toString() {
		
		String res = "";
		for(String s : this.words) {
			res += s + "\n";
		}
		return res;
	}
	
	public void cancella(String s) {
		if(words.contains(s)) {
			words.remove(s);
		}
	}
}
