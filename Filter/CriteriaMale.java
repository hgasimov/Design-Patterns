package Filter;

import java.util.ArrayList;
import java.util.List;


public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> males = new ArrayList<Person>();
        
        for (Person person: persons) 
            if (person.getGender().equalsIgnoreCase("MALE"))
                males.add(person);
        
        return males;
    }    
}
