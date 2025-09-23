
class Point {

    private String nom;
    private int abs;
    private int ord;

    public Point(String nom, int abs, int ord) {
        this.nom = nom;
        this.abs = abs;
        this.ord = ord;
    }

    public Point(int abs, int ord) {
        this.nom = "vide";
        this.abs = abs;
        this.ord = ord;
    }

    public Point(String nom) {
        this.nom = nom;
        this.abs = 0;
        this.ord = 0;
    }

    public void Affiche() {
        System.out.println(nom + " (" + abs + ", " + ord + ")");
    }

    public void TranslHoriz(int a) {
        this.abs += a;
    }

    public void TranslVert(int a) {
        this.ord += a;
    }

    public void Translation(int a, int b) {
        this.abs += a;
        this.ord += b;
    }

    public boolean Coincide(Point p) {
        return this.abs == p.abs && this.ord == p.ord;
    }

    public String getNom() {
        return nom;
    }

    public int getAbscisse() {
        return abs;
    }

    public int getOrdonnée() {
        return ord;
    }

    public void setNom(String ch) {
        this.nom = ch;
    }

    public void setAbscisse(int a) {
        this.abs = a;
    }

    public void setOrdonnée(int a) {
        this.ord = a;
    }

    public static void main(String[] args) {
        Point p1;
        p1 = new Point(3, 5);
        Point p2 = new Point("a");
        Point p3 = new Point("b", 3, 5);

        System.out.println("\n ---------------------------\n");
        System.out.println("les points créés sont :");
        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n ---------------------------\n");
        if (p1.Coincide(p3)) {
            System.out.println("Les 2 points p1 et p3 coïncident");
        } else {
            System.out.println("Les 2 points ne coïncident pas");
        }

        System.out.println("\n ---------------------------\n");
        System.out.println("translation des points");
        p1.TranslHoriz(4);
        p2.TranslVert(3);
        p3.Translation(5, 2);
        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n ---------------------------\n");
        System.out.println("modification des attributs des points");
        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnée(50);
        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n ---------------------------\n");
        System.out.println("utilisation des méthodes get");
        String x = p1.getNom();
        int y = p1.getAbscisse();
        int z = p1.getOrdonnée();
        System.out.println(" le nom du point p1 est : " + x);
        System.out.println(" son abscisse est : " + y);
        System.out.println(" son ordonnée est : " + z);

    }

}
