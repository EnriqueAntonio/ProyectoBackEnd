package proyecto.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.modelo.Patologia;
import proyecto.repositorio.PatologiaRepositorio;
import proyecto.utilitarios.Messages;
import proyecto.utilitarios.ResponseDTO;

@Service
public class PatologiaServicio {

	@Autowired
	PatologiaRepositorio repositoriobd;
	
	public ResponseDTO findALL() {
		ResponseDTO res=new ResponseDTO();
		try {
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
	
	public ResponseDTO crear(Patologia patalogia) {
		
		ResponseDTO res= new ResponseDTO();
		
		try 
		{
			res.setRespuesta(repositoriobd.save(patalogia));
			
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return res;
	}
	
	public ResponseDTO actualizar(Patologia patalogia) {
		
		ResponseDTO res= new ResponseDTO();
		
		try 
		{
			if(repositoriobd.existsById(patalogia.getId_pat()))
			{ 
				res.setRespuesta(repositoriobd.save(patalogia));
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
