package py.edu.cursojava.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="tb_ventas")
public class Venta {
	@Id
	@GenericGenerator(name="ven_generator",  strategy="increment")
	@GeneratedValue(generator="ven_generator")
	@Column(name="ven_id")
	private int id;
	@Column(name="ven_total", nullable=false)
	private double total;
	@Column(name="ven_anulada", nullable=false)
	private boolean anulado;
	@Column(name="ven_obs", length=250)
	private String obs;
	@ManyToOne
	private Funcionario funcionario;
	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy="venta")
	private List<VentaDetalle> ventaDetalles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isAnulado() {
		return anulado;
	}
	public void setAnulado(boolean anulado) {
		this.anulado = anulado;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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

}
