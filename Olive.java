public class Olive implements Pizza {
    Pizza p;
    Olive(Pizza p){
        this.p=p;
    }
    public int getCost(){
        return p.getCost()+20;
    }
    public String getDescription(){
        return p.getDescription()+"Olive";
    }
}
