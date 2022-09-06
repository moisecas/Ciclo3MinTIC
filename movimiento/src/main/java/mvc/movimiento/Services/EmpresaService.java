package mvc.movimiento.Services;

import mvc.movimiento.Entities.Empresa;
import mvc.movimiento.Repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    //obtenerempresas
    public ArrayList<Empresa> obtenerEmpresas(){
        return (ArrayList<Empresa>) empresaRepository.findAll();
    }

    public Empresa guardarEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Optional<Empresa> obtenerPorId(Long id){
        return empresaRepository.findById(id);
    }

    public boolean eliminarEmpresa(Long id) {
        try{
            empresaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
