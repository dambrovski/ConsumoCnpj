package br.com.airton.ConsumoCnpj;

public class Cnpj {

	// propriedades do CEP
	private String cnpj;
	private String tipo;
	private String nome;
	private String fantasia;
	private String email;

	public String getCnpj() {
		return cnpj;
	}

	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getFantasia() {
		return fantasia;
	}

	public String getEmail() {
		return email;
	}

	public Cnpj setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public Cnpj setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	public Cnpj setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Cnpj setFantasia(String fantasia) {
		this.fantasia = fantasia;
		return this;
	}

	public Cnpj setEmail(String email) {
		this.email = email;
		return this;
	}

	@Override
	public String toString() {
		return "Cnpj [cnpj=" + cnpj + ", tipo=" + tipo + ", nome=" + nome + ", fantasia=" + fantasia + ", email="
				+ email + "]";
	}

}
