package exercice13;

public class Representant {

 private static Representant uniqueinstance=null;
  Personne personne;

  public Representant()
  {}
 
  public static Representant instance()
  {
    if (uniqueinstance==null)
    uniqueinstance=new Representant();
    return uniqueinstance;
  }
  
 

  

}
