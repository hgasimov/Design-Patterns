package CompositeEntity;

/* 
 * This is primary entity bean. It can be coarse grained or 
 * can contain a coarse grained object to be used for persistence purpose.
 */
public class CompositeEntity {
    CoarseGrainedObject cgo = new CoarseGrainedObject();
    
    public String[] getData() {
        return cgo.getData();
    }
    
    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }
}
