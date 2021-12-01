public class rectangle {

    private float longueur1;
    private float largeur1;
    private float longueur2;
    private float largeur2;
    private Point RectPoint;


    public rectangle(Point D, float longueur , float largeur) {
        this.longueur1 = longueur;
        this.largeur1 = largeur;
        this.longueur2 = longueur;
        this.largeur2 = largeur;
        this.RectPoint = D
     }

   public rectangle(Point D, float longueur , float largeur,float longueur1 , float largeur2) {
        this.longueur1 = longueur1;
        this.largeur1 = largeur1;
        this.longueur2 = longueur2;
        this.largeur2 = largeur2;
        this.RectPoint = D
     }


     public rectangle(Point D, Point D1) {
      this.longueur1 = Math.abs(D.x - D1.x );
      this.largeur1 = Math.abs(D.y - D1.y );
      this.longueur2 = Math.abs(D.x - D1.x );
      this.largeur2 = Math.abs(D.y - D1.y );
     }




    public int Surface(){

        return (longueur1.getX() - largeur1.getY()) * (longueur1.getY()-largeur1.getX())
    }

    public int translation(int x,int y){
        this.x = this.x+x;
        this.y = this.y+y;

    }

    public Boolen contains( Point A){
        return((A.x>=RectPoint.x && A.y>RectPoint.y && (RectPoint.x+longueur1>=A.x && RectPoint.y+largeur1>=A.y)));
    }


}