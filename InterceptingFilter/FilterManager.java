package InterceptingFilter;


public class FilterManager {
    private FilterChain filterChain;
    
    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    
    public void setFilter(Filter f) {
        filterChain.addFiler(f);
    }
    
    public void filterRequest(String request) {
        filterChain.execute(request);
    }    
}
