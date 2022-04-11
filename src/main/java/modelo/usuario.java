package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "tb_usuarios")
public class usuario {
	
	@Id
	@Column (name = "cod_usua")
	private int codigo;
	
	@Column (name = "nom_usua")
	private String nombre;
	
	@Column (name = "ape_usua")
	private String apellido;
	
	@Column (name = "usr_usua")
	private String usuario;
	
	@Column (name = "cla_usua")
	private String clave;
	
	@Column (name = "fna_usua")
	private String fchnacim;
	
	@Column (name = "idtipo")
	private int tipo;
	
	@Column (name = "est_usua")
	private int estado;
	
	@Override
	public String toString() {
		return "usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", clave=" + clave + ", fchnacim=" + fchnacim + ", tipo=" + tipo + ", estado=" + estado + "]";
	}	
	
	
	public usuario() {
		
	}

	public usuario(int codigo, String nombre, String apellido, String usuario, String clave, String fchnacim, int tipo,
			int estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fchnacim = fchnacim;
		this.tipo = tipo;
		this.estado = estado;
	}


	//get and set

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFchnacim() {
		return fchnacim;
	}
	public void setFchnacim(String fchnacim) {
		this.fchnacim = fchnacim;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
