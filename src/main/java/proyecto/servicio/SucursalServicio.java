package proyecto.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.modelo.Sucursal;
import proyecto.repositorio.SucursalRepositorio;
import proyecto.utilitarios.Messages;
import proyecto.utilitarios.ResponseDTO;

@Service
public class SucursalServicio {

	
	@Autowired
	SucursalRepositorio repositoriobd;
	
	public ResponseDTO findALL() {
		ResponseDTO res=new ResponseDTO();
		try 
		{
			res.setRespuesta(repositoriobd.findAll());
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return res;
	}
	
	public ResponseDTO crear(Sucursal sucursal) {
		
		ResponseDTO res= new ResponseDTO();
		
		try 
		{
			res.setRespuesta(repositoriobd.save(sucursal));
			
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return res;
	}
	
	public ResponseDTO actualizar(Sucursal sucursal) {
		
		ResponseDTO res= new ResponseDTO();
		
		try 
		{
			if(repositoriobd.existsById(sucursal.getId()))
			{ 
				res.setRespuesta(repositoriobd.save(sucursal));
			    res.setCodigo(Messages.CODE_UPDATE_SUCCES);
			    res.setMensaje(Messages.MSG_UPDATE_OK);
			}
			else
			{
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
			}
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return res;
	}
	
	public ResponseDTO borrar(Long id) {
		
		ResponseDTO res= new ResponseDTO();
		
		try
		{
			if(repositoriobd.findById(id)!=null)
			{
				repositoriobd.deleteById(id);
				res.setCodigo(Messages.CODE_DELETE_SUCCESS);
				res.setMensaje(Messages.MSG_DELETE_OK);
			}
			else
			{
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
			}
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return res;
	}
}
