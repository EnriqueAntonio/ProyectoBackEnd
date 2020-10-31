package proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="patology")
public class Patologia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pat")
	private Long id_pat;
	
	@Column(name="Tipo_de_patologia")
	private String Tipo_de_patologia;
	
	@Column(name="Categoria")
	private String Categoria;
	
	@Column(name="Patogeno")
	private String Patogeno;
	
	@Column(name="Descripcion")
	private String Descripcion;
	
	@Column(name="Sintomas")
	private String Sintomas;
	
	@Column(name="Tratamiento")
	private String Tratamiento;
	
	public Patologia() {
		
	}
	
	public Patologia(Long id_pat, String Tipo_de_patologia,String Categoria,String Patogeno,
			String Descripcion,String Sintomas,String Tratamiento){
		
		this.id_pat=id_pat;
		this.Tipo_de_patologia=Tipo_de_patologia;
		this.Categoria= Categoria;
		this.Patogeno=Patogeno;
		this.Descripcion=Descripcion;
		this.Sintomas=Sintomas;
		this.Tratamiento=Tratamiento;
	}

	public Long getId_pat() {
		return id_pat;
	}

	public void setId_pat(Long id_pat) {
		this.id_pat = id_pat;
	}

	public String getTipo_de_patologia() {
		return Tipo_de_patologia;
	}

	public void setTipo_de_patologia(String tipo_de_patologia) {
		Tipo_de_patologia = tipo_de_patologia;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getPatogeno() {
		return Patogeno;
	}

	public void setPatogeno(String patogeno) {
		Patogeno = patogeno;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getSintomas() {
		return Sintomas;
	}

	public void setSintomas(String sintomas) {
		Sintomas = sintomas;
	}

	public String getTratamiento() {
		return Tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		Tratamiento = tratamiento;
	}
	
	

}
