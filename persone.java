
class persone {

    // definition de attributs
    private String nom;
    private String prenom;
    private int age;
    private String sex;

    public persone() {
        this.nom = "med";
        this.prenom = "benali";
        this.age = 30;
        this.sex = "Male";

    }

    public persone(String nom, String prenom, int age, String sex) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sex = sex;

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void Affiche() {
        System.out.println("tous les information de persone est :" + nom + " " + prenom + " " + "le age :" + age + " " + "sex:" + sex);
    }

    public boolean sameLastname(persone p) {
        return this.prenom == p.prenom;
    }

    public static void main(String[] args) {
        persone p1 = new persone("ayoub", "lassoued", 25, "male");
        persone p2 = new persone("eya", "lassoued", 20, "fille");
        p1.Affiche();
        p2.Affiche();
        if (p1.sameLastname(p2)) {
            System.out.println("les deux personnes ont le même nom de famille");
        } else {
            System.out.println("les deux personnes n'est pas le meme nom de la famille");

        }
        if( p1.age > p2.age){
            System.out.println("le  persone p1 et plus age que la persone p2");
        }
        else {
            System.out.println("la persone p2 est plus age que la persone p1");
        }

    }
}
