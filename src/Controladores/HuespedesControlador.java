package Controladores;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import DAO.HuespedesDAO;
import Factory.ConexionBase;
import model.Huespedes;
import model.Reserva;

public class HuespedesControlador {
	
	private HuespedesDAO huespedesDao;
	
	public HuespedesControlador() {
		Connection con = new ConexionBase().conectarBase();
		this.huespedesDao = new HuespedesDAO(con);
	}
	public void guardar(Huespedes huespedes) {
		this.huespedesDao.guardar(huespedes);
	}
	
	public List<Huespedes> mostrarHuesped(){
		return this.huespedesDao.mostrar();
	}
	public List<Huespedes> buscarHuesped(String id){
		return this.huespedesDao.buscarId(id);
	}
	public void ActualizarH(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String telefono,
			Integer idReserva, Integer id) {
		this.huespedesDao.ActualizarH(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva, id);
	}
	public void Elimiar(Integer idReserva) {
		this.huespedesDao.Eliminar(idReserva);
	}
}
