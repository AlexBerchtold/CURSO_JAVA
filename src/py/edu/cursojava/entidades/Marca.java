package py.edu.cursojava.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "tb_marcar")
public class Marca {
	@Id
	@GenericGenerator(name="mar_generator", strategy="increment")
	@GeneratedValue(generator="mar_generator")
	@Column(name="mar_id")
	private int id;
	@Column(name="mar_descripcion", nullable = false, length = 100)
	private String descripcion;
	@Column(name="mar_estado", nullable = false)
	private boolean estado;
	
	@OneToMany(mappedBy="marca")
	private List<Producto> productos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	


}
