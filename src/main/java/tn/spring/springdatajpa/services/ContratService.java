package tn.spring.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springdatajpa.entities.Contrat;
import tn.spring.springdatajpa.entities.Etudiant;
import tn.spring.springdatajpa.repositories.ContratRepository;
import tn.spring.springdatajpa.repositories.EtudiantRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class ContratService implements IContratService{
    @Autowired
    ContratRepository contratRepository;

    @Autowired
    EtudiantRepository etudiantRepository;

    Contrat contrat;
    Contrat contrat2;
    EtudiantService es;
    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> retriveAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat retriveContrat(int id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContrat(int id) {
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat affectContratToEtudiant (Contrat ce,String nomE,String prenomE)
    {
        // Etudiant etudiant=es.retriveEtudiantByName(nomE,prenomE);
        Etudiant etudiant=etudiantRepository.findByNomEAndPrenomE(nomE,prenomE);
        if(etudiant.getContrats().size()<5)
        {
            ce.setEtudiant(etudiant);
        }
        return contratRepository.save(ce);
    }


    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate)
    {
        List<Contrat> contrats = contratRepository.findByDateFinContratBetween(startDate,endDate);

        return contrats.stream().filter(x-> !x.getArchive()).map(x->x.getMontantContrat()).reduce(0,(sum,x) -> sum +x);
    }

    @Override
    public Integer nbContratsValides(Date startDate, Date endDate)
    {
        int i=0;
        List<Contrat> lc =retriveAllContrat();
        for (Contrat c:lc)
        {
            if(c.getDateDebutContrat().after(startDate) &&c.getDateFinContrat().before(endDate) && c.getArchive()==false)
            {
                i++;
            }
        }
        return i;
    }

}