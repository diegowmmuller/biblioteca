package entities;

public class Livro {
	
	private String titulo;
	private String autor;
	private Integer anoLancamento;
	private boolean disponibilidade;
	
	
	public Livro(String titulo, String autor, Integer anoLancamento, Boolean disponibilidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoLancamento = anoLancamento;
		this.disponibilidade = disponibilidade;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Integer getAnoLancamento() {
		return anoLancamento;
	}


	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}


	public Boolean getDisponibilidade() {
		return disponibilidade;
	}


	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}


	@Override
	public String toString() {
		String status = disponibilidade ? "Disponivel" : "Emprestado";
		return String.format("Titulo da obra: %s || Nome do autor: %s || Ano de Lançamento: %d || Disponibilidade: %s ", titulo, autor, anoLancamento, status);
		
	}

}
