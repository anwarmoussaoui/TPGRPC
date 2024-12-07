package ma.emsi.grpc.Repo;


import ma.emsi.grpc.Entitie.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
}
