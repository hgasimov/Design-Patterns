package CompositeEntity;

/*
 * This object contains dependent objects. It has its own life cycle and also 
 * manages life cycle of dependent objects.
 */
public class CoarseGrainedObject {
    DependentObject1 obj1 = new DependentObject1();
    DependentObject2 obj2 = new DependentObject2();
    
    public String[] getData() {
        return new String[] {obj1.getData(), obj2.getData()};
    }
    
    public void setData(String data1, String data2) {
        obj1.setData(data1);
        obj2.setData(data2);
    }
}
