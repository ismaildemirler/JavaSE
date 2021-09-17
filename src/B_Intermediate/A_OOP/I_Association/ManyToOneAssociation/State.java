package B_Intermediate.A_OOP.I_Association.ManyToOneAssociation;

import java.util.List;

public class State {

	private String stateName;    
    private List<City> citys;
  
    public String getStateName() {
        return stateName;
    }
  
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
    public List<City> getCities() {
        return citys;
    }
    
    public void setState(List<City> citys) {
        this.citys = citys;
    }
}
