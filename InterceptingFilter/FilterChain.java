package InterceptingFilter;

import java.util.ArrayList;
import java.util.List;


public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;
    
    public void addFiler(Filter filter) {
        filters.add(filter);
    }
    
    public void setTarget(Target target) {
        this.target = target;
    }
    
    public void execute(String request) {
        for (Filter f : filters)
            f.execute(request);
        
        target.execute(request);
    }    
}
