class BoundingBox {

    Point origin;
    int width;
    int height;

    public BoundingBox(Point _xy, int _w, int _h) {                                                      
        origin = _xy; 
        width = _w;
        height = _h;
    }
                                                                                      
    public boolean containsPoint(Point p) {
        return true;
    }

    public String toString() {
        String output = "";
        output += "Origin: " + origin + ", width: " + width + ", height: " + height;
        return output;
    }
}                                                                                          
