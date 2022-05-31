package com.nexsoft.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.nexsoft.junit.calculator.BangunDatar;
import com.nexsoft.junit.calculator.Calculator;

public class BangunDatarTest {
	
	BangunDatar bangunDatar;
	int a, b;
	
	@Before
	public void persiapan() {
		bangunDatar = new BangunDatar();
		a = 4;
		b = 10;
	}
	
	@Test
	public void persegi() {
		
		int actual = bangunDatar.persegi(a);
		int expect = 16;
		
		assertEquals(expect, actual);
	}
	
	@Test
	public void persegiPanjang() {
		
		int actual = bangunDatar.persegiPanjang(a, b);
		int expect = 40;
		
		assertEquals(expect, actual);
	}
	
}
