package ma.emsi.grpc.Service;

import ma.emsi.grpc.Entitie.Compte;
import ma.emsi.grpc.Repo.CompteRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ComptService {

    private final CompteRepository compteRepository;
    public ComptService (CompteRepository compteRepository){
        this.compteRepository=compteRepository;
    }
    public List<Compte> findAll(){
        return  compteRepository.findAll();
    }
    public Compte findCompteById(String id){
        return compteRepository.findById(id).orElse(null);
    }
    public Compte saveCompte(Compte compte){
        return  compteRepository.save(compte);
    }
}
