public class Cheese implements Pizza {
    Pizza p;
    Cheese(Pizza p){
        this.p=p;
    }
    public int getCost(){
        return p.getCost()+80;
    }
    public String getDescription(){
        return p.getDescription()+"Cheese";
    }
}
