package com.example.abouelhijafatma.Repositories;

import com.example.abouelhijafatma.Entities.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example,Integer> {

    public Example findByExampleEnum(Enum value);

    /*

    # JPQL Query
	@Query("SELECT COUNT(u) FROM Utilisateur u INNER JOIN Classe c on u.classe.codeClasse=c.codeClasse WHERE c.niveau = :niveau")
	public Integer countByClasseNiveauJPQL(@Param("niveau") Niveau niveau);

	# SQL Query
	@Query(value="SELECT COUNT(*) FROM Utilisateur u INNER JOIN Classe c on u.classe.codeClasse=c.codeClasse WHERE c.niveau = :niveau",nativeQuery =true)
	public Integer countByClasseNiveauSQL(@Param("niveau") Niveau niveau);

    # Find etudiant by nom and prenom
    public Etudiant findByNomEAndPrenomE(String prenomE, String nomE);

    # Find all etudiant by their departement id
    public List<Etudiant> findAllByDepartement_IdDep(int idDepartement);

    # Kaddem examples

     @Query("SELECT count(c) " +
            "FROM Contrat c " +
            "where ((c.archive=true) " +
            "and  ((c.dateDebutContrat < :startDate AND :endDate > :startDate )) " +
            "     or(c.dateFinContrat BETWEEN :startDate AND :endDate))")
    Integer getnbContratsValides(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    int countByArchiveIsTrueAndEtudiantIdEtudiant(int idEtudiant);

    # DATE BETWEEN TWO DATES
    int countByArchiveIsFalseAndDateDebutContratAfterAndDateFinContratBefore(LocalDate startDate, LocalDate endDate);

    List<Contrat> findByArchiveIsFalseAndSpecialiteAndEtudiantDepartement(Specialite specialite, Departement departement);

    List<Contrat> findByArchiveIsFalseAndEtudiantDepartement(Departement departement);

    List<Contrat> findByArchiveIsFalseAndDateFinContrat(LocalDate endDate);

    List<Contrat> findByArchiveIsFalse();

    # JPQL
    @Query("SELECT d " +
            "FROM Departement d " +
            "ORDER BY size(d.etudiants) DESC")
    List<Departement> getDepartementByStudentsNbrJPQL();

    # SQL
    @Query(value ="SELECT * "
            + "FROM Departement d "
            + "ORDER BY ((select COUNT(*) FROM assurance a WHERE a.beneficiaire_id = b.id)) DESC ", nativeQuery = true)
    List<Departement> getDepartementByStudentsNbrSQL();
    */

}
