class Point {                                                                      
    int x;                                                                                 
    int y;                                                                                 
        
    // Point constructor   
    public Point(int _x, int _y) {                                                         
        x = _x;                                                                            
        y = _y;                                                                            
    }                                                                                      
        
    public String toString() {                                                               
        String output = ""; 
        output += "(" + x + ", " + y +")";                                                 
        return output;                                                                     
    }
    /*public int getData() {                                                               
        return data;                                                                       
    }                                                                                      

    public void setData(int d) {                                                           
        data = d;                                                                          
    }                                                                                      

    public Node getNext() {                                                                
        return next;                                                                       
    }                                                                                      
 
    public void setNext(Node n) {                                                          
        next = n;                                                                          
    }*/                                                                                    
} 
