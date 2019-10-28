package py.edu.cursojava.utilidades;

import javax.swing.JDialog;

public class ConexionReportes<E> {

	public JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualizar Reporte", true);
	
//	public void gerarReporteSinObjeto(Map<String, Object> par, String reporte) throws JRException{
//		viewer.setSize(1000,700);     
//		viewer.setLocationRelativeTo(null);
//		viewer.setModal(true);
//		InputStream stream = ConexionReportes.class.getResourceAsStream("/py/com/abpsempenhos/informe/"+reporte+".jrxml");
//		JasperReport report= JasperCompileManager.compileReport(stream);
//		JasperPrint print = JasperFillManager.fillReport(report, par, new JREmptyDataSource());
//		JasperViewer jrViewer = new JasperViewer(print, true);     
//		viewer.getContentPane().add(jrViewer.getContentPane());
//	}
//	
//	public void generarReporteConObjeto(List<E> lista,Map<String, Object> par, String reporte) throws JRException{     
//		viewer.setSize(1000,700);     
//		viewer.setLocationRelativeTo(null);
//		viewer.setModal(true);
//		InputStream stream = ConexionReportes.class.getResourceAsStream("/py/com/abpsempenhos/informe/"+reporte+".jrxml");
//		JasperReport report= JasperCompileManager.compileReport(stream);
//		JasperPrint print = JasperFillManager.fillReport(report, par,new JRBeanCollectionDataSource(lista));
//		JasperViewer jrViewer = new JasperViewer(print, true);     
//		viewer.getContentPane().add(jrViewer.getContentPane());
//	}
//	
//	public void primeraConexion(String reporte) throws JRException{
//		InputStream stream = ConexionReportes.class.getResourceAsStream("/py/com/abpsempenhos/informe/"+reporte+".jrxml");
//		JasperReport report= JasperCompileManager.compileReport(stream);
//		JasperPrint print = JasperFillManager.fillReport(report, null, new JREmptyDataSource());
//		if(print==null);
//	}
	
}
