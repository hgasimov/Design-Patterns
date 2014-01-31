package Filter;

import java.util.List;

public class AndCriteria implements Criteria {
    Criteria c1, c2;

    public AndCriteria(Criteria c1, Criteria c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> c1_people = c1.meetCriteria(persons);
        return c2.meetCriteria(c1_people);
    }
}