package py.edu.cursojava.entidad;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "tb_funcionarios")
public class Funcionario {
	@Id
	@GenericGenerator(name="fun_generator", strategy="increment")
	@GeneratedValue(generator="fun_generator")
	@Column(name="fun_id")
	private int id;
	@Column(name="fun_nombre", nullable = false, length = 100)
	private String nombre;
	@Column(name="fun_apellido", nullable = false, length = 100)
	private String apellido;
	@Column(name="fun_documento", nullable = false, length = 45)
	private String documento;
	@Column(name="fun_telefono", nullable = false, length = 45)
	private String telefono;
	@Column(name="fun_email", nullable = false, length = 250)
	private String email;
	@Column(name="fun_direccion", nullable = false, length = 250)
	private String direccion;
	@Column(name="fun_estado", nullable = false)
	private boolean estado;
	@Column(name="fun_fecha_registro", nullable = false)
	private Date fechaRegistro;
	@OneToMany(mappedBy = "funcionario")
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
