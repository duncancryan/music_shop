package families;

import methods.PercussionMethod;

public abstract class Percussion extends Instrument{

    private PercussionMethod method;

    public Percussion(String material, String colour, double buyingPrice, double sellingPrice, PercussionMethod method) {
        super(material, colour, buyingPrice, sellingPrice);
        this.method = method;
    }

    public PercussionMethod getMethod() {
        return method;
    }
}
