public class Paneer implements Pizza{
    Pizza p;
    Paneer(Pizza p){
        this.p=p;
    }
    public int getCost(){
        return p.getCost()+60;
    }
    public String getDescription(){
        return p.getDescription()+"Paneer";
    }
}
