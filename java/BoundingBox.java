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

    public boolean overlaps(BoundingBox box) {
        // Test if the supplied bounding box and this bounding box overlap
        int left = this.origin.x;
        int right = this.origin.x + this.width;
        int top = this.origin.y;
        int bottom = this.origin.y + this.height;

        if ((box.origin.x > right) ||
            (box.origin.x+box.width < left) ||
            (box.origin.y > bottom) ||
            (box.origin.y+box.height  < top)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        String output = "";
        output += "Origin: " + origin + ", width: " + width + ", height: " + height;
        return output;
    }
}                                                                                          
