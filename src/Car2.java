public class Car2 {
    private String model;
    public Car2(String model){
        this.model=model;
    }
    public boolean equal(Object obj){
        if(obj instanceof Car2){
            return model.equals(((Car2)obj).model);
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "모델 "+model;
    }
}
