package exercice1;

public class RepresentantEtudiant {

 private static RepresentantEtudiant uniqueinstance=null;
  Etudiant etud;

  public RepresentantEtudiant()
  {}
 
  public static RepresentantEtudiant instance()
  {
    if (uniqueinstance==null)
    uniqueinstance=new RepresentantEtudiant();
    return uniqueinstance;
  }
  
 

  

}
