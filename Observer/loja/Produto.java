package loja;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private List<Users> usuariosDisp;
	private List<Users> usuariosPromo;
	private String link;
	private String codPromo;
	private boolean estaEmPromocao;
	private boolean estaDisponivel;
	
	public Produto() {
		this.usuariosDisp = new ArrayList<>();
		this.usuariosPromo = new ArrayList<>();
		this.codPromo = "Xlr8";
		this.link = "www.loja.com/produto";
		this.estaDisponivel = false;
		this.estaEmPromocao = false; //teste
	}
	
	public void cadastrarUsDisp(Users user) {
		usuariosDisp.add(user);
	}
	
	public void cadastrarPromo(Users user) {
		usuariosPromo.add(user);
	}
	
	public boolean estaEmPromocao() {
		return estaEmPromocao;
	}
	
	public void setEstaEmPromocao(boolean estaEmPromocao) {
		if(estaEmPromocao) {
			String msg = toStringP();
			notificarP(msg);
			this.estaEmPromocao = estaEmPromocao;
		}else {
			this.estaEmPromocao = estaEmPromocao;
		}
		
	}
	
	public boolean isEstaDisponivel() {
		return estaDisponivel;
	}
	
	public void setEstaDisponivel(boolean estaDisponivel) {
		if(estaDisponivel) {
			String msg = toStringDisp();
			notificarDisp(msg);
			this.estaDisponivel = estaDisponivel;
		}else {
			this.estaDisponivel = estaDisponivel;
		}
	}

	private void notificarDisp(String msg) {
		for(Users us: usuariosDisp) {
			us.notificar(msg);
		}
	}
	
	private void notificarP(String msg) {
		for(Users us: usuariosPromo) {
			us.notificar(msg);
		}
	}
	
	private String toStringDisp() {
		return "Link do produto: " + this.link;
	}
	
	private String toStringP() {
		return "Cod promo: " + this.codPromo+"Link do produto: "+this.link;
	}
}
