package families;

import enums.PercussionMethod;

public abstract class Percussion extends Instrument{

    private PercussionMethod percussionMethod;

    public Percussion(String material, String colour, double buyingPrice, double sellingPrice, PercussionMethod percussionMethod) {
        super(material, colour, buyingPrice, sellingPrice);
        this.percussionMethod = percussionMethod;
    }

    public PercussionMethod getMethod() {
        return percussionMethod;
    }

    public String getMethodString(){
        return percussionMethod.getMethod();
    }
}
