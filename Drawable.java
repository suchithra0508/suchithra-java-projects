interface Drawable{
    public void draw();
}
     class without{
        public static void main(String []args){
        int width=10;
Drawable d=new Drawable() {
    public void draw(){
        System.out.println("Drawing"+width);
    }
};

Drawable d2=()->{
    System.out.println("Drawing"+width);

};
d.draw();
d2.draw();
    }
    
    }