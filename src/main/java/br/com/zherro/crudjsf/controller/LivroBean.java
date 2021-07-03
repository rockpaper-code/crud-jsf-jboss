package br.com.zherro.crudjsf.controller;

//import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;

import br.com.zherro.crudjsf.model.Livro;

@ManagedBean(name = "livroBean")
@ViewScoped
public class LivroBean {

	private Livro livro = new Livro();
	
	public LivroBean() {
		livro.setTitulo("teste");
	}
	
	public void salvarLivro() {
		System.out.println(livro);
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
