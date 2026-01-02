package Models;
import java.util.ArrayList;
import DAOs.AirlineDAO;

public class Airline {
    String Name;
    int Id;
    Airline(String name, int id){
        this.Id=id;
        this.Name= name;
    }

    ArrayList<String>aboutAirline(){
        ArrayList<String> result = new ArrayList<>();
        result.add("Name: "+this.Name);
        result.add("Id: "+this.Id);

        return result;
    }
    public void addAircraft(Aircraft aircraft){
        AirlineDAO.addAircraft_toFleet(aircraft);
    }
}
 