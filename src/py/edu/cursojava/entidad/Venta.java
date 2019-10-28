package py.edu.cursojava.entidad;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "tb_ventas")
public class Venta {
	@Id
	@GenericGenerator(name="ven_generator", strategy="increment")
	@GeneratedValue(generator="ven_generator")
	@Column(name="ven_id")
	private int id;
	@Column(name="ven_fecha", nullable = false)
	private Date fecha;
	@Column(name="ven_estado", nullable = false)
	private boolean estado;
	@Column(name="ven_total", nullable = false)
	private BigDecimal total;
	@Column(name="ven_obs", length = 250)
	private String obs;
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Funcionario funcionario;
	@OneToMany(mappedBy="venta")
	private List<VentaDetalle> ventaDetalles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<VentaDetalle> getVentaDetalles() {
		return ventaDetalles;
	}
	public void setVentaDetalles(List<VentaDetalle> ventaDetalles) {
		this.ventaDetalles = ventaDetalles;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
