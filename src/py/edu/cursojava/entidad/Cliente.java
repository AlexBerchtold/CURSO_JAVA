package py.edu.cursojava.entidad;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "tb_clientes")
public class Cliente {
	@Id
	@GenericGenerator(name="cli_generator", strategy="increment")
	@GeneratedValue(generator="cli_generator")
	@Column(name="cli_id")
	private int id;
	@Column(name="cli_nombre", nullable = false, length = 100)
	private String nombre;
	@Column(name="cli_apellido", nullable = false, length = 100)
	private String apellido;
	@Column(name="cli_documento", nullable = false, length = 45)
	private String documento;
	@Column(name="cli_telefono", nullable = false, length = 45)
	private String telefono;
	@Column(name="cli_email", nullable = false, length = 250)
	private String email;
	@Column(name="cli_direccion", nullable = false, length = 250)
	private String direccion;
	@Column(name="cli_estado", nullable = false)
	private boolean estado;
	@Column(name="cli_fecha_registro", nullable = false)
	private Date fechaRegistro;
	@OneToMany(mappedBy = "cliente")
	private List<Venta> ventas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public List<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	
}
