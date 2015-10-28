package br.com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static String dataCriacao() {
		return new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date());
	}

	public static String getVendedorDafault() {
		return "hguerra";
	}

}
