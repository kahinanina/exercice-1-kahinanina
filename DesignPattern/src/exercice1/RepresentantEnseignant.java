package exercice1;

public class RepresentantEnseignant {
	
	 private static RepresentantEnseignant uniqueinstance=null;
Enseignant ensg;
	  public RepresentantEnseignant()
	  {}
	 
	  public static RepresentantEnseignant instance()
	  {
	    if (uniqueinstance==null)
	    uniqueinstance=new RepresentantEnseignant();
	    return uniqueinstance;
	  }

}
