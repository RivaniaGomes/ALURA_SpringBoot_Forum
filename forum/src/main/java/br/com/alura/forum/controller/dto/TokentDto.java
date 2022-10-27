package br.com.alura.forum.controller.dto;

public class TokentDto {

	private String token;
	private String tipo;

	public TokentDto(String token, String tipo) {
		this.token = token;
		this.tipo = tipo;
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

}
