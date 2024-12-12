package acc.br.desafiotres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acc.br.desafiotres.entity.EstudanteEntity;
import acc.br.desafiotres.repository.EstudanteRepository;


@Service
public class EstudanteService {
	
	@Autowired
	private EstudanteRepository estudanteRepo;

	
	public void inserir(EstudanteEntity estudante) {
		EstudanteEntity estudanteEnt = new EstudanteEntity(estudante);
		estudanteRepo.save(estudanteEnt);
	}
	
	public EstudanteEntity alterar(EstudanteEntity estudante) {
		EstudanteEntity estudanteEnt = new EstudanteEntity(estudante);
		return new EstudanteEntity(estudanteRepo.save(estudanteEnt));
	}
	
	public void excluir (Integer id){
		EstudanteEntity estudante = estudanteRepo.findById(id).get();
		estudanteRepo.delete(estudante);
	}
	
	public EstudanteEntity buscarPorId (Integer id){
		return new EstudanteEntity(estudanteRepo.findById(id).get());
	}
}
