package CompositeEntity;


public class Client {
    private CompositeEntity compEntity = new CompositeEntity();
    
    public void printData() {
        for (String s : compEntity.getData())
            System.out.println("Data - " + s);
    }
    
    public void setData(String data1, String data2) {
        compEntity.setData(data1, data2);
    }
}
