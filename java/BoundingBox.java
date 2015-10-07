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
        if (p.x >= origin.x && p.x < origin.x+width && p.y >= origin.y && p.y < origin.y+height) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String output = "";
        output += "Origin: " + origin + ", width: " + width + ", height: " + height;
        return output;
    }
}                                                                                          
