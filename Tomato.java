public class Tomato implements Pizza {
    Pizza p;
    Tomato(Pizza p){
        this.p=p;
    }
    public int getCost(){
        return p.getCost()+30;
    }
    public String getDescription(){
        return p.getDescription()+"Tomato";
    }
}
